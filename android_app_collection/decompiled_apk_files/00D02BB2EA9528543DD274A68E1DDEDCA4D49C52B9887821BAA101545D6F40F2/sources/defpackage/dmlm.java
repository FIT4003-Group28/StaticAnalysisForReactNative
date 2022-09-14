package defpackage;
/* compiled from: PG */
/* renamed from: dmlm  reason: default package */
/* loaded from: classes.dex */
public final class dmlm extends dsqw<dmlm, dmll> implements dssk {
    public static final dmlm g;
    private static volatile dssr<dmlm> h;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public int e;
    public int f;

    static {
        dmlm dmlmVar = new dmlm();
        g = dmlmVar;
        dsqw.cc(dmlm.class, dmlmVar);
    }

    private dmlm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dmlm();
            }
            if (i2 == 4) {
                return new dmll();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmlm> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dmlm.class) {
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
