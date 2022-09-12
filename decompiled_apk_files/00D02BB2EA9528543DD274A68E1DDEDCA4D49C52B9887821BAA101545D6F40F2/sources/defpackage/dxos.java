package defpackage;
/* compiled from: PG */
/* renamed from: dxos  reason: default package */
/* loaded from: classes6.dex */
public enum dxos implements dsrb {
    UNKNOWN(0),
    CUSTOM_VALUE(1),
    TEXT(2),
    PHOTO(3),
    AUDIO(4),
    VIDEO(5),
    EVENT(6),
    RICH_TEXT(7),
    CHIPS_ONLY(8),
    RICH_CARD(9),
    UNRECOGNIZED(-1);
    
    private final int l;

    dxos(int i) {
        this.l = i;
    }

    public static dxos b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CUSTOM_VALUE;
            case 2:
                return TEXT;
            case 3:
                return PHOTO;
            case 4:
                return AUDIO;
            case 5:
                return VIDEO;
            case 6:
                return EVENT;
            case 7:
                return RICH_TEXT;
            case 8:
                return CHIPS_ONLY;
            case 9:
                return RICH_CARD;
            default:
                return null;
        }
    }

    @Override // defpackage.dsrb
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.l;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
