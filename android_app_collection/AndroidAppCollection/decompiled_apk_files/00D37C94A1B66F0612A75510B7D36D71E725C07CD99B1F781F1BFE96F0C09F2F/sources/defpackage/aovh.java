package defpackage;
/* compiled from: PG */
/* renamed from: aovh  reason: default package */
/* loaded from: classes.dex */
public enum aovh implements aopm {
    ABOUT_THIS_AD_CALLBACK_ACTION_UNSPECIFIED(0),
    CLOSE(1),
    SKIP_AD(2),
    SKIP_AD_ON_CLOSE(3);
    
    private final int f;

    aovh(int i) {
        this.f = i;
    }

    public static aopo a() {
        return aotr.l;
    }

    public static aovh b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CLOSE;
            }
            if (i == 2) {
                return SKIP_AD;
            }
            if (i == 3) {
                return SKIP_AD_ON_CLOSE;
            }
            return null;
        }
        return ABOUT_THIS_AD_CALLBACK_ACTION_UNSPECIFIED;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
