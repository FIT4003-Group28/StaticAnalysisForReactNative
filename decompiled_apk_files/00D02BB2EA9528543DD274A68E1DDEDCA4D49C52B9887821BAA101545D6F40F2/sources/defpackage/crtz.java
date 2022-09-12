package defpackage;
/* compiled from: PG */
/* renamed from: crtz  reason: default package */
/* loaded from: classes5.dex */
public enum crtz implements dsrb {
    UNKNOWN_REASON(0),
    DIRECT_UPLOAD(1),
    PHOTOSERVICE_EXISTED(2);
    
    public final int d;

    crtz(int i) {
        this.d = i;
    }

    public static crtz b(int i) {
        if (i != 0) {
            if (i == 1) {
                return DIRECT_UPLOAD;
            }
            if (i == 2) {
                return PHOTOSERVICE_EXISTED;
            }
            return null;
        }
        return UNKNOWN_REASON;
    }

    public static dsrd c() {
        return crty.a;
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
