package defpackage;
/* compiled from: PG */
/* renamed from: dqne  reason: default package */
/* loaded from: classes6.dex */
public final class dqne extends dsqw<dqne, dqnd> implements dssk {
    public static final dqne b;
    private static volatile dssr<dqne> d;
    public dpum a;
    private int c;

    static {
        dqne dqneVar = new dqne();
        b = dqneVar;
        dsqw.cc(dqne.class, dqneVar);
    }

    private dqne() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dqne();
            }
            if (i2 == 4) {
                return new dqnd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqne> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqne.class) {
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
