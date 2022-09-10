package defpackage;
/* compiled from: PG */
/* renamed from: dlcn  reason: default package */
/* loaded from: classes6.dex */
public final class dlcn extends dsqw<dlcn, dlck> implements dssk {
    public static final dlcn f;
    private static volatile dssr<dlcn> g;
    public int a;
    public dspd b = dspd.b;
    public String c = "";
    public String d = "";
    public dsrj<dlcm> e = dssu.b;

    static {
        dlcn dlcnVar = new dlcn();
        f = dlcnVar;
        dsqw.cc(dlcn.class, dlcnVar);
    }

    private dlcn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b", new Object[]{"a", "b", "c", "d", "e", dlcm.class});
            }
            if (i2 == 3) {
                return new dlcn();
            }
            if (i2 == 4) {
                return new dlck();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlcn> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlcn.class) {
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
