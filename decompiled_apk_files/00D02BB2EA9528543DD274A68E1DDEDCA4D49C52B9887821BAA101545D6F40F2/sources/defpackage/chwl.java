package defpackage;
/* compiled from: PG */
/* renamed from: chwl  reason: default package */
/* loaded from: classes4.dex */
public final class chwl extends dsqw<chwl, chwk> implements dssk {
    public static final chwl c;
    private static volatile dssr<chwl> d;
    public int a;
    public dspd b = dspd.b;

    static {
        chwl chwlVar = new chwl();
        c = chwlVar;
        dsqw.cc(chwl.class, chwlVar);
    }

    private chwl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new chwl();
            }
            if (i2 == 4) {
                return new chwk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chwl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (chwl.class) {
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
