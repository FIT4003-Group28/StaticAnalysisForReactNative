package defpackage;
/* compiled from: PG */
/* renamed from: dori  reason: default package */
/* loaded from: classes6.dex */
public final class dori extends dsqw<dori, dorh> implements dssk {
    public static final dori l;
    private static volatile dssr<dori> n;
    public int a;
    public boolean c;
    public dnwl e;
    public dnwl f;
    public boolean g;
    public boolean h;
    public int i;
    public dqwa j;
    public boolean k;
    private byte m = 2;
    public String b = "";
    public String d = "";

    static {
        dori doriVar = new dori();
        l = doriVar;
        dsqw.cc(dori.class, doriVar);
    }

    private dori() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0000\u0002\u0001ဈ\u0002\u0002ᐉ\u0003\u0005ဇ\f\u0007ᐉ\u0004\tဉ\u0010\nဇ\u000b\rင\r\u000fဈ\u0000\u0010ဇ\u0001\u0011ဇ\u0012", new Object[]{"a", "d", "e", "h", "f", "j", "g", "i", "b", "c", "k"});
            }
            if (i2 == 3) {
                return new dori();
            }
            if (i2 == 4) {
                return new dorh();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            }
            dssr<dori> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dori.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.m);
    }
}
