package defpackage;
/* compiled from: PG */
/* renamed from: dkjo  reason: default package */
/* loaded from: classes6.dex */
public final class dkjo extends dsqw<dkjo, dkjl> implements dssk {
    public static final dkjo h;
    private static volatile dssr<dkjo> j;
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public dsrj<dkjn> g = dssu.b;
    private int i;

    static {
        dkjo dkjoVar = new dkjo();
        h = dkjoVar;
        dsqw.cc(dkjo.class, dkjoVar);
    }

    private dkjo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005င\u0004\u0006\u001b\u0007င\u0005", new Object[]{"i", "a", "b", "c", "d", "e", "g", dkjn.class, "f"});
            }
            if (i2 == 3) {
                return new dkjo();
            }
            if (i2 == 4) {
                return new dkjl();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkjo> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dkjo.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
