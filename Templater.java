import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author audrey
 * @since 7/4/16.
 */
@SuppressWarnings("unused")
public class Templater {
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private final Map<String, String> variables;
    private String template = "";

    public Templater(final String template) {
        variables = new HashMap<>();
        this.template = template;
    }

    public Templater setVariable(final String name, final String value) {
        variables.put(name, value);
        return this;
    }

    public Templater unsetVariable(final String name) {
        variables.remove(name);
        return this;
    }

    public String render() {
        if(template.isEmpty()) {
            throw new IllegalStateException("Can't render empty template!");
        }
        for(final Entry<String, String> stringStringEntry : variables.entrySet()) {
            template = template.replaceAll("\\$\\{" + stringStringEntry.getKey() + "\\}", stringStringEntry.getValue());
        }
        return template;
    }
}
