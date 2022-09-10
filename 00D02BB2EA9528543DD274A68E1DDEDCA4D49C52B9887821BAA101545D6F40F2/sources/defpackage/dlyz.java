package defpackage;
/* compiled from: PG */
/* renamed from: dlyz  reason: default package */
/* loaded from: classes6.dex */
public final class dlyz extends dsqw<dlyz, dlyy> implements dssk {
    public static final dlyz g;
    private static volatile dssr<dlyz> h;
    public int a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;

    static {
        dlyz dlyzVar = new dlyz();
        g = dlyzVar;
        dsqw.cc(dlyz.class, dlyzVar);
    }

    private dlyz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dlyz();
            }
            if (i2 == 4) {
                return new dlyy();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlyz> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dlyz.class) {
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
