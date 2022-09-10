package defpackage;
/* compiled from: PG */
/* renamed from: dhex  reason: default package */
/* loaded from: classes6.dex */
public final class dhex extends dsqw<dhex, dheu> implements dssk {
    public static final dhex c;
    private static volatile dssr<dhex> d;
    public dhds a;
    public dsrf b;

    static {
        dhex dhexVar = new dhex();
        c = dhexVar;
        dsqw.cc(dhex.class, dhexVar);
    }

    private dhex() {
        dssu<Object> dssuVar = dssu.b;
        this.b = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0007\t\u0002\u0000\u0001\u0000\u0007\t\t,", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhex();
            }
            if (i2 == 4) {
                return new dheu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhex> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhex.class) {
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
        dsrf dsrfVar = this.b;
        if (!dsrfVar.a()) {
            this.b = dsqw.cg(dsrfVar);
        }
    }
}
