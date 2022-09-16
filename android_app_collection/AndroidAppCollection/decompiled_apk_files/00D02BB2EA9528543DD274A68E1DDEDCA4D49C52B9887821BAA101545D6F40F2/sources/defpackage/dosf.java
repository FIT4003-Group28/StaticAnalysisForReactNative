package defpackage;
/* compiled from: PG */
/* renamed from: dosf  reason: default package */
/* loaded from: classes6.dex */
public final class dosf extends dsqw<dosf, dose> implements dosg {
    public static final dosf f;
    private static volatile dssr<dosf> g;
    public int a;
    public long b;
    public long c;
    public dngq d;
    public long e;

    static {
        dosf dosfVar = new dosf();
        f = dosfVar;
        dsqw.cc(dosf.class, dosfVar);
    }

    private dosf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0000\u0002ဂ\u0000\u0004ဂ\u0001\u0005ဉ\u0002\u0006ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dosf();
            }
            if (i2 == 4) {
                return new dose();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dosf> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dosf.class) {
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
