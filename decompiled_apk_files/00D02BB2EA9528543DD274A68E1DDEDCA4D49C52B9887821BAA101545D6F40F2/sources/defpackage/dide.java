package defpackage;
/* compiled from: PG */
/* renamed from: dide  reason: default package */
/* loaded from: classes6.dex */
public final class dide extends dsqw<dide, didd> implements dssk {
    public static final dide b;
    private static volatile dssr<dide> d;
    public dqcd a;
    private int c;

    static {
        dide dideVar = new dide();
        b = dideVar;
        dsqw.cc(dide.class, dideVar);
    }

    private dide() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dide();
            }
            if (i2 == 4) {
                return new didd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dide> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dide.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
