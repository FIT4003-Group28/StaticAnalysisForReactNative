package defpackage;
/* compiled from: PG */
/* renamed from: dtzt  reason: default package */
/* loaded from: classes.dex */
public final class dtzt extends dsqw<dtzt, dtzr> implements dssk {
    public static final dsrg<Integer, dtzs> e = new dtzq();
    public static final dtzt f;
    private static volatile dssr<dtzt> g;
    public String a = "";
    public String b = "";
    public String c = "";
    public dsrf d = dsqz.b;

    static {
        dtzt dtztVar = new dtzt();
        f = dtztVar;
        dsqw.cc(dtzt.class, dtztVar);
    }

    private dtzt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004,", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtzt();
            }
            if (i2 == 4) {
                return new dtzr();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtzt> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dtzt.class) {
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
