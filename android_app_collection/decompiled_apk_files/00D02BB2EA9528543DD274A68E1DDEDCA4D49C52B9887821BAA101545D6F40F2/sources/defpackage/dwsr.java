package defpackage;
/* compiled from: PG */
/* renamed from: dwsr  reason: default package */
/* loaded from: classes6.dex */
public final class dwsr extends dsqw<dwsr, dwso> implements dssk {
    public static final dwsr g;
    private static volatile dssr<dwsr> i;
    public int a;
    public dwsq f;
    private byte h = 2;
    public dsrj<dwrc> b = dssu.b;
    public dspd c = dspd.b;
    public String d = "";
    public dsrj<dwqg> e = dssu.b;

    static {
        dwsr dwsrVar = new dwsr();
        g = dwsrVar;
        dsqw.cc(dwsr.class, dwsrVar);
    }

    private dwsr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0001\u0001\u001b\u0002ည\u0000\u0003ဈ\u0001\u0004Л\u0005ဉ\u0002", new Object[]{"a", "b", dwrc.class, "c", "d", "e", dwqg.class, "f"});
            }
            if (i3 == 3) {
                return new dwsr();
            }
            if (i3 == 4) {
                return new dwso();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dwsr> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dwsr.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }

    public final void c() {
        dsrj<dwqg> dsrjVar = this.e;
        if (!dsrjVar.a()) {
            this.e = dsqw.cl(dsrjVar);
        }
    }
}
