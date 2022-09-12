package defpackage;
/* compiled from: PG */
/* renamed from: dsef  reason: default package */
/* loaded from: classes6.dex */
public final class dsef extends dsqw<dsef, dsee> implements dssk {
    public static final dsef f;
    private static volatile dssr<dsef> g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        dsef dsefVar = new dsef();
        f = dsefVar;
        dsqw.cc(dsef.class, dsefVar);
    }

    private dsef() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", dsdg.a, "c", dsck.a, "d", dsci.a, "e", dsdy.a});
            }
            if (i2 == 3) {
                return new dsef();
            }
            if (i2 == 4) {
                return new dsee();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsef> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dsef.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
