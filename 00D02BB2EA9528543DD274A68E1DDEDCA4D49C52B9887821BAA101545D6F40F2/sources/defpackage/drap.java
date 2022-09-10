package defpackage;
/* compiled from: PG */
/* renamed from: drap  reason: default package */
/* loaded from: classes6.dex */
public final class drap extends dsqw<drap, drao> implements dssk {
    public static final drap c;
    private static volatile dssr<drap> d;
    public int a = 0;
    public Object b;

    static {
        drap drapVar = new drap();
        c = drapVar;
        dsqw.cc(drap.class, drapVar);
    }

    private drap() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001်\u0000\u0002ျ\u0000\u0003့\u0000\u0004ဳ\u0000", new Object[]{"b", "a"});
            }
            if (i2 == 3) {
                return new drap();
            }
            if (i2 == 4) {
                return new drao();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drap> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drap.class) {
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
