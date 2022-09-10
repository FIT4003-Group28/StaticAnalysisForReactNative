package defpackage;
/* compiled from: PG */
/* renamed from: dsku  reason: default package */
/* loaded from: classes6.dex */
public final class dsku extends dsqw<dsku, dskt> implements dssk {
    public static final dsku f;
    private static volatile dssr<dsku> g;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public int e;

    static {
        dsku dskuVar = new dsku();
        f = dskuVar;
        dsqw.cc(dsku.class, dskuVar);
    }

    private dsku() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"a", "b", dsmh.c(), "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dsku();
            }
            if (i2 == 4) {
                return new dskt();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsku> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dsku.class) {
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
