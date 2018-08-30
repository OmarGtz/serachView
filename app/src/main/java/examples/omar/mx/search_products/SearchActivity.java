package examples.omar.mx.search_products;

import android.app.SearchManager;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity implements SearchView.OnSuggestionListener, SearchView.OnQueryTextListener, View.OnClickListener {


    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initView();
        addListeners();
    }

    public void initView(){
        searchView = findViewById(R.id.products_search_view);
    }

    public void addListeners(){
        searchView.setIconifiedByDefault(false);
        searchView.setOnSuggestionListener(this);
        searchView.setOnQueryTextListener(this);
        searchView.setOnSearchClickListener(this);
        searchView.setSuggestionsAdapter(new SimpleCursorAdapter(
                this, android.R.layout.simple_list_item_1, null,
                new String[] { SearchManager.SUGGEST_COLUMN_TEXT_1 },
                new int[] { android.R.id.text1 }));

    }



    @Override
    public boolean onSuggestionSelect(int position) {

        Toast.makeText(this,"onSugestionSelect",Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onSuggestionClick(int position) {

        Toast.makeText(this,"onSugestionClick",Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {

        Toast.makeText(this,"onQuerySubmit",Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {

        Toast.makeText(this,"onQueryTextChanged",Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public void onClick(View v) {

        Toast.makeText(this,"onSearchClick",Toast.LENGTH_SHORT).show();

    }
}
