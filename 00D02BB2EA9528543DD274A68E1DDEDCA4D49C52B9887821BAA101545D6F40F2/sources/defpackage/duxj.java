package defpackage;
/* compiled from: PG */
/* renamed from: duxj  reason: default package */
/* loaded from: classes.dex */
public final class duxj extends dsqw<duxj, duxi> implements dssk {
    public static final duxj j;
    private static volatile dssr<duxj> l;
    public int a = 100;
    public int b = 50;
    public int c = 100;
    public int d = 100;
    public int e = 100;
    public int f = 100;
    public int g = 100;
    public int h = 100;
    public int i = 100;
    private int k;

    static {
        duxj duxjVar = new duxj();
        j = duxjVar;
        dsqw.cc(duxj.class, duxjVar);
    }

    private duxj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b", new Object[]{"k", "a", "b", "c", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new duxj();
            }
            if (i2 == 4) {
                return new duxi();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duxj> dssrVar = l;
            if (dssrVar == null) {
                synchronized (duxj.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
