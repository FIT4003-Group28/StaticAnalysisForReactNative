package defpackage;
/* compiled from: PG */
/* renamed from: dkzh  reason: default package */
/* loaded from: classes6.dex */
public final class dkzh extends dsqw<dkzh, dkzg> implements dssk {
    public static final dkzh c;
    private static volatile dssr<dkzh> f;
    private int d;
    private byte e = 2;
    public dsrj<dkzl> a = dssu.b;
    public dspd b = dspd.b;

    static {
        dkzh dkzhVar = new dkzh();
        c = dkzhVar;
        dsqw.cc(dkzh.class, dkzhVar);
    }

    private dkzh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0001\u0001\u0003Л\u0005ည\u0001", new Object[]{"d", "a", dkzl.class, "b"});
            }
            if (i2 == 3) {
                return new dkzh();
            }
            if (i2 == 4) {
                return new dkzg();
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
            dssr<dkzh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkzh.class) {
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
