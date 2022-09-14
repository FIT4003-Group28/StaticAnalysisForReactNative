package defpackage;
/* compiled from: PG */
/* renamed from: dvha  reason: default package */
/* loaded from: classes.dex */
public final class dvha extends dsqw<dvha, dvgz> implements dssk {
    public static final dvha h;
    private static volatile dssr<dvha> i;
    public int a;
    public dqpe c;
    public dpsn e;
    public dvhm f;
    public int g;
    public String b = "";
    public String d = "";

    static {
        dvha dvhaVar = new dvha();
        h = dvhaVar;
        dsqw.cc(dvha.class, dvhaVar);
    }

    private dvha() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဈ\u0002\u0003ဉ\u0004\u0004ဌ\u0006\u0005ဈ\u0000\u0007ဉ\u0003", new Object[]{"a", "c", "d", "f", "g", drbs.a, "b", "e"});
            }
            if (i3 == 3) {
                return new dvha();
            }
            if (i3 == 4) {
                return new dvgz();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dvha> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dvha.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
