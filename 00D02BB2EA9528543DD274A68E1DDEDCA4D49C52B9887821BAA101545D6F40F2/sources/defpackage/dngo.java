package defpackage;
/* compiled from: PG */
/* renamed from: dngo  reason: default package */
/* loaded from: classes6.dex */
public final class dngo extends dsqw<dngo, dngn> implements dssk {
    public static final dngo f;
    private static volatile dssr<dngo> g;
    public int a;
    public dnwn b;
    public dono c;
    public boolean d;
    public dsrj<dplt> e;

    static {
        dngo dngoVar = new dngo();
        f = dngoVar;
        dsqw.cc(dngo.class, dngoVar);
    }

    private dngo() {
        dssu<Object> dssuVar = dssu.b;
        this.e = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0005ဇ\u0003\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", dplt.class});
            }
            if (i2 == 3) {
                return new dngo();
            }
            if (i2 == 4) {
                return new dngn();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dngo> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dngo.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
