package defpackage;
/* compiled from: PG */
/* renamed from: dkdo  reason: default package */
/* loaded from: classes6.dex */
public final class dkdo extends dsqw<dkdo, dkdn> implements dssk {
    public static final dkdo d;
    private static volatile dssr<dkdo> e;
    public dsrj<dkdu> a = dssu.b;
    public dsrj<dhmz> b = dssu.b;
    public dsrj<dhnd> c = dssu.b;

    static {
        dkdo dkdoVar = new dkdo();
        d = dkdoVar;
        dsqw.cc(dkdo.class, dkdoVar);
    }

    private dkdo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"a", dkdu.class, "b", dhmz.class, "c", dhnd.class});
            }
            if (i2 == 3) {
                return new dkdo();
            }
            if (i2 == 4) {
                return new dkdn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkdo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkdo.class) {
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
