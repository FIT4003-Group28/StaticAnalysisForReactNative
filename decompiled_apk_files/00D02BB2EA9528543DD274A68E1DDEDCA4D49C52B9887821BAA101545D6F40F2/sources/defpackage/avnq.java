package defpackage;
/* compiled from: PG */
/* renamed from: avnq  reason: default package */
/* loaded from: classes3.dex */
public final class avnq extends dsqw<avnq, avnp> implements dssk {
    public static final avnq d;
    private static volatile dssr<avnq> e;
    public int a;
    public int b;
    public dspd c = dspd.b;

    static {
        avnq avnqVar = new avnq();
        d = avnqVar;
        dsqw.cc(avnq.class, avnqVar);
    }

    private avnq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new avnq();
            }
            if (i2 == 4) {
                return new avnp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<avnq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (avnq.class) {
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
