package defpackage;
/* compiled from: PG */
/* renamed from: ditx  reason: default package */
/* loaded from: classes6.dex */
public final class ditx extends dsqs<ditx, ditw> implements dsqt {
    public static final ditx d;
    private static volatile dssr<ditx> g;
    public Object b;
    public int c;
    private int e;
    public int a = 0;
    private byte f = 2;

    static {
        ditx ditxVar = new ditx();
        d = ditxVar;
        dsqw.cc(ditx.class, ditxVar);
    }

    private ditx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0001\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ြ\u0000\u0003ဌ\u0002\u0004ြ\u0000", new Object[]{"b", "a", "e", dnpq.class, "c", ditv.c(), dgfy.class});
            }
            if (i2 == 3) {
                return new ditx();
            }
            if (i2 == 4) {
                return new ditw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<ditx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ditx.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
