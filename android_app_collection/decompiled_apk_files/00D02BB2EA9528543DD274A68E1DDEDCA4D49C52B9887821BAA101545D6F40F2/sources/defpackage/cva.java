package defpackage;
/* compiled from: PG */
/* renamed from: cva  reason: default package */
/* loaded from: classes5.dex */
public final class cva extends dsqw<cva, cuz> implements dssk {
    public static final cva h;
    private static volatile dssr<cva> i;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f = "";
    public boolean g;

    static {
        cva cvaVar = new cva();
        h = cvaVar;
        dsqw.cc(cva.class, cvaVar);
    }

    private cva() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဈ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new cva();
            }
            if (i3 == 4) {
                return new cuz();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<cva> dssrVar = i;
            if (dssrVar == null) {
                synchronized (cva.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
