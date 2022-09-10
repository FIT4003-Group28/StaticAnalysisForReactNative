package defpackage;
/* compiled from: PG */
/* renamed from: bokm  reason: default package */
/* loaded from: classes3.dex */
public final class bokm extends dsqw<bokm, bokl> implements dssk {
    public static final bokm n;
    private static volatile dssr<bokm> o;
    public int a;
    public boolean b;
    public boolean f;
    public boolean g;
    public int i;
    public dorz l;
    public int m;
    public String c = "";
    public String d = "";
    public String e = "";
    public String h = "";
    public String j = "";
    public String k = "";

    static {
        bokm bokmVar = new bokm();
        n = bokmVar;
        dsqw.cc(bokm.class, bokmVar);
    }

    private bokm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဈ\u0006\bဌ\u0007\tဈ\b\nဈ\t\u000bဉ\n\fင\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", dory.c(), "j", "k", "l", "m"});
            }
            if (i2 == 3) {
                return new bokm();
            }
            if (i2 == 4) {
                return new bokl();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bokm> dssrVar = o;
            if (dssrVar == null) {
                synchronized (bokm.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
