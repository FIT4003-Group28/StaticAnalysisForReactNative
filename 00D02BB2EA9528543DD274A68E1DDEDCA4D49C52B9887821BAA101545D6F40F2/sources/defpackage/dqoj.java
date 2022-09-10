package defpackage;
/* compiled from: PG */
/* renamed from: dqoj  reason: default package */
/* loaded from: classes6.dex */
public final class dqoj extends dsqw<dqoj, dqoi> implements dssk {
    public static final dqoj c;
    private static volatile dssr<dqoj> d;
    public int a;
    public boolean b;

    static {
        dqoj dqojVar = new dqoj();
        c = dqojVar;
        dsqw.cc(dqoj.class, dqojVar);
    }

    private dqoj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dqoj();
            }
            if (i2 == 4) {
                return new dqoi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqoj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqoj.class) {
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
