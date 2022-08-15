package ua.kyiv.sehal.springDIxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = 
        		new ClassPathXmlApplicationContext("applicationContext.xml");
    	/*
    	Window window = context.getBean("WindowBean", Window.class);
    	new House(window).view(); 
    		// ручное внедрение сами создали обьект доа и сами подсунули окно (но в xml файле можно изменить 
    		//класс (тип окна) и без перекомпиляции изменить окно)
    	 */
    	House house = context.getBean("HouseBean", House.class);
    	System.out.printf("Flor in house %-4d\n",house.getHeight());
    	house.buildWall(); 
    	// в файле applicationContext.xml добавили два бина ("BricksWallBean" и 
    	// WoodWallBean) чтобы изменить материал стен нужно в бине "HouseBean" 
    	//изменить  property name="Wall" ref="BricksWallBean"/> 
    	house.view();
    	MainWindow window = context.getBean(MainWindow.class); 
    	// 1) В файле applicationContext.xml 
    	// бин id="MainWindowBean" с указанием фабричного метода factory-method="getInstance
    	// для синглтона не нужен id вызывается напрямую из класса getBean(MainWindow.class)
    	// 2) В файле applicationContext.xml в bean id="MainWindowBean" добавлен атрибут 
    	// init-method="openConnection", вызывает метод openConnection() сразу после инициализации бинов 
    	// идет в начале в консоли затем выполняется остальной код.
    	// 3) В файле applicationContext.xml в bean id="MainWindowBean" добавлен атрибут 
    	// destroy-method="closeConnection" , вызывает указаный метод когда контейнер решает,
    	// что компонент больше не нужен вывод на консоль в конце.
    	window.show();
    	
    	
    	/* scope="singletone" - использует по умолчанию
    	 * singletone - синглтон не джавы а спринга он в рамках контекста, если содать новый 
    	 * контекст будет создат новый экземпляр класса 
    	 */
    	System.out.println("===================================================================");
    	System.out.println("В рамках одного контекста context один экзнмпляр бина");
    	House house1 = context.getBean("HouseBean", House.class);
    	System.out.println(house + "\n" + house1);
    	// создал новый контекст cont и в нем уже бин будет другим обьектом
    	System.out.println("===================================================================");
    	System.out.println("В разных контекстах context и cont разные экзнмпляры(обьекты) бина");
    	
    	ClassPathXmlApplicationContext cont = 
        		new ClassPathXmlApplicationContext("applicationContext.xml");
    	House houseCont = cont.getBean("HouseBean", House.class);
    	System.out.println(house + "\n" + houseCont);
    	
    	/*scope="prototype"
    	 * prototype - будет создавать столько экземпляров бина сколько раз будет вызван пример в
    	 * id="BricksWallBean" 
    	 */
    	System.out.println("===================================================================");
    	System.out.println("В рамках одного контекста context разные обьекты BricksWall благодаря scope=\"prototype\" ");
    	WallMaterial wall = context.getBean("BricksWallBean", BricksWall.class);
    	WallMaterial wall1 = context.getBean("BricksWallBean", BricksWall.class);
    	System.out.println(wall + "\n" + wall1);
    	context.close();
    	cont.close();
    	/*scope="session"
    	 * session - для WEB приложений для всех HTTP запросов от одного пользователя один обьект " 
    	 */
    	/*scope="request"
    	 * request - для WEB приложений для каждого HTTP запроса новый обьект 
    	 */
    	
    	
    }
}
