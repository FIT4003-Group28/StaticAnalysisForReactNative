package defpackage;
/* compiled from: PG */
/* renamed from: duhk  reason: default package */
/* loaded from: classes6.dex */
public final class duhk extends dsqw<duhk, duhj> implements dssk {
    public static final duhk e;
    private static volatile dssr<duhk> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        duhk duhkVar = new duhk();
        e = duhkVar;
        dsqw.cc(duhk.class, duhkVar);
    }

    private duhk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new duhk();
            }
            if (i2 == 4) {
                return new duhj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duhk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (duhk.class) {
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
