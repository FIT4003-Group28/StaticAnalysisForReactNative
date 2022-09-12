package defpackage;
/* compiled from: PG */
/* renamed from: dpsn  reason: default package */
/* loaded from: classes.dex */
public final class dpsn extends dsqw<dpsn, dpsm> implements dssk {
    public static final dpsn d;
    private static volatile dssr<dpsn> e;
    public int a;
    public long b;
    public long c;

    static {
        dpsn dpsnVar = new dpsn();
        d = dpsnVar;
        dsqw.cc(dpsn.class, dpsnVar);
    }

    private dpsn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002စ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpsn();
            }
            if (i2 == 4) {
                return new dpsm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpsn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpsn.class) {
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
