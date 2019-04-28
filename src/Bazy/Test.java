package Bazy;

import Bazy2.Database;
import Bazy2.OracleDB;

public class Test {
    public static void main(String[] args) {

        Test test = new Test();

        OracleDB oracleDB = new OracleDB();
        Database oracleDB2 = new OracleDB();


    }
    public void saveToDatabBase(Database database){
        database.save();
    }
}
