package defpackage;
/* compiled from: PG */
/* renamed from: dtwx  reason: default package */
/* loaded from: classes6.dex */
public final class dtwx extends dsqw<dtwx, dtww> implements dssk {
    public static final dtwx f;
    private static volatile dssr<dtwx> g;
    public String a = "";
    public dtsx b;
    public dtub c;
    public dtwv d;
    public dtuu e;

    static {
        dtwx dtwxVar = new dtwx();
        f = dtwxVar;
        dsqw.cc(dtwx.class, dtwxVar);
    }

    private dtwx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t\u0004\t\u0005\t", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dtwx();
            }
            if (i2 == 4) {
                return new dtww();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtwx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dtwx.class) {
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
