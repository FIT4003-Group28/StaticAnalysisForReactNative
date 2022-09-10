package defpackage;
/* compiled from: PG */
/* renamed from: dmqz  reason: default package */
/* loaded from: classes6.dex */
public final class dmqz extends dsqw<dmqz, dmqy> implements dssk {
    public static final dmqz c;
    private static volatile dssr<dmqz> f;
    public int b;
    private int d;
    private byte e = 2;
    public dsrj<dmqx> a = dssu.b;

    static {
        dmqz dmqzVar = new dmqz();
        c = dmqzVar;
        dsqw.cc(dmqz.class, dmqzVar);
    }

    private dmqz() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001Л\u0003င\u0000", new Object[]{"d", "a", dmqx.class, "b"});
            }
            if (i2 == 3) {
                return new dmqz();
            }
            if (i2 == 4) {
                return new dmqy();
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
            dssr<dmqz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmqz.class) {
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
}
