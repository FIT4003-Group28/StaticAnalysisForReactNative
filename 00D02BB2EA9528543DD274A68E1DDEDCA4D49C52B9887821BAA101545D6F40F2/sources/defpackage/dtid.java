package defpackage;
/* compiled from: PG */
/* renamed from: dtid  reason: default package */
/* loaded from: classes6.dex */
public final class dtid extends dsqw<dtid, dthy> implements dssk {
    public static final dtid d;
    private static volatile dssr<dtid> f;
    public int a;
    public int c;
    private byte e = 2;
    public dsrj<dtkx> b = dssu.b;

    static {
        dtid dtidVar = new dtid();
        d = dtidVar;
        dsqw.cc(dtid.class, dtidVar);
    }

    private dtid() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဌ\u0000", new Object[]{"a", "b", dtkx.class, "c", dtic.c()});
            }
            if (i2 == 3) {
                return new dtid();
            }
            if (i2 == 4) {
                return new dthy();
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
            dssr<dtid> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtid.class) {
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

    public final void c() {
        dsrj<dtkx> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
