package defpackage;
/* compiled from: PG */
/* renamed from: dghk  reason: default package */
/* loaded from: classes.dex */
public final class dghk extends dsqw<dghk, dghj> implements dssk {
    public static final dghk g;
    private static volatile dssr<dghk> h;
    public int a;
    public int b;
    public dhkd c;
    public dgho d;
    public dghe e;
    public dghg f;

    static {
        dghk dghkVar = new dghk();
        g = dghkVar;
        dsqw.cc(dghk.class, dghkVar);
    }

    private dghk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0002\t\u0005\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\tဉ\u0006", new Object[]{"a", "b", dggc.c(), "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dghk();
            }
            if (i2 == 4) {
                return new dghj();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dghk> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dghk.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
