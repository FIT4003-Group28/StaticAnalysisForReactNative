package defpackage;
/* compiled from: PG */
/* renamed from: dlgf  reason: default package */
/* loaded from: classes6.dex */
public final class dlgf extends dsqw<dlgf, dlfy> implements dssk {
    public static final dlgf l;
    private static volatile dssr<dlgf> m;
    public int a;
    public int e;
    public dplx f;
    public int h;
    public int i;
    public dlge j;
    public int k;
    public String b = "";
    public String c = "";
    public String d = "";
    public dsrj<dlhl> g = dssu.b;

    static {
        dlgf dlgfVar = new dlgf();
        l = dlgfVar;
        dsqw.cc(dlgf.class, dlgfVar);
    }

    private dlgf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006\u001b\u0007ဌ\u0005\bဌ\u0006\tဉ\u0007\nင\b", new Object[]{"a", "b", "c", "d", "e", dlhe.a, "f", "g", dlhl.class, "h", dlfz.a, "i", dlfw.a, "j", "k"});
            }
            if (i2 == 3) {
                return new dlgf();
            }
            if (i2 == 4) {
                return new dlfy();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlgf> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dlgf.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
