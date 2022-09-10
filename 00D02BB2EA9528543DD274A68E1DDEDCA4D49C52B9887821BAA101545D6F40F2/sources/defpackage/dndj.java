package defpackage;
/* compiled from: PG */
/* renamed from: dndj  reason: default package */
/* loaded from: classes.dex */
public final class dndj extends dsqw<dndj, dndi> implements dssk {
    public static final dndj e;
    private static volatile dssr<dndj> f;
    public int a;
    public dndl b;
    public String c = "";
    public int d;

    static {
        dndj dndjVar = new dndj();
        e = dndjVar;
        dsqw.cc(dndj.class, dndjVar);
    }

    private dndj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0005ဋ\u0004", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dndj();
            }
            if (i2 == 4) {
                return new dndi();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dndj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dndj.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
