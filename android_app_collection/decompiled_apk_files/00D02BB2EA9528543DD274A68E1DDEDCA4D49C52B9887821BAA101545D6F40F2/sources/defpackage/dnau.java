package defpackage;
/* compiled from: PG */
/* renamed from: dnau  reason: default package */
/* loaded from: classes.dex */
public final class dnau extends dsqw<dnau, dnat> implements dssk {
    public static final dnau a;
    private static volatile dssr<dnau> e;
    private int b;
    private dnhs c;
    private byte d = 2;

    static {
        dnau dnauVar = new dnau();
        a = dnauVar;
        dsqw.cc(dnau.class, dnauVar);
    }

    private dnau() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dnau();
            }
            if (i2 == 4) {
                return new dnat();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dnau> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnau.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
