package defpackage;
/* compiled from: PG */
/* renamed from: duss  reason: default package */
/* loaded from: classes6.dex */
public final class duss extends dsqw<duss, dusr> implements dssk {
    public static final duss d;
    private static volatile dssr<duss> f;
    public int a;
    public dwxb b;
    private byte e = 2;
    public dsrj<dwxd> c = dssu.b;

    static {
        duss dussVar = new duss();
        d = dussVar;
        dsqw.cc(duss.class, dussVar);
    }

    private duss() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л", new Object[]{"a", "b", "c", dwxd.class});
            }
            if (i2 == 3) {
                return new duss();
            }
            if (i2 == 4) {
                return new dusr();
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
            dssr<duss> dssrVar = f;
            if (dssrVar == null) {
                synchronized (duss.class) {
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
}
