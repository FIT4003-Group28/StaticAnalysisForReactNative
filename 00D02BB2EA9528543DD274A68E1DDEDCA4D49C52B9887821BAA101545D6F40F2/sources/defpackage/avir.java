package defpackage;
/* compiled from: PG */
/* renamed from: avir  reason: default package */
/* loaded from: classes3.dex */
public final class avir extends dsqw<avir, aviq> implements dssk {
    public static final avir g;
    private static volatile dssr<avir> h;
    public int a;
    public aviz d;
    public dgsl e;
    public dsrj<String> b = dssu.b;
    public dsrj<String> c = dssu.b;
    public String f = "";

    static {
        avir avirVar = new avir();
        g = avirVar;
        dsqw.cc(avir.class, avirVar);
    }

    private avir() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u001a\u0002\u001a\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဈ\u0002", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new avir();
            }
            if (i2 == 4) {
                return new aviq();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<avir> dssrVar = h;
            if (dssrVar == null) {
                synchronized (avir.class) {
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
