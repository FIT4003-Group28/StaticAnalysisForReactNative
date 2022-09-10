package defpackage;
/* compiled from: PG */
/* renamed from: djca  reason: default package */
/* loaded from: classes6.dex */
public final class djca extends dsqw<djca, djbz> implements dssk {
    public static final djca d;
    private static volatile dssr<djca> f;
    public djbt a;
    public djbo b;
    public djbr c;
    private int e;

    static {
        djca djcaVar = new djca();
        d = djcaVar;
        dsqw.cc(djca.class, djcaVar);
    }

    private djca() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new djca();
            }
            if (i2 == 4) {
                return new djbz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djca> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djca.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
