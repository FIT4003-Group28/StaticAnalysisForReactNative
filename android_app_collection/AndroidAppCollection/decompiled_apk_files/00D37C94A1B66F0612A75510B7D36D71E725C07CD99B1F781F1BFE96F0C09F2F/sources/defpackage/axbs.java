package defpackage;
/* compiled from: PG */
/* renamed from: axbs  reason: default package */
/* loaded from: classes2.dex */
public enum axbs implements aopm {
    KEYFRAME_LABEL_UNSPECIFIED(0),
    KEYFRAME_LABEL_START(1),
    KEYFRAME_LABEL_END(2);
    
    public final int d;

    axbs(int i) {
        this.d = i;
    }

    public static aopo a() {
        return axce.b;
    }

    public static axbs b(int i) {
        if (i != 0) {
            if (i == 1) {
                return KEYFRAME_LABEL_START;
            }
            if (i == 2) {
                return KEYFRAME_LABEL_END;
            }
            return null;
        }
        return KEYFRAME_LABEL_UNSPECIFIED;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
