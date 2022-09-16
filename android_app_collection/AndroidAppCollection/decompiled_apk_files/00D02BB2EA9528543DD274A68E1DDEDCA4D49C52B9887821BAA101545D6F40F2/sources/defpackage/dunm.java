package defpackage;
/* compiled from: PG */
/* renamed from: dunm  reason: default package */
/* loaded from: classes.dex */
public final class dunm extends dsqw<dunm, dunl> implements dssk {
    public static final dunm n;
    private static volatile dssr<dunm> p;
    public boolean a;
    public boolean b = true;
    public int c = 31;
    public int d = 540;
    public int e = 1020;
    public String f = "";
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    private int o;

    static {
        dunm dunmVar = new dunm();
        n = dunmVar;
        dsqw.cc(dunm.class, dunmVar);
    }

    private dunm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\r\u0000\u0001\u0001\u0018\r\u0000\u0000\u0000\u0001င\u0002\u0002င\u0003\u0003င\u0004\u0004ဇ\u0000\u0005ဇ\u0001\u0007ဈ\u0006\bဇ\u0007\nဇ\t\rဇ\n\u0012ဇ\u0011\u0014ဇ\u0012\u0015ဇ\u0013\u0018ဇ\u0014", new Object[]{"o", "c", "d", "e", "a", "b", "f", "g", "h", "i", "j", "k", "l", "m"});
            }
            if (i2 == 3) {
                return new dunm();
            }
            if (i2 == 4) {
                return new dunl();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dunm> dssrVar = p;
            if (dssrVar == null) {
                synchronized (dunm.class) {
                    dssrVar = p;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        p = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
