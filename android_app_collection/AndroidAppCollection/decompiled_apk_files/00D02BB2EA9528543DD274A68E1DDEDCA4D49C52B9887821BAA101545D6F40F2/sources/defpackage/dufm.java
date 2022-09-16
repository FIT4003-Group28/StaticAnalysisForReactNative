package defpackage;
/* compiled from: PG */
/* renamed from: dufm  reason: default package */
/* loaded from: classes6.dex */
public final class dufm extends dsqw<dufm, dufl> implements dssk {
    public static final dufm g;
    private static volatile dssr<dufm> i;
    public int a;
    public boolean c;
    public boolean e;
    private int h;
    public String b = "";
    public dsrj<duel> d = dssu.b;
    public dsrj<duef> f = dssu.b;

    static {
        dufm dufmVar = new dufm();
        g = dufmVar;
        dsqw.cc(dufm.class, dufmVar);
    }

    private dufm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0003\u000f\u0006\u0000\u0002\u0000\u0003ဇ\u0004\u0007ဇ\u0006\tဈ\u0003\n\u001b\r\u001b\u000fဌ\u0001", new Object[]{"h", "c", "e", "b", "f", duef.class, "d", duel.class, "a", duej.c()});
            }
            if (i3 == 3) {
                return new dufm();
            }
            if (i3 == 4) {
                return new dufl();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dufm> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dufm.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
