package defpackage;
/* compiled from: PG */
/* renamed from: dgnn  reason: default package */
/* loaded from: classes6.dex */
public final class dgnn extends dsqw<dgnn, dgnm> implements dssk {
    public static final dgnn o;
    private static volatile dssr<dgnn> p;
    public int a;
    public dhjz c;
    public dhjz e;
    public boolean f;
    public boolean g;
    public boolean h;
    public dpuq k;
    public dpsn l;
    public String b = "";
    public int d = 1;
    public String i = "";
    public dsrj<dpsn> j = dssu.b;
    public String m = "";
    public dsrj<dpsn> n = dssu.b;

    static {
        dgnn dgnnVar = new dgnn();
        o = dgnnVar;
        dsqw.cc(dgnn.class, dgnnVar);
    }

    private dgnn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဈ\u0007\t\u001b\nဉ\b\u000bဉ\t\fဈ\n\r\u001b", new Object[]{"a", "b", "c", "d", doay.c(), "e", "f", "g", "h", "i", "j", dpsn.class, "k", "l", "m", "n", dpsn.class});
            }
            if (i2 == 3) {
                return new dgnn();
            }
            if (i2 == 4) {
                return new dgnm();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgnn> dssrVar = p;
            if (dssrVar == null) {
                synchronized (dgnn.class) {
                    dssrVar = p;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(o);
                        p = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
