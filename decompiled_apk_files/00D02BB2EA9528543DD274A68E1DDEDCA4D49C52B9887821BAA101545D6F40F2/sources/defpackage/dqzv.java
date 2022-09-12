package defpackage;
/* compiled from: PG */
/* renamed from: dqzv  reason: default package */
/* loaded from: classes6.dex */
public final class dqzv extends dsqw<dqzv, dqzo> implements dssk {
    public static final dqzv h;
    private static volatile dssr<dqzv> i;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public dqzn e;
    public long f;
    public dqzu g;

    static {
        dqzv dqzvVar = new dqzv();
        h = dqzvVar;
        dsqw.cc(dqzv.class, dqzvVar);
    }

    private dqzv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ဂ\u0004\u0004ဌ\u0002\u0005ဉ\u0005\u0006ဉ\u0003", new Object[]{"c", "b", "a", dqyj.class, dqyb.class, "f", "d", dqzp.a, "g", "e"});
            }
            if (i3 == 3) {
                return new dqzv();
            }
            if (i3 == 4) {
                return new dqzo();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dqzv> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dqzv.class) {
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
