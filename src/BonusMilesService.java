public class BonusMilesService {
   int calculate(int ticketPrise)
   {
       int bonusParam = 20; //количество рублей для одной бонусной мили

       int miles = ticketPrise / bonusParam;

       return miles;
   }
}
