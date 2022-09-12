package defpackage;
/* compiled from: PG */
/* renamed from: djtq  reason: default package */
/* loaded from: classes6.dex */
public final class djtq extends dsqw<djtq, djtm> implements dssk {
    public static final djtq f;
    private static volatile dssr<djtq> g;
    public int a;
    public String b = "";
    public dsrj<djto> c = dssu.b;
    public int d = 1;
    public int e;

    static {
        djtq djtqVar = new djtq();
        f = djtqVar;
        dsqw.cc(djtq.class, djtqVar);
    }

    private djtq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"a", "b", "c", djto.class, "d", dgfb.c(), "e", djtp.a});
            }
            if (i2 == 3) {
                return new djtq();
            }
            if (i2 == 4) {
                return new djtm();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djtq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djtq.class) {
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
