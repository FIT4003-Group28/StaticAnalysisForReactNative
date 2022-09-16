package defpackage;
/* compiled from: PG */
/* renamed from: dhxw  reason: default package */
/* loaded from: classes.dex */
public final class dhxw extends dsqw<dhxw, dhxv> implements dssk {
    public static final dhxw d;
    private static volatile dssr<dhxw> e;
    public int a;
    public int b;
    public dsrj<dhxz> c = dssu.b;

    static {
        dhxw dhxwVar = new dhxw();
        d = dhxwVar;
        dsqw.cc(dhxw.class, dhxwVar);
    }

    private dhxw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", dpwr.c(), "c", dhxz.class});
            }
            if (i2 == 3) {
                return new dhxw();
            }
            if (i2 == 4) {
                return new dhxv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhxw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhxw.class) {
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

    public final void b() {
        dsrj<dhxz> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }
}
