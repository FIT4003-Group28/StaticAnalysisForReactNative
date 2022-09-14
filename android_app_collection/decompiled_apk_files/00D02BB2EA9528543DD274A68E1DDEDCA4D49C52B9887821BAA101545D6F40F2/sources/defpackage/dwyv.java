package defpackage;
/* compiled from: PG */
/* renamed from: dwyv  reason: default package */
/* loaded from: classes6.dex */
public final class dwyv extends dsqw<dwyv, dwys> implements dssk {
    public static final dwyv d;
    private static volatile dssr<dwyv> e;
    public int a;
    public int b;
    public dsri c = dsrx.b;

    static {
        dwyv dwyvVar = new dwyv();
        d = dwyvVar;
        dsqw.cc(dwyv.class, dwyvVar);
    }

    private dwyv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0014", new Object[]{"a", "b", dwyu.c(), "c"});
            }
            if (i2 == 3) {
                return new dwyv();
            }
            if (i2 == 4) {
                return new dwys();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwyv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwyv.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
