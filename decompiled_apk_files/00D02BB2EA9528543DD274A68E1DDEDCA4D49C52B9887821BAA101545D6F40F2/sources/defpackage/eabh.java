package defpackage;
/* compiled from: PG */
/* renamed from: eabh  reason: default package */
/* loaded from: classes.dex */
public final class eabh extends dsqw<eabh, eabg> implements dssk {
    public static final eabh d;
    private static volatile dssr<eabh> e;
    public int a;
    public long b;
    public long c;

    static {
        eabh eabhVar = new eabh();
        d = eabhVar;
        dsqw.cc(eabh.class, eabhVar);
    }

    private eabh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new eabh();
            }
            if (i2 == 4) {
                return new eabg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eabh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (eabh.class) {
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
