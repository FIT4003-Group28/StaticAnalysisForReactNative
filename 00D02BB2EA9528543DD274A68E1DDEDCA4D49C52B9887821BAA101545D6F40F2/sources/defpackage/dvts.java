package defpackage;
/* compiled from: PG */
/* renamed from: dvts  reason: default package */
/* loaded from: classes6.dex */
public final class dvts extends dsqw<dvts, dvtr> implements dssk {
    public static final dvts e;
    private static volatile dssr<dvts> h;
    public dtnh a;
    public boolean b;
    public dvtq d;
    private int f;
    private byte g = 2;
    public dsrj<dvxl> c = dssu.b;

    static {
        dvts dvtsVar = new dvts();
        e = dvtsVar;
        dsqw.cc(dvts.class, dvtsVar);
    }

    private dvts() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0004\u0007\u0004\u0000\u0001\u0001\u0004ᐉ\u0000\u0005ဇ\u0001\u0006\u001b\u0007ဉ\u0002", new Object[]{"f", "a", "b", "c", dvxl.class, "d"});
            }
            if (i2 == 3) {
                return new dvts();
            }
            if (i2 == 4) {
                return new dvtr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dvts> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dvts.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
