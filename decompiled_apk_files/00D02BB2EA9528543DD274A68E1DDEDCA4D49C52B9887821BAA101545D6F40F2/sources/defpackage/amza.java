package defpackage;
/* compiled from: PG */
/* renamed from: amza  reason: default package */
/* loaded from: classes.dex */
public final class amza extends dsqw<amza, amyz> implements dssk {
    public static final amza k;
    private static volatile dssr<amza> m;
    public int a;
    public drsu e;
    private byte l = 2;
    public String b = "";
    public String c = "";
    public String d = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";

    static {
        amza amzaVar = new amza();
        k = amzaVar;
        dsqw.cc(amza.class, amzaVar);
    }

    private amza() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0005ᐉ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\tဈ\b\nဈ\t\u000bဈ\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new amza();
            }
            if (i2 == 4) {
                return new amyz();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            }
            dssr<amza> dssrVar = m;
            if (dssrVar == null) {
                synchronized (amza.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.l);
    }
}
