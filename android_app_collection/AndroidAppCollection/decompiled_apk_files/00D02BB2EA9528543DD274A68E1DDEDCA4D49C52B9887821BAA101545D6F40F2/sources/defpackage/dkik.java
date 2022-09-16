package defpackage;
/* compiled from: PG */
/* renamed from: dkik  reason: default package */
/* loaded from: classes6.dex */
public enum dkik implements dsrb {
    UNKNOWN_SAVING_BUTTON_LAYOUT_TYPE(0),
    ICON_ONLY(1),
    ICON_WITH_TEXT(2);
    
    private final int d;

    dkik(int i) {
        this.d = i;
    }

    public static dkik b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ICON_ONLY;
            }
            if (i == 2) {
                return ICON_WITH_TEXT;
            }
            return null;
        }
        return UNKNOWN_SAVING_BUTTON_LAYOUT_TYPE;
    }

    public static dsrd c() {
        return dkij.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
