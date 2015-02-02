public abstract class DefenseDecorator extends Defense
{
   protected Defense defRef;
  
//CONSTRUCTORS---------------------------------------------------------------------------
   
   public DefenseDecorator(String n, String desc, Defense def)//Method used for decorating Defense objects
   {
      super(n, desc);
      this.defRef = def;
   }

//GETS & SETS----------------------------------------------------------------------------



//CLASS-LEVEL METHODS--------------------------------------------------------------------

}
