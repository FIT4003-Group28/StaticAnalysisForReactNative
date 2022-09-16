package defpackage;
/* compiled from: PG */
/* renamed from: diae  reason: default package */
/* loaded from: classes6.dex */
public final class diae extends dsqw<diae, diad> implements dssk {
    public static final diae d;
    private static volatile dssr<diae> f;
    public int a;
    public dqqc b;
    public dnqh c;
    private byte e = 2;

    static {
        diae diaeVar = new diae();
        d = diaeVar;
        dsqw.cc(diae.class, diaeVar);
    }

    private diae() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new diae();
            }
            if (i2 == 4) {
                return new diad();
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
            dssr<diae> dssrVar = f;
            if (dssrVar == null) {
                synchronized (diae.class) {
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
