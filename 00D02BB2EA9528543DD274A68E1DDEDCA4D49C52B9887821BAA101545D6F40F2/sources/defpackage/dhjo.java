package defpackage;
/* compiled from: PG */
/* renamed from: dhjo  reason: default package */
/* loaded from: classes6.dex */
public final class dhjo extends dsqw<dhjo, dhjn> implements dssk {
    public static final dhjo h;
    private static volatile dssr<dhjo> j;
    public int a;
    public dhjx c;
    public duhe d;
    public dgba f;
    private byte i = 2;
    public String b = "";
    public String e = "";
    public dsrj<dbli> g = dssu.b;

    static {
        dhjo dhjoVar = new dhjo();
        h = dhjoVar;
        dsqw.cc(dhjo.class, dhjoVar);
    }

    private dhjo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006Л", new Object[]{"a", "b", "c", "d", "e", "f", "g", dbli.class});
            }
            if (i2 == 3) {
                return new dhjo();
            }
            if (i2 == 4) {
                return new dhjn();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dhjo> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dhjo.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
