package defpackage;
/* compiled from: PG */
/* renamed from: dpiv  reason: default package */
/* loaded from: classes.dex */
public final class dpiv extends dsqw<dpiv, dpiu> implements dssk {
    public static final dpiv c;
    private static volatile dssr<dpiv> d;
    public int a;
    public boolean b = true;

    static {
        dpiv dpivVar = new dpiv();
        c = dpivVar;
        dsqw.cc(dpiv.class, dpivVar);
    }

    private dpiv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dpiv();
            }
            if (i2 == 4) {
                return new dpiu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpiv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpiv.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
