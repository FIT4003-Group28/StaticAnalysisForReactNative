package defpackage;
/* compiled from: PG */
/* renamed from: dqwg  reason: default package */
/* loaded from: classes6.dex */
public final class dqwg extends dsqw<dqwg, dqwf> implements dssk {
    public static final dqwg c;
    private static volatile dssr<dqwg> d;
    public int a = 0;
    public Object b;

    static {
        dqwg dqwgVar = new dqwg();
        c = dqwgVar;
        dsqw.cc(dqwg.class, dqwgVar);
    }

    private dqwg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", dqxu.class});
            }
            if (i2 == 3) {
                return new dqwg();
            }
            if (i2 == 4) {
                return new dqwf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqwg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqwg.class) {
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
