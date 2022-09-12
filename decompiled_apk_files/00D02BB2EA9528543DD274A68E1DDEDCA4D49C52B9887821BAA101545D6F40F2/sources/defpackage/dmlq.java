package defpackage;
/* compiled from: PG */
/* renamed from: dmlq  reason: default package */
/* loaded from: classes.dex */
public final class dmlq extends dsqw<dmlq, dmlp> implements dssk {
    public static final dmlq e;
    private static volatile dssr<dmlq> h;
    public int a;
    public dmls b;
    public int d;
    private dmsd f;
    private byte g = 2;
    public int c = 1;

    static {
        dmlq dmlqVar = new dmlq();
        e = dmlqVar;
        dsqw.cc(dmlq.class, dmlqVar);
    }

    private dmlq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဌ\u0001\u0004င\u0002\u0005ᐉ\u0003", new Object[]{"a", "b", "c", dmlo.c(), "d", "f"});
            }
            if (i2 == 3) {
                return new dmlq();
            }
            if (i2 == 4) {
                return new dmlp();
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
            dssr<dmlq> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dmlq.class) {
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
}
