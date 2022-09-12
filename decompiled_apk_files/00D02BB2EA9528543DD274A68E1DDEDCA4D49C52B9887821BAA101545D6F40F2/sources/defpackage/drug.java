package defpackage;
/* compiled from: PG */
/* renamed from: drug  reason: default package */
/* loaded from: classes6.dex */
public final class drug extends dsqw<drug, drud> implements dssk {
    public static final drug d;
    private static volatile dssr<drug> e;
    public int a;
    public druc b;
    public int c;

    static {
        drug drugVar = new drug();
        d = drugVar;
        dsqw.cc(drug.class, drugVar);
    }

    private drug() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", drue.a});
            }
            if (i2 == 3) {
                return new drug();
            }
            if (i2 == 4) {
                return new drud();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drug> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drug.class) {
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
