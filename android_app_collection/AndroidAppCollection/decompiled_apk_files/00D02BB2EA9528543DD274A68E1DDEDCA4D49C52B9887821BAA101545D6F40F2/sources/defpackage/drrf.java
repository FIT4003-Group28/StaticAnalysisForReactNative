package defpackage;
/* compiled from: PG */
/* renamed from: drrf  reason: default package */
/* loaded from: classes6.dex */
public final class drrf extends dsqw<drrf, drre> implements dssk {
    public static final dsrg<Integer, dodv> b = new drrc();
    public static final dsrg<Integer, dodx> e = new drrd();
    public static final drrf i;
    private static volatile dssr<drrf> k;
    public int c;
    public drpo g;
    private int j;
    public dsrf a = dsqz.b;
    public dsrf d = dsqz.b;
    public int f = 5;
    public dsrj<String> h = dssu.b;

    static {
        drrf drrfVar = new drrf();
        i = drrfVar;
        dsqw.cc(drrf.class, drrfVar);
    }

    private drrf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001\u001e\u0002ဌ\u0000\u0003\u001e\u0004ဌ\u0002\u0005ဉ\u0003\u0006\u001a", new Object[]{"j", "a", dodv.c(), "c", dody.a, "d", dodx.c(), "f", dodx.c(), "g", "h"});
            }
            if (i3 == 3) {
                return new drrf();
            }
            if (i3 == 4) {
                return new drre();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<drrf> dssrVar = k;
            if (dssrVar == null) {
                synchronized (drrf.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
