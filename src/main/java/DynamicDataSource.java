import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by miaoying on 12/18/17.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return null;
    }
}
