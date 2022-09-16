package defpackage;
/* compiled from: PG */
/* renamed from: apjr  reason: default package */
/* loaded from: classes.dex */
public enum apjr implements aopm {
    AUTOTAG_VISIBILITY_STATE_UNSPECIFIED(0),
    AUTOTAG_VISIBILITY_STATE_VISIBLE(1),
    AUTOTAG_VISIBILITY_STATE_HIDDEN(2);
    
    private final int e;

    apjr(int i) {
        this.e = i;
    }

    public static aopo a() {
        return apiv.f;
    }

    public static apjr b(int i) {
        if (i != 0) {
            if (i == 1) {
                return AUTOTAG_VISIBILITY_STATE_VISIBLE;
            }
            if (i == 2) {
                return AUTOTAG_VISIBILITY_STATE_HIDDEN;
            }
            return null;
        }
        return AUTOTAG_VISIBILITY_STATE_UNSPECIFIED;
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
