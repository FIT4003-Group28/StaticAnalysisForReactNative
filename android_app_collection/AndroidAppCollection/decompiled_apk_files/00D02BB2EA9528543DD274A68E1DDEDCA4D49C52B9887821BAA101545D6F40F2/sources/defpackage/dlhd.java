package defpackage;
/* compiled from: PG */
/* renamed from: dlhd  reason: default package */
/* loaded from: classes6.dex */
public final class dlhd extends dsqw<dlhd, dlha> implements dssk {
    public static final dlhd d;
    private static volatile dssr<dlhd> f;
    public int a;
    public int b;
    public int c;
    private int e;

    static {
        dlhd dlhdVar = new dlhd();
        d = dlhdVar;
        dsqw.cc(dlhd.class, dlhdVar);
    }

    private dlhd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"e", "a", dlhb.a, "b", dlhb.a, "c", dlhb.a});
            }
            if (i2 == 3) {
                return new dlhd();
            }
            if (i2 == 4) {
                return new dlha();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlhd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlhd.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
