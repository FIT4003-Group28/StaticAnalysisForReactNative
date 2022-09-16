package defpackage;
/* compiled from: PG */
/* renamed from: dohn  reason: default package */
/* loaded from: classes6.dex */
public final class dohn extends dsqw<dohn, dogy> implements dssk {
    public static final dohn g;
    private static volatile dssr<dohn> i;
    public int a;
    public Object c;
    public int b = 0;
    private byte h = 2;
    public String d = "";
    public String e = "";
    public dsrj<dojt> f = dssu.b;

    static {
        dohn dohnVar = new dohn();
        g = dohnVar;
        dsqw.cc(dohn.class, dohnVar);
    }

    private dohn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0001\u0001\u0001ဈ\u0000\u0002ြ\u0000\u0003Л\u0004ြ\u0000\u0005ြ\u0000\u0006ဈ\u0001\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000", new Object[]{"c", "b", "a", "d", dogv.class, "f", dojt.class, doli.class, doni.class, "e", dolv.class, domk.class, doks.class, dohc.class, dogx.class, doha.class, dohk.class, dohm.class});
            }
            if (i3 == 3) {
                return new dohn();
            }
            if (i3 == 4) {
                return new dogy();
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
            dssr<dohn> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dohn.class) {
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

    public final void b() {
        dsrj<dojt> dsrjVar = this.f;
        if (!dsrjVar.a()) {
            this.f = dsqw.cl(dsrjVar);
        }
    }
}
