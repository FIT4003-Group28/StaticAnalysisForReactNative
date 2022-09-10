package defpackage;
/* compiled from: PG */
/* renamed from: dthh  reason: default package */
/* loaded from: classes6.dex */
public final class dthh extends dsqw<dthh, dthg> implements dssk {
    public static final dthh f;
    private static volatile dssr<dthh> g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        dthh dthhVar = new dthh();
        f = dthhVar;
        dsqw.cc(dthh.class, dthhVar);
    }

    private dthh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dthh();
            }
            if (i2 == 4) {
                return new dthg();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dthh> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dthh.class) {
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
