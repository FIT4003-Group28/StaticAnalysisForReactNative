package defpackage;
/* compiled from: PG */
/* renamed from: drwy  reason: default package */
/* loaded from: classes6.dex */
public final class drwy extends dsqw<drwy, drwr> implements dssk {
    public static final drwy k;
    private static volatile dssr<drwy> l;
    public int a;
    public int b;
    public int d;
    public int f;
    public drtv g;
    public drwg h;
    public int i;
    public int j;
    public String c = "";
    public dsrj<drwx> e = dssu.b;

    static {
        drwy drwyVar = new drwy();
        k = drwyVar;
        dsqw.cc(drwy.class, drwyVar);
    }

    private drwy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\"\t\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0005ဉ\u0005\tဌ\u0002\nဌ\n\f\u001b\rဌ\u000b\u000eဉ\t\"ဌ\u0004", new Object[]{"a", "b", drwv.c(), "c", "g", "d", drwq.a, "i", drwt.c(), "e", drwx.class, "j", drvk.a, "h", "f", drub.a});
            }
            if (i2 == 3) {
                return new drwy();
            }
            if (i2 == 4) {
                return new drwr();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drwy> dssrVar = l;
            if (dssrVar == null) {
                synchronized (drwy.class) {
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
