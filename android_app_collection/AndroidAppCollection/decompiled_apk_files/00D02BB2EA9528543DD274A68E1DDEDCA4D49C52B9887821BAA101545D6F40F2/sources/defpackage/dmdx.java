package defpackage;
/* compiled from: PG */
/* renamed from: dmdx  reason: default package */
/* loaded from: classes6.dex */
public final class dmdx extends dsqw<dmdx, dmdw> implements dssk {
    public static final dmdx c;
    private static volatile dssr<dmdx> d;
    public int a = 0;
    public Object b;

    static {
        dmdx dmdxVar = new dmdx();
        c = dmdxVar;
        dsqw.cc(dmdx.class, dmdxVar);
    }

    private dmdx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", dmdv.class});
            }
            if (i2 == 3) {
                return new dmdx();
            }
            if (i2 == 4) {
                return new dmdw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmdx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmdx.class) {
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
