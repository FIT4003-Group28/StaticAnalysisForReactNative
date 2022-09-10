package defpackage;
/* compiled from: PG */
/* renamed from: dock  reason: default package */
/* loaded from: classes6.dex */
public final class dock extends dsqw<dock, docj> implements dssk {
    public static final dock c;
    private static volatile dssr<dock> d;
    public int a;
    public String b = "";

    static {
        dock dockVar = new dock();
        c = dockVar;
        dsqw.cc(dock.class, dockVar);
    }

    private dock() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dock();
            }
            if (i2 == 4) {
                return new docj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dock> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dock.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
