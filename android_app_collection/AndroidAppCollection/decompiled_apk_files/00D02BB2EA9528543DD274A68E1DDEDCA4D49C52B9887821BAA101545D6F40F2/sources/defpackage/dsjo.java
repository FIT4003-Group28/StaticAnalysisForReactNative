package defpackage;
/* compiled from: PG */
/* renamed from: dsjo  reason: default package */
/* loaded from: classes6.dex */
public final class dsjo extends dsqw<dsjo, dsjl> implements dssk {
    public static final dsjo e;
    private static volatile dssr<dsjo> f;
    public int a;
    public int b = 3;
    public long c;
    public long d;

    static {
        dsjo dsjoVar = new dsjo();
        e = dsjoVar;
        dsqw.cc(dsjo.class, dsjoVar);
    }

    private dsjo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", dsjm.a, "c", "d"});
            }
            if (i2 == 3) {
                return new dsjo();
            }
            if (i2 == 4) {
                return new dsjl();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsjo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsjo.class) {
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
