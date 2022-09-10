package defpackage;
/* compiled from: PG */
/* renamed from: dnyw  reason: default package */
/* loaded from: classes.dex */
public final class dnyw extends dsqw<dnyw, dnyt> implements dssk {
    public static final dnyw c;
    private static volatile dssr<dnyw> d;
    public dsrf a = dsqz.b;
    public dsrj<dnyv> b = dssu.b;

    static {
        dnyw dnywVar = new dnyw();
        c = dnywVar;
        dsqw.cc(dnyw.class, dnywVar);
    }

    private dnyw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001b", new Object[]{"a", dnwv.c(), "b", dnyv.class});
            }
            if (i2 == 3) {
                return new dnyw();
            }
            if (i2 == 4) {
                return new dnyt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnyw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnyw.class) {
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

    public final void b() {
        dsrf dsrfVar = this.a;
        if (!dsrfVar.a()) {
            this.a = dsqw.cg(dsrfVar);
        }
    }
}
