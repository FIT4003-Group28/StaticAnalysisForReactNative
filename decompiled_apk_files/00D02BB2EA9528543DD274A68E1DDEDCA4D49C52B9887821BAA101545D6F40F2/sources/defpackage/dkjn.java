package defpackage;
/* compiled from: PG */
/* renamed from: dkjn  reason: default package */
/* loaded from: classes6.dex */
public final class dkjn extends dsqw<dkjn, dkjm> implements dssk {
    public static final dkjn c;
    private static volatile dssr<dkjn> e;
    public int a;
    public int b;
    private int d;

    static {
        dkjn dkjnVar = new dkjn();
        c = dkjnVar;
        dsqw.cc(dkjn.class, dkjnVar);
    }

    private dkjn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dkjn();
            }
            if (i2 == 4) {
                return new dkjm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkjn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkjn.class) {
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
