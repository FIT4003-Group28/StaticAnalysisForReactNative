package defpackage;
/* compiled from: PG */
/* renamed from: cbtq  reason: default package */
/* loaded from: classes4.dex */
public final class cbtq extends dsqw<cbtq, cbtp> implements dssk {
    public static final cbtq c;
    private static volatile dssr<cbtq> d;
    public int a;
    public cbtv b;

    static {
        cbtq cbtqVar = new cbtq();
        c = cbtqVar;
        dsqw.cc(cbtq.class, cbtqVar);
    }

    private cbtq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cbtq();
            }
            if (i2 == 4) {
                return new cbtp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cbtq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cbtq.class) {
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
