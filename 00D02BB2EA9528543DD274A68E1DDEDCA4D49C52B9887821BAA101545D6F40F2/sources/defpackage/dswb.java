package defpackage;
/* compiled from: PG */
/* renamed from: dswb  reason: default package */
/* loaded from: classes6.dex */
public final class dswb extends dsqw<dswb, dsvy> implements dssk {
    public static final dswb e;
    private static volatile dssr<dswb> f;
    public int a;
    public String b = "";
    public int c;
    public dswa d;

    static {
        dswb dswbVar = new dswb();
        e = dswbVar;
        dsqw.cc(dswb.class, dswbVar);
    }

    private dswb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003င\u0001\u0004ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dswb();
            }
            if (i2 == 4) {
                return new dsvy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dswb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dswb.class) {
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
