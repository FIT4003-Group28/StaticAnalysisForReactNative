package defpackage;
/* compiled from: PG */
/* renamed from: dqjt  reason: default package */
/* loaded from: classes6.dex */
public final class dqjt extends dsqw<dqjt, dqjs> implements dssk {
    public static final dqjt d;
    private static volatile dssr<dqjt> e;
    public int a;
    public long b;
    public int c;

    static {
        dqjt dqjtVar = new dqjt();
        d = dqjtVar;
        dsqw.cc(dqjt.class, dqjtVar);
    }

    private dqjt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqjt();
            }
            if (i2 == 4) {
                return new dqjs();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqjt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqjt.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
