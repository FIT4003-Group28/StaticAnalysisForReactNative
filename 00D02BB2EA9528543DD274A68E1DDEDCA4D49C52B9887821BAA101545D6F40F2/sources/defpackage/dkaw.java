package defpackage;
/* compiled from: PG */
/* renamed from: dkaw  reason: default package */
/* loaded from: classes6.dex */
public final class dkaw extends dsqw<dkaw, dkav> implements dssk {
    public static final dkaw c;
    private static volatile dssr<dkaw> e;
    public dpri a;
    public dpql b;
    private int d;

    static {
        dkaw dkawVar = new dkaw();
        c = dkawVar;
        dsqw.cc(dkaw.class, dkawVar);
    }

    private dkaw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dkaw();
            }
            if (i2 == 4) {
                return new dkav();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkaw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkaw.class) {
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
