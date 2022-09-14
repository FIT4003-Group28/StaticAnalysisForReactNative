package defpackage;
/* compiled from: PG */
/* renamed from: dqwv  reason: default package */
/* loaded from: classes6.dex */
public final class dqwv extends dsqw<dqwv, dqwu> implements dssk {
    public static final dqwv c;
    private static volatile dssr<dqwv> d;
    public int a;
    public int b;

    static {
        dqwv dqwvVar = new dqwv();
        c = dqwvVar;
        dsqw.cc(dqwv.class, dqwvVar);
    }

    private dqwv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqwx.c()});
            }
            if (i2 == 3) {
                return new dqwv();
            }
            if (i2 == 4) {
                return new dqwu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqwv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqwv.class) {
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
