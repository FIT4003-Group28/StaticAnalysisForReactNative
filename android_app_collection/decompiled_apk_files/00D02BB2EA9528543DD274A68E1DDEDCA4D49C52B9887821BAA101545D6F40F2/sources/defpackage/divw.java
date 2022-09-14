package defpackage;
/* compiled from: PG */
/* renamed from: divw  reason: default package */
/* loaded from: classes6.dex */
public final class divw extends dsqw<divw, divt> implements dssk {
    public static final divw e;
    private static volatile dssr<divw> f;
    public int a;
    public dsrj<divv> b = dssu.b;
    public String c = "";
    public String d = "";

    static {
        divw divwVar = new divw();
        e = divwVar;
        dsqw.cc(divw.class, divwVar);
    }

    private divw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", divv.class, "c", "d"});
            }
            if (i2 == 3) {
                return new divw();
            }
            if (i2 == 4) {
                return new divt();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<divw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (divw.class) {
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
