package Management_package;
import java.util.ArrayList;

import Accounts_package.accounts;

public class customers {
    private String name;
    private int nid;
    public ArrayList<accounts>  customerAccounts;

    protected void setName(String name){
        this.name = name;
    }
    protected void setNid(int nid){
        this.nid = nid;
    }

    public String getName(){
        return this.name;
    }
    public int getNid(){
        return this.nid;
    }





}
