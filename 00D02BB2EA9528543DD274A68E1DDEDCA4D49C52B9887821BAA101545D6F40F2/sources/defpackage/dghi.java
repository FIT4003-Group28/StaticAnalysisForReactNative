package defpackage;
/* compiled from: PG */
/* renamed from: dghi  reason: default package */
/* loaded from: classes6.dex */
public final class dghi extends dsqw<dghi, dghh> implements dssk {
    public static final dghi d;
    private static volatile dssr<dghi> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        dghi dghiVar = new dghi();
        d = dghiVar;
        dsqw.cc(dghi.class, dghiVar);
    }

    private dghi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dghi();
            }
            if (i2 == 4) {
                return new dghh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dghi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dghi.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
