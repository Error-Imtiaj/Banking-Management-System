package Management_package;
import Accounts_package.accounts;

class customers {
    private String name;
    private int nid;
    accounts [] customerAccounts;

    protected void setName(String name){
        this.name = name;
    }
    protected void setNid(int nid){
        this.nid = nid;
    }

    protected String getName(){
        return this.name;
    }
    protected int getNid(){
        return this.nid;
    }

}
