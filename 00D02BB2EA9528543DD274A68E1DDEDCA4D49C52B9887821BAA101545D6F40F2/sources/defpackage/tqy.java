package defpackage;
/* compiled from: PG */
/* renamed from: tqy  reason: default package */
/* loaded from: classes7.dex */
public final class tqy extends dsqw<tqy, tqw> implements dssk {
    public static final tqy d;
    private static volatile dssr<tqy> e;
    public int a;
    public int b;
    public dssd<Long, Integer> c = dssd.b;

    static {
        tqy tqyVar = new tqy();
        d = tqyVar;
        dsqw.cc(tqy.class, tqyVar);
    }

    private tqy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဌ\u0000\u00022", new Object[]{"a", "b", dqvj.d(), "c", tqx.a});
            }
            if (i2 == 3) {
                return new tqy();
            }
            if (i2 == 4) {
                return new tqw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<tqy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (tqy.class) {
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
