package defpackage;
/* compiled from: PG */
/* renamed from: dqfq  reason: default package */
/* loaded from: classes.dex */
public final class dqfq extends dsqw<dqfq, dqfp> implements dssk {
    public static final dqfq h;
    private static volatile dssr<dqfq> i;
    public int a;
    public dqpe c;
    public int g;
    public String b = "";
    public String d = "";
    public String e = "";
    public dsrj<dqfo> f = dssu.b;

    static {
        dqfq dqfqVar = new dqfq();
        h = dqfqVar;
        dsqw.cc(dqfq.class, dqfqVar);
    }

    private dqfq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဉ\u0001\u0002\u001b\u0003ဌ\u0005\u0004ဈ\u0000\u0006ဈ\u0002\u0007ဈ\u0003", new Object[]{"a", "c", "f", dqfo.class, "g", drbs.a, "b", "d", "e"});
            }
            if (i3 == 3) {
                return new dqfq();
            }
            if (i3 == 4) {
                return new dqfp();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dqfq> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dqfq.class) {
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
