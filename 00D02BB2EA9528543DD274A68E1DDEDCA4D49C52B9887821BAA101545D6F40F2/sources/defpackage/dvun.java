package defpackage;
/* compiled from: PG */
/* renamed from: dvun  reason: default package */
/* loaded from: classes.dex */
public final class dvun extends dsqw<dvun, dvuk> implements dssk {
    public static final dvun i;
    private static volatile dssr<dvun> j;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public int g;
    public int h;

    static {
        dvun dvunVar = new dvun();
        i = dvunVar;
        dsqw.cc(dvun.class, dvunVar);
    }

    private dvun() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0013\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0005\u0004ဌ\u000b\u0007ဈ\u0007\bဈ\t\fင\u000f\u0013ဈ\u0001", new Object[]{"a", "b", "d", "g", dvum.c(), "e", "f", "h", "c"});
            }
            if (i3 == 3) {
                return new dvun();
            }
            if (i3 == 4) {
                return new dvuk();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dvun> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dvun.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
