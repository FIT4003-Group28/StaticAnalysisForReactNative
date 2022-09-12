package defpackage;
/* compiled from: PG */
/* renamed from: dwrm  reason: default package */
/* loaded from: classes6.dex */
public enum dwrm implements dsrb {
    UNKNOWN_BLOCK_TYPE(0),
    TITLE(1),
    PARAGRAPH(2),
    BUSINESS_HOURS(3),
    BOOLEAN_INPUT(4),
    STRING_INPUT(5),
    IMAGES(6),
    MAP_PRESENTATION_TOGGLE_BUTTON(7);
    
    public final int i;

    dwrm(int i) {
        this.i = i;
    }

    public static dwrm b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_BLOCK_TYPE;
            case 1:
                return TITLE;
            case 2:
                return PARAGRAPH;
            case 3:
                return BUSINESS_HOURS;
            case 4:
                return BOOLEAN_INPUT;
            case 5:
                return STRING_INPUT;
            case 6:
                return IMAGES;
            case 7:
                return MAP_PRESENTATION_TOGGLE_BUTTON;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dwrl.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
