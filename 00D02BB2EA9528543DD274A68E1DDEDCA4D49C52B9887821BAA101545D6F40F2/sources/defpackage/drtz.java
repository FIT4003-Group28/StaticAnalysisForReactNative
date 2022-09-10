package defpackage;
/* compiled from: PG */
/* renamed from: drtz  reason: default package */
/* loaded from: classes6.dex */
public final class drtz extends dsqw<drtz, drtw> implements dssk {
    public static final drtz k;
    private static volatile dssr<drtz> l;
    public int a;
    public dsrj<drty> b = dssu.b;
    public String c = "";
    public String d = "";
    public drwc e;
    public drwp f;
    public drum g;
    public long h;
    public long i;
    public drvc j;

    static {
        drtz drtzVar = new drtz();
        k = drtzVar;
        dsqw.cc(drtz.class, drtzVar);
    }

    private drtz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဈ\u0001\u0007ဉ\u0004\tဂ\u0006\nဂ\u0007\u000bဉ\b", new Object[]{"a", "b", drty.class, "c", "e", "f", "d", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new drtz();
            }
            if (i2 == 4) {
                return new drtw();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drtz> dssrVar = l;
            if (dssrVar == null) {
                synchronized (drtz.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
