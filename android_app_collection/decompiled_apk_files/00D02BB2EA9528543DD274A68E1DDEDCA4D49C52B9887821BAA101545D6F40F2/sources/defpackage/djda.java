package defpackage;
/* compiled from: PG */
/* renamed from: djda  reason: default package */
/* loaded from: classes6.dex */
public final class djda extends dsqw<djda, djcz> implements dssk {
    public static final djda c;
    private static volatile dssr<djda> e;
    public dmbw a;
    public drkr b;
    private int d;

    static {
        djda djdaVar = new djda();
        c = djdaVar;
        dsqw.cc(djda.class, djdaVar);
    }

    private djda() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new djda();
            }
            if (i2 == 4) {
                return new djcz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djda> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djda.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
