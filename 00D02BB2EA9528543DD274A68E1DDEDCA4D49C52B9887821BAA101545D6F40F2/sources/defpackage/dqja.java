package defpackage;
/* compiled from: PG */
/* renamed from: dqja  reason: default package */
/* loaded from: classes.dex */
public final class dqja extends dsqw<dqja, dqix> implements dssk {
    public static final dqja g;
    private static volatile dssr<dqja> i;
    public Object b;
    public boolean c;
    public dqiw d;
    public int f;
    private int h;
    public int a = 0;
    public String e = "";

    static {
        dqja dqjaVar = new dqja();
        g = dqjaVar;
        dsqw.cc(dqja.class, dqjaVar);
    }

    private dqja() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဿ\u0000\u0005့\u0000\u0006့\u0000\u0007ဌ\u0006", new Object[]{"b", "a", "h", "c", "d", "e", dqiz.c(), "f", dqis.c()});
            }
            if (i3 == 3) {
                return new dqja();
            }
            if (i3 == 4) {
                return new dqix();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dqja> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dqja.class) {
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
