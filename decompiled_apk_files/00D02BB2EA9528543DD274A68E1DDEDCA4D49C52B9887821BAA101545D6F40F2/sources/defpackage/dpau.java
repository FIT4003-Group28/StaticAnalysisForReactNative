package defpackage;
/* compiled from: PG */
/* renamed from: dpau  reason: default package */
/* loaded from: classes6.dex */
public final class dpau extends dsqw<dpau, dpat> implements dssk {
    public static final dpau d;
    private static volatile dssr<dpau> f;
    public int a;
    public douj c;
    private byte e = 2;
    public String b = "";

    static {
        dpau dpauVar = new dpau();
        d = dpauVar;
        dsqw.cc(dpau.class, dpauVar);
    }

    private dpau() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpau();
            }
            if (i2 == 4) {
                return new dpat();
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
            dssr<dpau> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpau.class) {
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
