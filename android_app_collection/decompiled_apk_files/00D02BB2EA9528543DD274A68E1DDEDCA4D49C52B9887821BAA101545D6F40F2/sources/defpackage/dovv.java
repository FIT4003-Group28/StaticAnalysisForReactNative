package defpackage;
/* compiled from: PG */
/* renamed from: dovv  reason: default package */
/* loaded from: classes6.dex */
public final class dovv extends dsqw<dovv, dovq> implements dssk {
    public static final dovv h;
    private static volatile dssr<dovv> j;
    public int a;
    public int b;
    public int g;
    private byte i = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        dovv dovvVar = new dovv();
        h = dovvVar;
        dsqw.cc(dovv.class, dovvVar);
    }

    private dovv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0007\u0004ဈ\b\u0005ဈ\u0005\tဌ\t", new Object[]{"a", "b", dovu.c(), "c", "e", "f", "d", "g", dovr.a});
            }
            if (i2 == 3) {
                return new dovv();
            }
            if (i2 == 4) {
                return new dovq();
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
            dssr<dovv> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dovv.class) {
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
