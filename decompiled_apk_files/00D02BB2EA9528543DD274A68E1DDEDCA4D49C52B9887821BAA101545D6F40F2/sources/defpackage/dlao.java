package defpackage;
/* compiled from: PG */
/* renamed from: dlao  reason: default package */
/* loaded from: classes6.dex */
public final class dlao extends dsqs<dlao, dlan> implements dsqt {
    public static final dlao a;
    private static volatile dssr<dlao> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dlao dlaoVar = new dlao();
        a = dlaoVar;
        dsqw.cc(dlao.class, dlaoVar);
    }

    private dlao() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dlao();
            }
            if (i2 == 4) {
                return new dlan();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dlao> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlao.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
