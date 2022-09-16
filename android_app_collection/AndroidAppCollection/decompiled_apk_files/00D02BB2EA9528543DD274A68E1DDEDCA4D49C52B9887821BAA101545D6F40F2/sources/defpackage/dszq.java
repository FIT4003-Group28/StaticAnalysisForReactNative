package defpackage;
/* compiled from: PG */
/* renamed from: dszq  reason: default package */
/* loaded from: classes6.dex */
public final class dszq extends dsqw<dszq, dszp> implements dssk {
    public static final dszq c;
    private static volatile dssr<dszq> d;
    public int a;
    public String b = "";

    static {
        dszq dszqVar = new dszq();
        c = dszqVar;
        dsqw.cc(dszq.class, dszqVar);
    }

    private dszq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dszq();
            }
            if (i2 == 4) {
                return new dszp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dszq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dszq.class) {
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
