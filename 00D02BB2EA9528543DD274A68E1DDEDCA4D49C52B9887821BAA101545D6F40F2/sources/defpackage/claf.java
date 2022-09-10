package defpackage;
/* compiled from: PG */
/* renamed from: claf  reason: default package */
/* loaded from: classes5.dex */
public final class claf extends dsqs<claf, clae> implements dsqt {
    public static final claf c;
    private static volatile dssr<claf> e;
    public int a;
    private byte d = 2;
    public int b = 1;

    static {
        claf clafVar = new claf();
        c = clafVar;
        dsqw.cc(claf.class, clafVar);
    }

    private claf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", clac.a});
            }
            if (i2 == 3) {
                return new claf();
            }
            if (i2 == 4) {
                return new clae();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<claf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (claf.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
