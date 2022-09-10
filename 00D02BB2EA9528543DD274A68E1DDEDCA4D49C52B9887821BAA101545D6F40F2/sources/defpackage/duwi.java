package defpackage;
/* compiled from: PG */
/* renamed from: duwi  reason: default package */
/* loaded from: classes.dex */
public final class duwi extends dsqw<duwi, duwh> implements dssk {
    public static final duwi d;
    private static volatile dssr<duwi> f;
    public boolean a;
    public int b = 3600;
    public int c;
    private int e;

    static {
        duwi duwiVar = new duwi();
        d = duwiVar;
        dsqw.cc(duwi.class, duwiVar);
    }

    private duwi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new duwi();
            }
            if (i2 == 4) {
                return new duwh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duwi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (duwi.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
