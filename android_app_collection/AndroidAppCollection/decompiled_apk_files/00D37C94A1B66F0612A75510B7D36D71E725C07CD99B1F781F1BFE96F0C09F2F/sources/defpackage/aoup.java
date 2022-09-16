package defpackage;
/* compiled from: PG */
/* renamed from: aoup  reason: default package */
/* loaded from: classes.dex */
public enum aoup implements aopm {
    UNKNOWN_COMPONENT_STYLE(0),
    LEGACY_COMPONENT_STYLE(1),
    GLIF_COMPONENT_STYLE(2),
    GM_COMPONENT_STYLE(3);
    
    public final int e;

    aoup(int i) {
        this.e = i;
    }

    public static aopo a() {
        return aotr.e;
    }

    public static aoup b(int i) {
        if (i != 0) {
            if (i == 1) {
                return LEGACY_COMPONENT_STYLE;
            }
            if (i == 2) {
                return GLIF_COMPONENT_STYLE;
            }
            if (i == 3) {
                return GM_COMPONENT_STYLE;
            }
            return null;
        }
        return UNKNOWN_COMPONENT_STYLE;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
