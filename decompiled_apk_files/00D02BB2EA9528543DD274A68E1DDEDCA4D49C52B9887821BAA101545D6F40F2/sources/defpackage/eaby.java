package defpackage;
/* compiled from: PG */
/* renamed from: eaby  reason: default package */
/* loaded from: classes6.dex */
public final class eaby extends dsqw<eaby, eabv> implements dssk {
    public static final eaby d;
    private static volatile dssr<eaby> e;
    public int a;
    public long b;
    public int c;

    static {
        eaby eabyVar = new eaby();
        d = eabyVar;
        dsqw.cc(eaby.class, eabyVar);
    }

    private eaby() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", eabw.a});
            }
            if (i2 == 3) {
                return new eaby();
            }
            if (i2 == 4) {
                return new eabv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eaby> dssrVar = e;
            if (dssrVar == null) {
                synchronized (eaby.class) {
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
