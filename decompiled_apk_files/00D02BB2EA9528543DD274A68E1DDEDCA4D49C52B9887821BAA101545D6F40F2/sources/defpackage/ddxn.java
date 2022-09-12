package defpackage;
/* compiled from: PG */
/* renamed from: ddxn  reason: default package */
/* loaded from: classes6.dex */
public final class ddxn extends dsqw<ddxn, ddxm> implements dssk {
    public static final ddxn f;
    private static volatile dssr<ddxn> g;
    public int a;
    public String b = "";
    public String c = "";
    public dsrj<String> d = dssu.b;
    public dsrj<String> e = dssu.b;

    static {
        ddxn ddxnVar = new ddxn();
        f = ddxnVar;
        dsqw.cc(ddxn.class, ddxnVar);
    }

    private ddxn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004\u001a", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ddxn();
            }
            if (i2 == 4) {
                return new ddxm();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddxn> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddxn.class) {
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
