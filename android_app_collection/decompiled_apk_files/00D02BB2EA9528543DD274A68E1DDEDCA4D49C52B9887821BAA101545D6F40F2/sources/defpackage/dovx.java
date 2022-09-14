package defpackage;
/* compiled from: PG */
/* renamed from: dovx  reason: default package */
/* loaded from: classes6.dex */
public final class dovx extends dsqw<dovx, dovw> implements dssk {
    public static final dovx e;
    private static volatile dssr<dovx> g;
    public int a;
    public int c;
    public int d;
    private byte f = 2;
    public dsrj<dpjx> b = dssu.b;

    static {
        dovx dovxVar = new dovx();
        e = dovxVar;
        dsqw.cc(dovx.class, dovxVar);
    }

    private dovx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003ဌ\u0001", new Object[]{"a", "b", dpjx.class, "c", "d", dqvj.d()});
            }
            if (i2 == 3) {
                return new dovx();
            }
            if (i2 == 4) {
                return new dovw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dovx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dovx.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }

    public final void b() {
        dsrj<dpjx> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
