import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test4 {
    public static void main(String[] args) {
        List<ChannelTypeEnum> channelTypeEnumList = new ArrayList<>();
        channelTypeEnumList.add(ChannelTypeEnum.NEW_HOUSE);
        channelTypeEnumList.add(ChannelTypeEnum.SECOND_HAND);
        channelTypeEnumList.add(ChannelTypeEnum.RENT);
        channelTypeEnumList.add(ChannelTypeEnum.OFFICE);
        channelTypeEnumList.add(ChannelTypeEnum.SHOP);

        List<ChannelTypeEnum> channelTypeEnumList2 = Arrays.asList(
                ChannelTypeEnum.NEW_HOUSE,
                ChannelTypeEnum.SECOND_HAND,
                ChannelTypeEnum.RENT,
                ChannelTypeEnum.OFFICE,
                ChannelTypeEnum.SHOP
        );
        System.out.println(channelTypeEnumList);
        System.out.println(channelTypeEnumList2);
        System.out.println(channelTypeEnumList.equals(channelTypeEnumList2));
    }
}
