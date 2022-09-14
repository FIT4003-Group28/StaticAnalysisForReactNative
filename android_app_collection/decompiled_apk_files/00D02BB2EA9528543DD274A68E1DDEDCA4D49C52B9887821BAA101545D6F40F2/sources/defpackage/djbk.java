package defpackage;
/* compiled from: PG */
/* renamed from: djbk  reason: default package */
/* loaded from: classes6.dex */
public final class djbk extends dsqw<djbk, djbj> implements dssk {
    public static final djbk e;
    private static volatile dssr<djbk> f;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        djbk djbkVar = new djbk();
        e = djbkVar;
        dsqw.cc(djbk.class, djbkVar);
    }

    private djbk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new djbk();
            }
            if (i2 == 4) {
                return new djbj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djbk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djbk.class) {
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
