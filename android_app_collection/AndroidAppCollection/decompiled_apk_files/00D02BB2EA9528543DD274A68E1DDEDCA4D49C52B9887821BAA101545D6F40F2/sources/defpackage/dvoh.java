package defpackage;
/* compiled from: PG */
/* renamed from: dvoh  reason: default package */
/* loaded from: classes.dex */
public final class dvoh extends dsqw<dvoh, dvog> implements dssk {
    public static final dvoh g;
    private static volatile dssr<dvoh> i;
    public boolean a;
    public float b = 13.0f;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    private int h;

    static {
        dvoh dvohVar = new dvoh();
        g = dvohVar;
        dsqw.cc(dvoh.class, dvohVar);
    }

    private dvoh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\u0014\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0007ဇ\u0006\u0010ဇ\u000f\u0013ဇ\u0012\u0014ဇ\u0013", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dvoh();
            }
            if (i3 == 4) {
                return new dvog();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dvoh> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dvoh.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
