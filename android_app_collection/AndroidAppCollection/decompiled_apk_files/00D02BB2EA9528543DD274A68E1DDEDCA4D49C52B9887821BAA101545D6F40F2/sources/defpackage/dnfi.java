package defpackage;
/* compiled from: PG */
/* renamed from: dnfi  reason: default package */
/* loaded from: classes6.dex */
public final class dnfi extends dsqw<dnfi, dnfh> implements dssk {
    public static final dnfi d;
    private static volatile dssr<dnfi> e;
    public int a;
    public String b = "";
    public float c;

    static {
        dnfi dnfiVar = new dnfi();
        d = dnfiVar;
        dsqw.cc(dnfi.class, dnfiVar);
    }

    private dnfi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dnfi();
            }
            if (i2 == 4) {
                return new dnfh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnfi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnfi.class) {
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
