package defpackage;
/* compiled from: PG */
/* renamed from: drkz  reason: default package */
/* loaded from: classes6.dex */
public final class drkz extends dsqw<drkz, drky> implements dssk {
    public static final drkz f;
    private static volatile dssr<drkz> g;
    public int a;
    public dpsn b;
    public dpyn c;
    public dpuq d;
    public long e;

    static {
        drkz drkzVar = new drkz();
        f = drkzVar;
        dsqw.cc(drkz.class, drkzVar);
    }

    private drkz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new drkz();
            }
            if (i2 == 4) {
                return new drky();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drkz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (drkz.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
