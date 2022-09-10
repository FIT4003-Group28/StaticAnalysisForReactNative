package defpackage;
/* compiled from: PG */
/* renamed from: dknd  reason: default package */
/* loaded from: classes6.dex */
public final class dknd extends dsqw<dknd, dknc> implements dssk {
    public static final dknd e;
    private static volatile dssr<dknd> g;
    public boolean a;
    public boolean b;
    public dsrj<String> c = dssu.b;
    public boolean d;
    private int f;

    static {
        dknd dkndVar = new dknd();
        e = dkndVar;
        dsqw.cc(dknd.class, dkndVar);
    }

    private dknd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003\u001a\u0006ဇ\u0004", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dknd();
            }
            if (i2 == 4) {
                return new dknc();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dknd> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dknd.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
