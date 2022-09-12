package defpackage;
/* compiled from: PG */
/* renamed from: dmqx  reason: default package */
/* loaded from: classes.dex */
public final class dmqx extends dsqs<dmqx, dmqt> implements dsqt {
    public static final dmqx e;
    private static volatile dssr<dmqx> h;
    public long a;
    public dmsp d;
    private int f;
    private byte g = 2;
    public dsrj<dmop> b = dssu.b;
    public dsrj<dmqw> c = dssu.b;

    static {
        dmqx dmqxVar = new dmqx();
        e = dmqxVar;
        dsqw.cc(dmqx.class, dmqxVar);
    }

    private dmqx() {
    }

    public static dmqt c() {
        return (dmqt) e.bZ();
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0002\u0001စ\u0000\u0002Л\u0005Л\u0006ဉ\u0003", new Object[]{"f", "a", "b", dmop.class, "c", dmqw.class, "d"});
            }
            if (i2 == 3) {
                return new dmqx();
            }
            if (i2 == 4) {
                return new dmqt();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dmqx> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dmqx.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }

    public final void b() {
        dsrj<dmop> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
