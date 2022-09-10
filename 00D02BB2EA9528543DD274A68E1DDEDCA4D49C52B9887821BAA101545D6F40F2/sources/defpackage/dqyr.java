package defpackage;
/* compiled from: PG */
/* renamed from: dqyr  reason: default package */
/* loaded from: classes6.dex */
public final class dqyr extends dsqw<dqyr, dqyq> implements dssk {
    public static final dqyr b;
    private static volatile dssr<dqyr> d;
    public String a = "";
    private int c;

    static {
        dqyr dqyrVar = new dqyr();
        b = dqyrVar;
        dsqw.cc(dqyr.class, dqyrVar);
    }

    private dqyr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dqyr();
            }
            if (i2 == 4) {
                return new dqyq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqyr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqyr.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
