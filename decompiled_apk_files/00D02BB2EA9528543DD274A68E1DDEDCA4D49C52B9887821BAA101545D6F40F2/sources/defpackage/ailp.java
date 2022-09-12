package defpackage;
/* compiled from: PG */
/* renamed from: ailp  reason: default package */
/* loaded from: classes2.dex */
public enum ailp implements dsrb {
    TYPE_UNSPECIFIED(0),
    RPC_IN_FLIGHT(1),
    RPC_SUCCEEDED(2),
    RPC_FAILED(3);
    
    public final int e;

    ailp(int i) {
        this.e = i;
    }

    public static ailp b(int i) {
        if (i != 0) {
            if (i == 1) {
                return RPC_IN_FLIGHT;
            }
            if (i == 2) {
                return RPC_SUCCEEDED;
            }
            if (i == 3) {
                return RPC_FAILED;
            }
            return null;
        }
        return TYPE_UNSPECIFIED;
    }

    public static dsrd c() {
        return ailo.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
