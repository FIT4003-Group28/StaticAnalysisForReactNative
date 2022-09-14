package defpackage;
/* compiled from: PG */
/* renamed from: aimr  reason: default package */
/* loaded from: classes2.dex */
public final class aimr extends dsqw<aimr, aimq> implements dssk {
    public static final aimr c;
    private static volatile dssr<aimr> d;
    public int a;
    public long b;

    static {
        aimr aimrVar = new aimr();
        c = aimrVar;
        dsqw.cc(aimr.class, aimrVar);
    }

    private aimr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new aimr();
            }
            if (i2 == 4) {
                return new aimq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aimr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (aimr.class) {
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
