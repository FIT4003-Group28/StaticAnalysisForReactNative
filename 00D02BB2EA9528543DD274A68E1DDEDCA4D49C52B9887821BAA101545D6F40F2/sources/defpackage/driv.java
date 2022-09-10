package defpackage;
/* compiled from: PG */
/* renamed from: driv  reason: default package */
/* loaded from: classes6.dex */
public final class driv extends dsqw<driv, driu> implements dssk {
    public static final driv b;
    private static volatile dssr<driv> d;
    public String a = "";
    private int c;

    static {
        driv drivVar = new driv();
        b = drivVar;
        dsqw.cc(driv.class, drivVar);
    }

    private driv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new driv();
            }
            if (i2 == 4) {
                return new driu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<driv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (driv.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
