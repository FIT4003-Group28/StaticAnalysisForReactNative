package defpackage;
/* compiled from: PG */
/* renamed from: cgcr  reason: default package */
/* loaded from: classes4.dex */
public final class cgcr extends dsqw<cgcr, cgcl> implements dssk {
    public static final cgcr b;
    private static volatile dssr<cgcr> c;
    public dsrj<cgcq> a = dssu.b;

    static {
        cgcr cgcrVar = new cgcr();
        b = cgcrVar;
        dsqw.cc(cgcr.class, cgcrVar);
    }

    private cgcr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cgcq.class});
            }
            if (i2 == 3) {
                return new cgcr();
            }
            if (i2 == 4) {
                return new cgcl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cgcr> dssrVar = c;
            if (dssrVar == null) {
                synchronized (cgcr.class) {
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
        dsrj<cgcq> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
