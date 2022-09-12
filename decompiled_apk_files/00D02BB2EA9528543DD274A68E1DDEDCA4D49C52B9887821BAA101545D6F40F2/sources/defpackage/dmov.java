package defpackage;
/* compiled from: PG */
/* renamed from: dmov  reason: default package */
/* loaded from: classes.dex */
public final class dmov extends dsqw<dmov, dmou> implements dssk {
    public static final dmov d;
    private static volatile dssr<dmov> f;
    public int a;
    public dmmq c;
    private byte e = 2;
    public dsrj<dmpd> b = dssu.b;

    static {
        dmov dmovVar = new dmov();
        d = dmovVar;
        dsqw.cc(dmov.class, dmovVar);
    }

    private dmov() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"a", "b", dmpd.class, "c"});
            }
            if (i2 == 3) {
                return new dmov();
            }
            if (i2 == 4) {
                return new dmou();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dmov> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmov.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }

    public final void b() {
        dsrj<dmpd> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
