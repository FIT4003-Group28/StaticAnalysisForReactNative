package defpackage;
/* compiled from: PG */
/* renamed from: dlxy  reason: default package */
/* loaded from: classes6.dex */
public final class dlxy extends dsqw<dlxy, dlxt> implements dssk {
    public static final dlxy c;
    private static volatile dssr<dlxy> g;
    public Object b;
    private int d;
    private dnqh e;
    public int a = 0;
    private byte f = 2;

    static {
        dlxy dlxyVar = new dlxy();
        c = dlxyVar;
        dsqw.cc(dlxy.class, dlxyVar);
    }

    private dlxy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ြ\u0000\u0002ြ\u0000\u0003ᐉ\u0002", new Object[]{"b", "a", "d", dlxv.class, dlxx.class, "e"});
            }
            if (i2 == 3) {
                return new dlxy();
            }
            if (i2 == 4) {
                return new dlxt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dlxy> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlxy.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
