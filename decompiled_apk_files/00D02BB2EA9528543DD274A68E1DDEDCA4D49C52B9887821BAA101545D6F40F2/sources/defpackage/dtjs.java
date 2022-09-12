package defpackage;
/* compiled from: PG */
/* renamed from: dtjs  reason: default package */
/* loaded from: classes6.dex */
public enum dtjs implements dsrb {
    SOURCE(0),
    VIA(1),
    DESTINATION(2);
    
    public final int d;

    dtjs(int i) {
        this.d = i;
    }

    public static dtjs b(int i) {
        if (i != 0) {
            if (i == 1) {
                return VIA;
            }
            if (i == 2) {
                return DESTINATION;
            }
            return null;
        }
        return SOURCE;
    }

    public static dsrd c() {
        return dtjr.a;
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
