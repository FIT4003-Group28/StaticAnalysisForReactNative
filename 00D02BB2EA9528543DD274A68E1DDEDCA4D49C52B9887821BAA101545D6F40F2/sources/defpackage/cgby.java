package defpackage;
/* compiled from: PG */
/* renamed from: cgby  reason: default package */
/* loaded from: classes4.dex */
public final class cgby extends dsqw<cgby, cgbx> implements dssk {
    public static final cgby b;
    private static volatile dssr<cgby> c;
    public dsrj<drnp> a = dssu.b;

    static {
        cgby cgbyVar = new cgby();
        b = cgbyVar;
        dsqw.cc(cgby.class, cgbyVar);
    }

    private cgby() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", drnp.class});
            }
            if (i2 == 3) {
                return new cgby();
            }
            if (i2 == 4) {
                return new cgbx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cgby> dssrVar = c;
            if (dssrVar == null) {
                synchronized (cgby.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<drnp> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
