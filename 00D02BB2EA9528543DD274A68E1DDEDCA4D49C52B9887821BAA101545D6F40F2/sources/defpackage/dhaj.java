package defpackage;
/* compiled from: PG */
/* renamed from: dhaj  reason: default package */
/* loaded from: classes6.dex */
public final class dhaj extends dsqw<dhaj, dhai> implements dssk {
    public static final dhaj c;
    private static volatile dssr<dhaj> d;
    public dsrj<String> a = dssu.b;
    public dstn b;

    static {
        dhaj dhajVar = new dhaj();
        c = dhajVar;
        dsqw.cc(dhaj.class, dhajVar);
    }

    private dhaj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhaj();
            }
            if (i2 == 4) {
                return new dhai();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhaj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhaj.class) {
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
        dsrj<String> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
