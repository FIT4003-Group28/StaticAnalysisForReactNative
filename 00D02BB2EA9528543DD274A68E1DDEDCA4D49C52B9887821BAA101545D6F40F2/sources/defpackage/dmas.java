package defpackage;
/* compiled from: PG */
/* renamed from: dmas  reason: default package */
/* loaded from: classes6.dex */
public final class dmas extends dsqw<dmas, dmar> implements dssk {
    public static final dmas f;
    private static volatile dssr<dmas> g;
    public int a;
    public boolean c;
    public boolean d;
    public dsrj<dmbw> b = dssu.b;
    public String e = "";

    static {
        dmas dmasVar = new dmas();
        f = dmasVar;
        dsqw.cc(dmas.class, dmasVar);
    }

    private dmas() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", dmbw.class, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dmas();
            }
            if (i2 == 4) {
                return new dmar();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmas> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmas.class) {
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

    public final void b() {
        dsrj<dmbw> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
