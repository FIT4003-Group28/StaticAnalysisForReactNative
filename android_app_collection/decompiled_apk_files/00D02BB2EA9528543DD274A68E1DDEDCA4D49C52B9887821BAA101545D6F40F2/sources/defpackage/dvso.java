package defpackage;
/* compiled from: PG */
/* renamed from: dvso  reason: default package */
/* loaded from: classes6.dex */
public final class dvso extends dsqw<dvso, dvsn> implements dssk {
    public static final dvso d;
    private static volatile dssr<dvso> f;
    public int a;
    public int b;
    public duxq c;
    private byte e = 2;

    static {
        dvso dvsoVar = new dvso();
        d = dvsoVar;
        dsqw.cc(dvso.class, dvsoVar);
    }

    private dvso() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvso();
            }
            if (i2 == 4) {
                return new dvsn();
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
            dssr<dvso> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvso.class) {
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
