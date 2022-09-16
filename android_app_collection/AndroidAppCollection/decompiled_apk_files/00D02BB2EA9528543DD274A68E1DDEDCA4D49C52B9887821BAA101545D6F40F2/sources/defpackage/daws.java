package defpackage;
/* compiled from: PG */
/* renamed from: daws  reason: default package */
/* loaded from: classes5.dex */
public final class daws extends dsqw<daws, dawr> implements dssk {
    public static final daws c;
    private static volatile dssr<daws> d;
    public int a;
    public dawy b;

    static {
        daws dawsVar = new daws();
        c = dawsVar;
        dsqw.cc(daws.class, dawsVar);
    }

    private daws() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new daws();
            }
            if (i2 == 4) {
                return new dawr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<daws> dssrVar = d;
            if (dssrVar == null) {
                synchronized (daws.class) {
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
