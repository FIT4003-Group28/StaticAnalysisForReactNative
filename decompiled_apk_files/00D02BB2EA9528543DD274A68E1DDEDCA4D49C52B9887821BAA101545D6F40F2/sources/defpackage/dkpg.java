package defpackage;
/* compiled from: PG */
/* renamed from: dkpg  reason: default package */
/* loaded from: classes.dex */
public final class dkpg extends dsqw<dkpg, dkpf> implements dssk {
    public static final dkpg e;
    private static volatile dssr<dkpg> g;
    public int a;
    public int b;
    public int c;
    public int d;
    private int f;

    static {
        dkpg dkpgVar = new dkpg();
        e = dkpgVar;
        dsqw.cc(dkpg.class, dkpgVar);
    }

    private dkpg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dkpg();
            }
            if (i2 == 4) {
                return new dkpf();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkpg> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkpg.class) {
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
