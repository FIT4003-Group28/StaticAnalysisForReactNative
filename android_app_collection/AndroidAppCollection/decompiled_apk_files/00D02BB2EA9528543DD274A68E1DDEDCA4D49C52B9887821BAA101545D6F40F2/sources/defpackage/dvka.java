package defpackage;
/* compiled from: PG */
/* renamed from: dvka  reason: default package */
/* loaded from: classes.dex */
public final class dvka extends dsqw<dvka, dvjx> implements dssk {
    public static final dvka i;
    private static volatile dssr<dvka> k;
    public int a;
    public int b;
    public int c;
    public int d;
    public long e;
    public dqgu g;
    private int j;
    public long f = 255600000;
    public dsrj<dvjz> h = dssu.b;

    static {
        dvka dvkaVar = new dvka();
        i = dvkaVar;
        dsqw.cc(dvka.class, dvkaVar);
    }

    private dvka() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0001\u0000\u0001င\u0000\u0002င\u0002\u0003ဂ\u0004\u0004ဂ\u0005\u0006င\u0001\u0007င\u0003\t\u001b\u000bဉ\b", new Object[]{"j", "a", "c", "e", "f", "b", "d", "h", dvjz.class, "g"});
            }
            if (i3 == 3) {
                return new dvka();
            }
            if (i3 == 4) {
                return new dvjx();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dvka> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dvka.class) {
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
