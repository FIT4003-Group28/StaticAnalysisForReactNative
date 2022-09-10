package defpackage;
/* compiled from: PG */
/* renamed from: dqsl  reason: default package */
/* loaded from: classes6.dex */
public final class dqsl extends dsqw<dqsl, dqsk> implements dssk {
    public static final dqsl c;
    private static volatile dssr<dqsl> d;
    public int a;
    public String b = "";

    static {
        dqsl dqslVar = new dqsl();
        c = dqslVar;
        dsqw.cc(dqsl.class, dqslVar);
    }

    private dqsl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dqsl();
            }
            if (i2 == 4) {
                return new dqsk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqsl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqsl.class) {
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
