package defpackage;
/* compiled from: PG */
/* renamed from: aecg  reason: default package */
/* loaded from: classes2.dex */
public final class aecg extends dsqw<aecg, aecf> implements dssk {
    public static final aecg f;
    private static volatile dssr<aecg> g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        aecg aecgVar = new aecg();
        f = aecgVar;
        dsqw.cc(aecg.class, aecgVar);
    }

    private aecg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဆ\u0001\u0003င\u0002\u0004ဌ\u0003", new Object[]{"a", "b", dktk.c(), "c", "d", "e", aeco.a});
            }
            if (i2 == 3) {
                return new aecg();
            }
            if (i2 == 4) {
                return new aecf();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aecg> dssrVar = g;
            if (dssrVar == null) {
                synchronized (aecg.class) {
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
