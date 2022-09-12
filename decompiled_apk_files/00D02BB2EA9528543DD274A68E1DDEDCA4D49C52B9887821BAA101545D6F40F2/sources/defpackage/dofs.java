package defpackage;
/* compiled from: PG */
/* renamed from: dofs  reason: default package */
/* loaded from: classes.dex */
public final class dofs extends dsqw<dofs, dofr> implements dssk {
    public static final dofs f;
    private static volatile dssr<dofs> g;
    public int a;
    public int b;
    public int c;
    public drdk d;
    public String e = "";

    static {
        dofs dofsVar = new dofs();
        f = dofsVar;
        dsqw.cc(dofs.class, dofsVar);
    }

    private dofs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dofs();
            }
            if (i2 == 4) {
                return new dofr();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dofs> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dofs.class) {
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
