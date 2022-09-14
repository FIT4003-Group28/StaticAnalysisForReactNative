package defpackage;
/* compiled from: PG */
/* renamed from: cguj  reason: default package */
/* loaded from: classes4.dex */
public final class cguj extends dsqw<cguj, cgty> implements dssk {
    public static final cguj e;
    private static volatile dssr<cguj> f;
    public int a;
    public cgui c;
    public dsrj<cguc> b = dssu.b;
    public dsrj<cgug> d = dssu.b;

    static {
        cguj cgujVar = new cguj();
        e = cgujVar;
        dsqw.cc(cguj.class, cgujVar);
    }

    private cguj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0002\u0000\u0002\u001b\u0003ဉ\u0000\u0004\u001b", new Object[]{"a", "b", cguc.class, "c", "d", cgug.class});
            }
            if (i2 == 3) {
                return new cguj();
            }
            if (i2 == 4) {
                return new cgty();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cguj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (cguj.class) {
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

    public final void b() {
        dsrj<cgug> dsrjVar = this.d;
        if (!dsrjVar.a()) {
            this.d = dsqw.cl(dsrjVar);
        }
    }
}
