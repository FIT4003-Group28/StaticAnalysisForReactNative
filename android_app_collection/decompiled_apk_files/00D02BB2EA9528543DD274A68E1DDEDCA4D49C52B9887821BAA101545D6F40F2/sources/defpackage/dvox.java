package defpackage;
/* compiled from: PG */
/* renamed from: dvox  reason: default package */
/* loaded from: classes.dex */
public final class dvox extends dsqw<dvox, dvow> implements dssk {
    public static final dvox f;
    private static volatile dssr<dvox> i;
    public int b;
    private int g;
    private byte h = 2;
    public int a = 1;
    public dsrf c = dsqz.b;
    public int d = 22;
    public dsrj<dvdb> e = dssu.b;

    static {
        dvox dvoxVar = new dvox();
        f = dvoxVar;
        dsqw.cc(dvox.class, dvoxVar);
    }

    private dvox() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0001\u0001င\u0000\u0002\u0016\u0003င\u0002\u0004Л\u0005င\u0001", new Object[]{"g", "a", "c", "d", "e", dvdb.class, "b"});
            }
            if (i3 == 3) {
                return new dvox();
            }
            if (i3 == 4) {
                return new dvow();
            }
            if (i3 == 5) {
                return f;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dvox> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dvox.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
