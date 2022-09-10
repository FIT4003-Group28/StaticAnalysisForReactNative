package defpackage;
/* compiled from: PG */
/* renamed from: dnjn  reason: default package */
/* loaded from: classes6.dex */
public final class dnjn extends dsqw<dnjn, dnjm> implements dssk {
    public static final dnjn c;
    private static volatile dssr<dnjn> d;
    public int a;
    public boolean b;

    static {
        dnjn dnjnVar = new dnjn();
        c = dnjnVar;
        dsqw.cc(dnjn.class, dnjnVar);
    }

    private dnjn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnjn();
            }
            if (i2 == 4) {
                return new dnjm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnjn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnjn.class) {
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
