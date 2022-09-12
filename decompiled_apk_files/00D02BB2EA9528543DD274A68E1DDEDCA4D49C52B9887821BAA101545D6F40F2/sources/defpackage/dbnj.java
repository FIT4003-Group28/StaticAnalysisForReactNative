package defpackage;
/* compiled from: PG */
/* renamed from: dbnj  reason: default package */
/* loaded from: classes5.dex */
public final class dbnj extends dsqw<dbnj, dbng> implements dssk {
    public static final dbnj d;
    private static volatile dssr<dbnj> e;
    public int a;
    public String b = "";
    public int c;

    static {
        dbnj dbnjVar = new dbnj();
        d = dbnjVar;
        dsqw.cc(dbnj.class, dbnjVar);
    }

    private dbnj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", dbnh.a});
            }
            if (i2 == 3) {
                return new dbnj();
            }
            if (i2 == 4) {
                return new dbng();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbnj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dbnj.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
