package defpackage;
/* compiled from: PG */
/* renamed from: dzzw  reason: default package */
/* loaded from: classes6.dex */
public enum dzzw implements dsrb {
    UNKNOWN(0),
    CRONET(1);
    
    public final int c;

    dzzw(int i) {
        this.c = i;
    }

    public static dzzw b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CRONET;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return dzzv.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
