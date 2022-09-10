package defpackage;
/* compiled from: PG */
/* renamed from: dder  reason: default package */
/* loaded from: classes.dex */
public final class dder extends dsqw<dder, ddeq> implements dssk {
    public static final dder a;
    private static volatile dssr<dder> e;
    private int b;
    private dtbk c;
    private byte d = 2;

    static {
        dder dderVar = new dder();
        a = dderVar;
        dsqw.cc(dder.class, dderVar);
    }

    private dder() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dder();
            }
            if (i2 == 4) {
                return new ddeq();
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
            dssr<dder> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dder.class) {
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
