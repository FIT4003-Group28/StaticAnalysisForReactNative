package defpackage;
/* compiled from: PG */
/* renamed from: dhjx  reason: default package */
/* loaded from: classes.dex */
public final class dhjx extends dsqw<dhjx, dhjw> implements dssk {
    public static final dhjx f;
    private static volatile dssr<dhjx> g;
    public int a;
    public dhjz b;
    public dhkb c;
    public dhkd d;
    public float e;

    static {
        dhjx dhjxVar = new dhjx();
        f = dhjxVar;
        dsqw.cc(dhjx.class, dhjxVar);
    }

    private dhjx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ခ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dhjx();
            }
            if (i2 == 4) {
                return new dhjw();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhjx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhjx.class) {
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
