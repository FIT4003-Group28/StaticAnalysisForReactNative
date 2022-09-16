package defpackage;
/* compiled from: PG */
/* renamed from: drlw  reason: default package */
/* loaded from: classes6.dex */
public final class drlw extends dsqw<drlw, drlv> implements dssk {
    public static final drlw e;
    private static volatile dssr<drlw> f;
    public int a;
    public String b = "";
    public String c = "";
    public dgaq d;

    static {
        drlw drlwVar = new drlw();
        e = drlwVar;
        dsqw.cc(drlw.class, drlwVar);
    }

    private drlw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new drlw();
            }
            if (i2 == 4) {
                return new drlv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drlw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drlw.class) {
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
