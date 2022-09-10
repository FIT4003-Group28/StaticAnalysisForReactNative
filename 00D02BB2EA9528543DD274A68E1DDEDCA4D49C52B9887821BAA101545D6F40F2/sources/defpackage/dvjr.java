package defpackage;
/* compiled from: PG */
/* renamed from: dvjr  reason: default package */
/* loaded from: classes6.dex */
public final class dvjr extends dsqw<dvjr, dvjq> implements dssk {
    public static final dvjr e;
    private static volatile dssr<dvjr> f;
    public int a;
    public String b = "";
    public dsrj<dnha> c = dssu.b;
    public long d;

    static {
        dvjr dvjrVar = new dvjr();
        e = dvjrVar;
        dsqw.cc(dvjr.class, dvjrVar);
    }

    private dvjr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဂ\u0002", new Object[]{"a", "b", "c", dnha.class, "d"});
            }
            if (i2 == 3) {
                return new dvjr();
            }
            if (i2 == 4) {
                return new dvjq();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvjr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvjr.class) {
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
