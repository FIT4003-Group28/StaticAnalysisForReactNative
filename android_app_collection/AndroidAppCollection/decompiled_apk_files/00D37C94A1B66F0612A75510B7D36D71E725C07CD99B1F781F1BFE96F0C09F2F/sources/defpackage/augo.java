package defpackage;
/* compiled from: PG */
/* renamed from: augo  reason: default package */
/* loaded from: classes2.dex */
public enum augo implements aopm {
    PRESENTATION_STYLE_UNKNOWN(0),
    PRESENTATION_STYLE_PUSH(1),
    PRESENTATION_STYLE_MODAL(2);
    
    private final int e;

    augo(int i) {
        this.e = i;
    }

    public static aopo a() {
        return auca.n;
    }

    public static augo b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PRESENTATION_STYLE_PUSH;
            }
            if (i == 2) {
                return PRESENTATION_STYLE_MODAL;
            }
            return null;
        }
        return PRESENTATION_STYLE_UNKNOWN;
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
