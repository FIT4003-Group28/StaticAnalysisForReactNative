package defpackage;
/* compiled from: PG */
/* renamed from: dkuk  reason: default package */
/* loaded from: classes.dex */
public final class dkuk extends dsqw<dkuk, dkud> implements dssk {
    public static final dkuk e;
    private static volatile dssr<dkuk> g;
    public int a;
    public int b = 1;
    public int c;
    public dkuf d;
    private int f;

    static {
        dkuk dkukVar = new dkuk();
        e = dkukVar;
        dsqw.cc(dkuk.class, dkukVar);
    }

    private dkuk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"f", "a", dktk.c(), "b", dkui.a, "c", "d"});
            }
            if (i2 == 3) {
                return new dkuk();
            }
            if (i2 == 4) {
                return new dkud();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkuk> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkuk.class) {
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
