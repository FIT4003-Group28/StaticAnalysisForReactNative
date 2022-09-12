package defpackage;
/* compiled from: PG */
/* renamed from: eaxz  reason: default package */
/* loaded from: classes6.dex */
public final class eaxz extends dsqw<eaxz, eaxy> implements dssk {
    public static final eaxz e;
    private static volatile dssr<eaxz> f;
    public int a;
    public String b = "";
    public eayb c;
    public eayd d;

    static {
        eaxz eaxzVar = new eaxz();
        e = eaxzVar;
        dsqw.cc(eaxz.class, eaxzVar);
    }

    private eaxz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002\u0004ဉ\u0001", new Object[]{"a", "b", "d", "c"});
            }
            if (i2 == 3) {
                return new eaxz();
            }
            if (i2 == 4) {
                return new eaxy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eaxz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (eaxz.class) {
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
