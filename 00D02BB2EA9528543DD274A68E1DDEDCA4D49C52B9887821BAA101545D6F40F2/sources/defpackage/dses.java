package defpackage;
/* compiled from: PG */
/* renamed from: dses  reason: default package */
/* loaded from: classes6.dex */
public final class dses extends dsqw<dses, dser> implements dssk {
    public static final dses e;
    private static volatile dssr<dses> g;
    public int a;
    public float b;
    public int c;
    public float d;
    private int f;

    static {
        dses dsesVar = new dses();
        e = dsesVar;
        dsqw.cc(dses.class, dsesVar);
    }

    private dses() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003ဌ\u0002\u0004ခ\u0003", new Object[]{"f", "a", dsep.a, "b", "c", dsep.a, "d"});
            }
            if (i2 == 3) {
                return new dses();
            }
            if (i2 == 4) {
                return new dser();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dses> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dses.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
