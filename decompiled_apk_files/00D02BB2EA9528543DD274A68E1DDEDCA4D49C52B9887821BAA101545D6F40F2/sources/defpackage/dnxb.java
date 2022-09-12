package defpackage;
/* compiled from: PG */
/* renamed from: dnxb  reason: default package */
/* loaded from: classes6.dex */
public final class dnxb extends dsqw<dnxb, dnxa> implements dssk {
    public static final dnxb h;
    private static volatile dssr<dnxb> i;
    public int a;
    public dsrj<dnwz> b = dssu.b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        dnxb dnxbVar = new dnxb();
        h = dnxbVar;
        dsqw.cc(dnxb.class, dnxbVar);
    }

    private dnxb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\bဈ\u0006", new Object[]{"a", "b", dnwz.class, "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dnxb();
            }
            if (i3 == 4) {
                return new dnxa();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dnxb> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dnxb.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
