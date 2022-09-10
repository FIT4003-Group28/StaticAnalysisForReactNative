package defpackage;
/* compiled from: PG */
/* renamed from: dshl  reason: default package */
/* loaded from: classes6.dex */
public final class dshl extends dsqw<dshl, dshj> implements dssk {
    public static final dshl c;
    private static volatile dssr<dshl> d;
    public int a = 0;
    public Object b;

    static {
        dshl dshlVar = new dshl();
        c = dshlVar;
        dsqw.cc(dshl.class, dshlVar);
    }

    private dshl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000\u0003ျ\u0000", new Object[]{"b", "a"});
            }
            if (i2 == 3) {
                return new dshl();
            }
            if (i2 == 4) {
                return new dshj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dshl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dshl.class) {
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
