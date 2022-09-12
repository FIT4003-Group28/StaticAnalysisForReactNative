package defpackage;
/* compiled from: PG */
/* renamed from: drgv  reason: default package */
/* loaded from: classes6.dex */
public final class drgv extends dsqw<drgv, drgs> implements dssk {
    public static final drgv c;
    private static volatile dssr<drgv> d;
    public int a;
    public drgu b;

    static {
        drgv drgvVar = new drgv();
        c = drgvVar;
        dsqw.cc(drgv.class, drgvVar);
    }

    private drgv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new drgv();
            }
            if (i2 == 4) {
                return new drgs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drgv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drgv.class) {
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
