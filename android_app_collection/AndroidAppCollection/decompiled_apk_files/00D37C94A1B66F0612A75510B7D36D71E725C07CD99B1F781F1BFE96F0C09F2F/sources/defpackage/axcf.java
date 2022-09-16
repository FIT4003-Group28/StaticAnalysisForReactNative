package defpackage;
/* compiled from: PG */
/* renamed from: axcf  reason: default package */
/* loaded from: classes2.dex */
public enum axcf implements aopm {
    TOUCH_STATE_UNSPECIFIED(0),
    START(1),
    MOVE(2),
    END(3),
    CANCEL(4);
    
    public final int f;

    axcf(int i) {
        this.f = i;
    }

    public static aopo a() {
        return axce.a;
    }

    public static axcf b(int i) {
        if (i != 0) {
            if (i == 1) {
                return START;
            }
            if (i == 2) {
                return MOVE;
            }
            if (i == 3) {
                return END;
            }
            if (i == 4) {
                return CANCEL;
            }
            return null;
        }
        return TOUCH_STATE_UNSPECIFIED;
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
