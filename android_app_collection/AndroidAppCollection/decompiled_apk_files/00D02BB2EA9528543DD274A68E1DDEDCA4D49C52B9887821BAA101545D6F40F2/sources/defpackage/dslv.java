package defpackage;
/* compiled from: PG */
/* renamed from: dslv  reason: default package */
/* loaded from: classes6.dex */
public final class dslv extends dsqw<dslv, dslu> implements dssk {
    public static final dslv f;
    private static volatile dssr<dslv> g;
    public int a;
    public int b;
    public dsla c;
    public String d = "";
    public dsku e;

    static {
        dslv dslvVar = new dslv();
        f = dslvVar;
        dsqw.cc(dslv.class, dslvVar);
    }

    private dslv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဉ\u0001", new Object[]{"a", "b", "d", "e", "c"});
            }
            if (i2 == 3) {
                return new dslv();
            }
            if (i2 == 4) {
                return new dslu();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dslv> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dslv.class) {
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
