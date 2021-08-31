package routines;

/*
 * user specification: the function's comment should contain keys as follows: 1. write about the function's comment.but
 * it must be before the "{talendTypes}" key.
 * 
 * 2. {talendTypes} 's value must be talend Type, it is required . its value should be one of: String, char | Character,
 * long | Long, int | Integer, boolean | Boolean, byte | Byte, Date, double | Double, float | Float, Object, short |
 * Short
 * 
 * 3. {Category} define a category for the Function. it is required. its value is user-defined .
 * 
 * 4. {param} 's format is: {param} <type>[(<default value or closed list values>)] <name>[ : <comment>]
 * 
 * <type> 's value should be one of: string, int, list, double, object, boolean, long, char, date. <name>'s value is the
 * Function's parameter name. the {param} is optional. so if you the Function without the parameters. the {param} don't
 * added. you can have many parameters for the Function.
 * 
 * 5. {example} gives a example for the Function. it is optional.
 */
public class Agg_Class_Methods {

    /**
     * helloExample: not return value, only print "hello" + message.
     * 
     * 
     * {talendTypes} String
     * 
     * {Category} User Defined
     * 
     * {param} string("world") input: The string need to be printed.
     * 
     * {example} helloExemple("world") # hello world !.
     */
	public static boolean is_double_null(double val)
	{
		System.out.println("**");
		boolean result = false;
		try
		{
			double rs = val/2;
			result = true;
		}
		catch(NullPointerException ex)
		{
			System.out.println("++");
			result = false;
		}
		System.out.println("**");
		return result;
	}
    public static void helloExample(String message) {
        if (message == null) {
            message = "World"; //$NON-NLS-1$
        }
        System.out.println("Hello " + message + " !"); //$NON-NLS-1$ //$NON-NLS-2$
    }
    
    public static double string_to_double(String to_handle)
    {
    	double result = 0.0;
    	if(!to_handle.equals(null) && !to_handle.equals("")&& !to_handle.contains("?"))
    	{
    	try {
    		result = Double.parseDouble(to_handle);
    	}
    	catch(NullPointerException ex)
    	{
    		//result = 0.0;
    		ex.printStackTrace();
    	}
    	}
    	return result;
    }
    
    public static int string_to_int(String to_handle)
    {
    	int result = 0;
    	if(!to_handle.equals(null) || !to_handle.equals(""))
    	{
    	try {
    		result = Integer.parseInt(to_handle);
    	}
    	catch(NullPointerException ex)
    	{
    		result = 0;
    	}
    	}
    	return result;
    }
    public static double Calculate_actual_perf(int Direction , double Actual_Value , double Target)
    {
    	double Result = 0.0;
    	try
    	{
    	//double Actual = string_to_double(Actual_Value);
    	//double Trgt = string_to_double(Target);
    	//int DIR = string_to_int(Direction);
    	if(Direction == 1 )
    	{
    		Result = Actual_Value/Target;
    	}
    	else
    	{
    		Result = Target/Actual_Value;
    	}
    	}
    	catch(NullPointerException ex)
    	{
    		ex.printStackTrace();
    	}
    	return Result;
    }
    
    public static double Calculate_adj_score(double Actual_Per, double Weight, double applied_per_adj)
	{
    	try 
    	{
			double Score = 0.0;
			//Double Actual_Per = string_to_double(Actual);
	    	//Double weig = string_to_double(Weight);
	    	//Double APA = string_to_double(applied_per_adj);
			Actual_Per = Actual_Per>1 ? 1 : Actual_Per;
	    	Score = Actual_Per * Weight;
	    	double adj_score =0.0;
	    	//double applied_per_adj = string_to_double(applied_per_adj);
	    	adj_score = (( Weight * applied_per_adj ) + Score); //adj_score = Math.round((( Weight * applied_per_adj ) + Score)*100.00 *100.00)/100.00;
	    	Weight = Weight; //Weight = Math.round(Weight * 100.00*100.00)/100.00;
	    	//System.out.println(Actual_Per + " " + Score + " " ); 
	    	return Weight <= adj_score ? Weight : adj_score ;
    	}
    	catch(Exception ex)
    	{
    		return 0.0;
    	}
	}
    
    public static double ooCalculate_adj_score(String Weight, double Score, String applied_per_adj)
    {
    	//double adj_score =0.0;
    	//Double apa = string_to_double(applied_per_adj);
    	//Double weig = string_to_double(Weight);
    	//adj_score = ( weig * apa ) + Score;
    	return 0.0;
    }
    
    public static String Calculate_distance_from_target(double Val, double Pro_Target, int Dir)
    {
    	//double zero=0.0;
    	try 
    	{
    		
    		if(Dir==1)
        	{
        		return (Val-Pro_Target)/Val+"";
        	}
        	else
        	{
        		return  (Pro_Target-Val)/Val+"";
        	}
    	}
    	catch(NullPointerException ex)
    	{
    		ex.printStackTrace();
    		System.out.println("");
    		return "";
    	}
    }

    public static String Calculate_differnce(double Current_M_Or_W_Val, double Pervious_M_Or_W_Val, int Dir)
    {
    	try 
    	{    		
    		if(Dir==1)
        	{
        		return (Current_M_Or_W_Val-Pervious_M_Or_W_Val)/Current_M_Or_W_Val+"";
        	}
        	else
        	{
        		return  (Pervious_M_Or_W_Val-Current_M_Or_W_Val)/Current_M_Or_W_Val+"";
        	}
    	}
    	catch(NullPointerException ex)
    	{
    		ex.printStackTrace();
    		System.out.println("");
    		return "";
    	}
    }
    
    public static double jou_stage_angle(String js )
    {
    	double res = 0.0;
    	if(js.equals("Engaging"))
    	{
    		res =82.0 ;
    	}
    	else if (js.equals("Using"))
    	{
    		res =215.0 ;
    	}
    	else 
    	{
    		res =63.0 ;
    	}
    	return res;
    }
    public static int [] last_avaliable_month(int weekly_year, int weekly_month,int monthLU_last_year, int monthLU_last_month)
    {
    	int[] last_avaliable_month = {weekly_year, weekly_month};
    	if(weekly_year > monthLU_last_year) {
    		last_avaliable_month[0] = monthLU_last_year;
    		last_avaliable_month[1] = monthLU_last_month;
    	}
    	else {
        	if(weekly_month > monthLU_last_month) {
        		last_avaliable_month[0] = monthLU_last_year;
        		last_avaliable_month[1] = monthLU_last_month;
        	}
        	else {
        		if(weekly_month == 1) {
        			last_avaliable_month[0] = weekly_year - 1;
            		last_avaliable_month[1] = 12;
        		}
        		else {
            		last_avaliable_month[1] = weekly_month - 1;
        		}
        	}
    	}
    	return last_avaliable_month;
    }
    
    
}
	