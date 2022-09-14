package defpackage;
/* compiled from: PG */
/* renamed from: dqfd  reason: default package */
/* loaded from: classes6.dex */
public final class dqfd extends dsqw<dqfd, dqfa> implements dssk {
    public static final dqfd e;
    private static volatile dssr<dqfd> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        dqfd dqfdVar = new dqfd();
        e = dqfdVar;
        dsqw.cc(dqfd.class, dqfdVar);
    }

    private dqfd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", dqfc.c(), "c", dfqf.a, "d", dfpz.a});
            }
            if (i2 == 3) {
                return new dqfd();
            }
            if (i2 == 4) {
                return new dqfa();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqfd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqfd.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
