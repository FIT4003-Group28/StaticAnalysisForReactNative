package defpackage;
/* compiled from: PG */
/* renamed from: djgw  reason: default package */
/* loaded from: classes6.dex */
public final class djgw extends dsqw<djgw, djgp> implements dssk {
    public static final djgw d;
    private static volatile dssr<djgw> e;
    public dsrj<djgs> a = dssu.b;
    public dsrj<djgo> b = dssu.b;
    public dsrj<djgv> c = dssu.b;

    static {
        djgw djgwVar = new djgw();
        d = djgwVar;
        dsqw.cc(djgw.class, djgwVar);
    }

    private djgw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0004\u001b", new Object[]{"a", djgs.class, "b", djgo.class, "c", djgv.class});
            }
            if (i2 == 3) {
                return new djgw();
            }
            if (i2 == 4) {
                return new djgp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djgw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djgw.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
