package defpackage;
/* compiled from: PG */
/* renamed from: dhkh  reason: default package */
/* loaded from: classes6.dex */
public final class dhkh extends dsqw<dhkh, dhkg> implements dssk {
    public static final dhkh a;
    private static volatile dssr<dhkh> b;

    static {
        dhkh dhkhVar = new dhkh();
        a = dhkhVar;
        dsqw.cc(dhkh.class, dhkhVar);
    }

    private dhkh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhkh();
            }
            if (i2 == 4) {
                return new dhkg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhkh> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhkh.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
