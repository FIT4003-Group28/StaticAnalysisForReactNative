package defpackage;
/* compiled from: PG */
/* renamed from: cyme  reason: default package */
/* loaded from: classes5.dex */
public final class cyme extends dsqw<cyme, cymb> implements dssk {
    public static final cyme f;
    private static volatile dssr<cyme> g;
    public String a = "";
    public dsrj<cymg> b = dssu.b;
    public dsrj<cymd> c = dssu.b;
    public cyil d;
    public long e;

    static {
        cyme cymeVar = new cyme();
        f = cymeVar;
        dsqw.cc(cyme.class, cymeVar);
    }

    private cyme() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\u0002", new Object[]{"a", "b", cymg.class, "c", cymd.class, "d", "e"});
            }
            if (i2 == 3) {
                return new cyme();
            }
            if (i2 == 4) {
                return new cymb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyme> dssrVar = g;
            if (dssrVar == null) {
                synchronized (cyme.class) {
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
