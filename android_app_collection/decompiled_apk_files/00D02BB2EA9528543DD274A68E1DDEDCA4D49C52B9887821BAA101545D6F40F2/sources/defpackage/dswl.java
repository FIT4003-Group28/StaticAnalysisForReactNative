package defpackage;
/* compiled from: PG */
/* renamed from: dswl  reason: default package */
/* loaded from: classes6.dex */
public final class dswl extends dsqw<dswl, dswk> implements dssk {
    public static final dswl f;
    private static volatile dssr<dswl> g;
    public int a;
    public String b = "";
    public dsrj<dswq> c = dssu.b;
    public String d = "";
    public String e = "";

    static {
        dswl dswlVar = new dswl();
        f = dswlVar;
        dsqw.cc(dswl.class, dswlVar);
    }

    private dswl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", "c", dswq.class, "d", "e"});
            }
            if (i2 == 3) {
                return new dswl();
            }
            if (i2 == 4) {
                return new dswk();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dswl> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dswl.class) {
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
