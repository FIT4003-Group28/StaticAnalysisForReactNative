package defpackage;
/* compiled from: PG */
/* renamed from: dkgf  reason: default package */
/* loaded from: classes6.dex */
public final class dkgf extends dsqw<dkgf, dkge> implements dssk {
    public static final dkgf c;
    private static volatile dssr<dkgf> d;
    public dsrj<dkgh> a = dssu.b;
    public dsrj<dkgd> b = dssu.b;

    static {
        dkgf dkgfVar = new dkgf();
        c = dkgfVar;
        dsqw.cc(dkgf.class, dkgfVar);
    }

    private dkgf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0002\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", dkgh.class, "b", dkgd.class});
            }
            if (i2 == 3) {
                return new dkgf();
            }
            if (i2 == 4) {
                return new dkge();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkgf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkgf.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
