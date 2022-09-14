package defpackage;
/* compiled from: PG */
/* renamed from: dfoe  reason: default package */
/* loaded from: classes6.dex */
public final class dfoe extends dsqw<dfoe, dfod> implements dssk {
    public static final dfoe d;
    public static final dsqv<dfok, dfoe> e;
    private static volatile dssr<dfoe> f;
    public int a;
    public dfoi b;
    public int c;

    static {
        dfoe dfoeVar = new dfoe();
        d = dfoeVar;
        dsqw.cc(dfoe.class, dfoeVar);
        e = dsqw.newSingularGeneratedExtension(dfok.f, dfoeVar, dfoeVar, null, 293178560, dsur.MESSAGE, dfoe.class);
    }

    private dfoe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", dfny.a});
            }
            if (i2 == 3) {
                return new dfoe();
            }
            if (i2 == 4) {
                return new dfod();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfoe> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfoe.class) {
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
