package defpackage;
/* compiled from: PG */
/* renamed from: dxss  reason: default package */
/* loaded from: classes6.dex */
public final class dxss extends dsqw<dxss, dxsr> implements dssk {
    public static final dxss d;
    private static volatile dssr<dxss> e;
    public int a = 0;
    public Object b;
    public int c;

    static {
        dxss dxssVar = new dxss();
        d = dxssVar;
        dsqw.cc(dxss.class, dxssVar);
    }

    private dxss() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\r\u0001\u0000\u0001\r\r\u0000\u0000\u0000\u0001\f\u0002:\u0000\u0003:\u0000\u0004:\u0000\u0005:\u0000\u0006:\u0000\u0007:\u0000\b<\u0000\t<\u0000\n7\u0000\u000b<\u0000\f?\u0000\r<\u0000", new Object[]{"b", "a", "c", dugy.class, dugy.class, dxsu.class, dxsi.class});
            }
            if (i2 == 3) {
                return new dxss();
            }
            if (i2 == 4) {
                return new dxsr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxss> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxss.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
