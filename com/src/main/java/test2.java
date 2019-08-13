import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class test2 {
    public static void main(String[] args) {
        String msg = "{\"unityId\":\"102035915\",\"action\":\"display\",\"type\":1,\"columns\":[\"new_house_show_name\", \"community_amap_l\"]}";

        System.out.println(msg);
        JsonNode jsonNode = null;
        try {
            jsonNode = new ObjectMapper().readTree(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Long unityId = jsonNode.get("unityId").asLong();
        System.out.println(unityId);
        String action = jsonNode.get("action").asText();
        System.out.println(action);
        int type = jsonNode.get("type").asInt();
        System.out.println(type);
        JsonNode columnsJsonNode = jsonNode.get("columns");
        List<String> columns = new ArrayList<>();
        if(columnsJsonNode.isArray()) {
            for (JsonNode node : columnsJsonNode) {
                columns.add(node.asText());
            }
        }
        boolean gisChanged = false;
        if(columns.contains("community_amap_lat") || columns.contains("community_amap_lng") || columns.contains("community_bmap_lat") || columns.contains("community_bmap_lng")){
            gisChanged = true;
        }
        System.out.println(gisChanged);
/*        System.out.println(columns);
        System.out.println(columns.length());
        String[] columnsList = columns.substring(1,columns.length()-1).split(",");*/

      /*  System.out.println(columnsList.toString());*/
    }
}
