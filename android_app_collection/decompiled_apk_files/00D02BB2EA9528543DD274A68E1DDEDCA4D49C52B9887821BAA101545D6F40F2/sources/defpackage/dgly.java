package defpackage;
/* compiled from: PG */
/* renamed from: dgly  reason: default package */
/* loaded from: classes6.dex */
public final class dgly extends dsqw<dgly, dglx> implements dssk {
    public static final dgly c;
    private static volatile dssr<dgly> e;
    public String a = "";
    public dsrj<dgmg> b = dssu.b;
    private int d;

    static {
        dgly dglyVar = new dgly();
        c = dglyVar;
        dsqw.cc(dgly.class, dglyVar);
    }

    private dgly() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", dgmg.class});
            }
            if (i2 == 3) {
                return new dgly();
            }
            if (i2 == 4) {
                return new dglx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgly> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgly.class) {
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
