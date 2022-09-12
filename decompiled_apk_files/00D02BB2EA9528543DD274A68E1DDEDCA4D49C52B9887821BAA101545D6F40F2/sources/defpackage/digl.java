package defpackage;
/* compiled from: PG */
/* renamed from: digl  reason: default package */
/* loaded from: classes6.dex */
public final class digl extends dsqw<digl, digk> implements dssk {
    public static final digl c;
    private static volatile dssr<digl> d;
    public int a;
    public dggi b;

    static {
        digl diglVar = new digl();
        c = diglVar;
        dsqw.cc(digl.class, diglVar);
    }

    private digl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new digl();
            }
            if (i2 == 4) {
                return new digk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<digl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (digl.class) {
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
