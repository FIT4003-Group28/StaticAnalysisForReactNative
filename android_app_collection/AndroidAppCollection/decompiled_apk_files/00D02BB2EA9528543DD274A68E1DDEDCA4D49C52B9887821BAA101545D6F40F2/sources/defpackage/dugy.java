package defpackage;
/* compiled from: PG */
/* renamed from: dugy  reason: default package */
/* loaded from: classes6.dex */
public final class dugy extends dsqw<dugy, dugx> implements dssk {
    public static final dugy e;
    private static volatile dssr<dugy> f;
    public float a;
    public float b;
    public float c;
    public dsqm d;

    static {
        dugy dugyVar = new dugy();
        e = dugyVar;
        dsqw.cc(dugy.class, dugyVar);
    }

    private dugy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\t", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dugy();
            }
            if (i2 == 4) {
                return new dugx();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dugy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dugy.class) {
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
