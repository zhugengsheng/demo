public enum ChannelTypeEnum  {
    NEW_HOUSE(1),
    SECOND_HAND(2),
    RENT(3),
    OFFICE(4),
    SHOP(5);

    private int value;

    private ChannelTypeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}