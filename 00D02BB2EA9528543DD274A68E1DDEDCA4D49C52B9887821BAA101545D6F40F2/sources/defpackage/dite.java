package defpackage;
/* compiled from: PG */
/* renamed from: dite  reason: default package */
/* loaded from: classes6.dex */
public final class dite extends dsqw<dite, ditd> implements dssk {
    public static final dite c;
    private static volatile dssr<dite> d;
    public int a;
    public dqzl b;

    static {
        dite diteVar = new dite();
        c = diteVar;
        dsqw.cc(dite.class, diteVar);
    }

    private dite() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dite();
            }
            if (i2 == 4) {
                return new ditd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dite> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dite.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
