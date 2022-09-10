package defpackage;
/* compiled from: PG */
/* renamed from: dqco  reason: default package */
/* loaded from: classes6.dex */
public final class dqco extends dsqw<dqco, dqcn> implements dssk {
    public static final dqco g;
    private static volatile dssr<dqco> i;
    public int a;
    public int c;
    private int h;
    public String b = "";
    public boolean d = true;
    public boolean e = true;
    public dsrj<dqcq> f = dssu.b;

    static {
        dqco dqcoVar = new dqco();
        g = dqcoVar;
        dsqw.cc(dqco.class, dqcoVar);
    }

    private dqco() {
    }

    public static /* synthetic */ void b(dqco dqcoVar) {
        dqcoVar.a |= 4;
        dqcoVar.h = 1;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007\u001b", new Object[]{"a", "b", "c", "h", "d", "e", "f", dqcq.class});
            }
            if (i3 == 3) {
                return new dqco();
            }
            if (i3 == 4) {
                return new dqcn();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dqco> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dqco.class) {
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
