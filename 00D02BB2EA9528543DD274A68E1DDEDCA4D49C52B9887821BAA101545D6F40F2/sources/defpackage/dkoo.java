package defpackage;
/* compiled from: PG */
/* renamed from: dkoo  reason: default package */
/* loaded from: classes6.dex */
public final class dkoo extends dsqw<dkoo, dkon> implements dssk {
    public static final dkoo b;
    private static volatile dssr<dkoo> d;
    public boolean a;
    private int c;

    static {
        dkoo dkooVar = new dkoo();
        b = dkooVar;
        dsqw.cc(dkoo.class, dkooVar);
    }

    private dkoo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkoo();
            }
            if (i2 == 4) {
                return new dkon();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkoo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkoo.class) {
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
