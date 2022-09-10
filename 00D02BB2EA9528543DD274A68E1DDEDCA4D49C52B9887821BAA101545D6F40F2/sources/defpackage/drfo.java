package defpackage;
/* compiled from: PG */
/* renamed from: drfo  reason: default package */
/* loaded from: classes6.dex */
public final class drfo extends dsqw<drfo, drfd> implements dssk {
    public static final drfo g;
    private static volatile dssr<drfo> i;
    public Object b;
    public drfq c;
    public int f;
    private int h;
    public int a = 0;
    public String d = "";
    public String e = "";

    static {
        drfo drfoVar = new drfo();
        g = drfoVar;
        dsqw.cc(drfo.class, drfoVar);
    }

    private drfo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0006ဈ\u0002\u0007ဌ\u0004", new Object[]{"b", "a", "h", "c", "d", drfl.class, drff.class, "e", "f", drfm.a});
            }
            if (i3 == 3) {
                return new drfo();
            }
            if (i3 == 4) {
                return new drfd();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<drfo> dssrVar = i;
            if (dssrVar == null) {
                synchronized (drfo.class) {
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
