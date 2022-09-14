package defpackage;
/* compiled from: PG */
/* renamed from: dund  reason: default package */
/* loaded from: classes.dex */
public final class dund extends dsqw<dund, dunc> implements dssk {
    public static final dund c;
    private static volatile dssr<dund> f;
    private int d;
    private byte e = 2;
    public dsrj<dvgo> a = dssu.b;
    public dspd b = dspd.b;

    static {
        dund dundVar = new dund();
        c = dundVar;
        dsqw.cc(dund.class, dundVar);
    }

    private dund() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001Л\u0003ည\u0001", new Object[]{"d", "a", dvgo.class, "b"});
            }
            if (i2 == 3) {
                return new dund();
            }
            if (i2 == 4) {
                return new dunc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dund> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dund.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }

    public final void c() {
        dsrj<dvgo> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
