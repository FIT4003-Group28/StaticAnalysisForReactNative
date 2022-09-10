package defpackage;
/* compiled from: PG */
/* renamed from: domp  reason: default package */
/* loaded from: classes6.dex */
public final class domp extends dsqw<domp, domo> implements dssk {
    public static final domp c;
    private static volatile dssr<domp> e;
    public int a;
    public domd b;
    private int d;

    static {
        domp dompVar = new domp();
        c = dompVar;
        dsqw.cc(domp.class, dompVar);
    }

    private domp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", domm.a, "b"});
            }
            if (i2 == 3) {
                return new domp();
            }
            if (i2 == 4) {
                return new domo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<domp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (domp.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
