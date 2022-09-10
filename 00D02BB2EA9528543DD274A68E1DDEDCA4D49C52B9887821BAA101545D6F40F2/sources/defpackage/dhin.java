package defpackage;
/* compiled from: PG */
/* renamed from: dhin  reason: default package */
/* loaded from: classes6.dex */
public final class dhin extends dsqw<dhin, dhik> implements dssk {
    public static final dhin c;
    private static volatile dssr<dhin> d;
    public int a;
    public int b;

    static {
        dhin dhinVar = new dhin();
        c = dhinVar;
        dsqw.cc(dhin.class, dhinVar);
    }

    private dhin() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dhim.c()});
            }
            if (i2 == 3) {
                return new dhin();
            }
            if (i2 == 4) {
                return new dhik();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhin> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhin.class) {
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
