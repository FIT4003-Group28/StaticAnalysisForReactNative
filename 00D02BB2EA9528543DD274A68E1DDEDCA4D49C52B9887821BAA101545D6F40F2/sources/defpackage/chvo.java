package defpackage;
/* compiled from: PG */
/* renamed from: chvo  reason: default package */
/* loaded from: classes4.dex */
public final class chvo extends dsqw<chvo, chvl> implements dssk {
    public static final chvo l;
    private static volatile dssr<chvo> m;
    public int a;
    public int b;
    public int d;
    public int f;
    public int g;
    public String c = "";
    public String e = "";
    public dspd h = dspd.b;
    public String i = "";
    public String j = "";
    public String k = "";

    static {
        chvo chvoVar = new chvo();
        l = chvoVar;
        dsqw.cc(chvo.class, chvoVar);
    }

    private chvo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0004င\u0005\u0005ည\u0006\u0006ဈ\u0007\u0007ဈ\b\bင\u0002\tင\u0004\nဈ\t", new Object[]{"a", "b", chvm.a, "c", "e", "g", "h", "i", "j", "d", "f", "k"});
            }
            if (i2 == 3) {
                return new chvo();
            }
            if (i2 == 4) {
                return new chvl();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chvo> dssrVar = m;
            if (dssrVar == null) {
                synchronized (chvo.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
