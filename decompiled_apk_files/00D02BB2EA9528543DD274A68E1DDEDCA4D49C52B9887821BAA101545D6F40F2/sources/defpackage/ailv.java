package defpackage;
/* compiled from: PG */
/* renamed from: ailv  reason: default package */
/* loaded from: classes2.dex */
public final class ailv extends dsqw<ailv, ailu> implements dssk {
    public static final ailv e;
    private static volatile dssr<ailv> f;
    public int a;
    public long c;
    public dspd b = dspd.b;
    public dsrj<dspd> d = dssu.b;

    static {
        ailv ailvVar = new ailv();
        e = ailvVar;
        dsqw.cc(ailv.class, ailvVar);
    }

    private ailv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0001\u0000\u0003ည\u0000\u0004ဂ\u0001\u0005\u001c", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ailv();
            }
            if (i2 == 4) {
                return new ailu();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ailv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ailv.class) {
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
