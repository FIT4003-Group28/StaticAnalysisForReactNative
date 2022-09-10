package defpackage;
/* compiled from: PG */
/* renamed from: duls */
/* loaded from: classes6.dex */
public final class duls extends dsqw<duls, duli> implements dssk {
    public static final duls g;
    private static volatile dssr<duls> i;
    public int a;
    public int b = 1;
    public dsrf c = dsqz.b;
    public dsrf d = dsqz.b;
    public dsrj<dulo> e = dssu.b;
    public dsrf f = dsqz.b;
    private int h = 1;

    static {
        duls dulsVar = new duls();
        g = dulsVar;
        dsqw.cc(duls.class, dulsVar);
    }

    private duls() {
    }

    public static /* synthetic */ void c(duls dulsVar) {
        dulsVar.a |= 8;
        dulsVar.h = 2;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0004\u0000\u0001\u001b\u0005င\u0003\u0006\u001e\u0007\u001e\b\u001e\nဌ\u0000", new Object[]{"a", "e", dulo.class, "h", "c", dulk.c(), "d", duly.c(), "f", dulq.c(), "b", dulr.a});
            }
            if (i3 == 3) {
                return new duls();
            }
            if (i3 == 4) {
                return new duli();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<duls> dssrVar = i;
            if (dssrVar == null) {
                synchronized (duls.class) {
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
