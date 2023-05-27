import java.util.ArrayList;

/**
 * Book cathegory.
 * @author Gökberk Altıparmak
 * @version v1.0 19.04.2021
 */

public class SearchProduct
{
    private ArrayList<String> productName;
    private String searchedProduct;
    
    SearchProduct( String searchedProduct )
    {
        this.searchedProduct = searchedProduct;
        productName = getNameSeperately( searchedProduct );
    }
    
    public void getNameSeperately()
    {
        String name;
        String addToArray;
        name = this.searchedProduct;
        addToArray = "";
        
        for ( int i = 0; i < name.length(); i++ )
        {
            if ( name.charAt( i ) != ' ' )
            {
                addToArray += name.charAt( i );
            }
            else 
            {
                productName.add( addToArray );
                addToArray = "";
            }
        }
    }
    
    public ArrayList<String> getNameSeperately( String str )
    {
        ArrayList<String> arr = new ArrayList<>();
        String addToArray;
        addToArray = "";
        
        for ( int i = 0; i < str.length(); i++ )
        {
            if ( str.charAt( i ) != ' ' )
            {
                addToArray += str.charAt( i );
            }
            else 
            {
                arr.add( addToArray );
                addToArray = "";
            }
        }
        return arr;
    }
    
    public boolean checkForSameWords( ArrayList<Item> allItems )
    {
        ArrayList<String> arr;
        for ( int i = 0; i < allItems.size(); i++ )
        {
            arr = getNameSeperately( allItems.get( i ).getName() );
            for ( int j = 0; j < productName.size(); j++ ) 
            {
                for ( int k = 0; k < arr.size(); k++ )
                {
                    if ( arr.get( k ).equalsIgnoreCase( productName.get( j ) ) );
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
