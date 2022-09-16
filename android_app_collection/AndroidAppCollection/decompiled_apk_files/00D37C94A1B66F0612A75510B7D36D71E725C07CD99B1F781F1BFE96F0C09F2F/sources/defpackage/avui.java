package defpackage;
/* compiled from: PG */
/* renamed from: avui  reason: default package */
/* loaded from: classes2.dex */
public enum avui implements aopm {
    UPLOAD_CREATION_FLOW_UNKNOWN(0),
    UPLOAD_CREATION_FLOW_LEGACY(1),
    UPLOAD_CREATION_FLOW_EXTERNAL(2),
    UPLOAD_CREATION_FLOW_SHORTS(3);
    
    public final int e;

    avui(int i) {
        this.e = i;
    }

    public static aopo a() {
        return avuh.a;
    }

    public static avui b(int i) {
        if (i != 0) {
            if (i == 1) {
                return UPLOAD_CREATION_FLOW_LEGACY;
            }
            if (i == 2) {
                return UPLOAD_CREATION_FLOW_EXTERNAL;
            }
            if (i == 3) {
                return UPLOAD_CREATION_FLOW_SHORTS;
            }
            return null;
        }
        return UPLOAD_CREATION_FLOW_UNKNOWN;
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
