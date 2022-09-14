package defpackage;
/* compiled from: PG */
/* renamed from: cxmx  reason: default package */
/* loaded from: classes5.dex */
public final class cxmx extends dsqw<cxmx, cxmw> implements dssk {
    public static final cxmx h;
    private static volatile dssr<cxmx> i;
    public int a;
    public long e;
    public long f;
    public String b = "";
    public dspd c = dspd.b;
    public String d = "";
    public dsrj<cxmz> g = dssu.b;

    static {
        cxmx cxmxVar = new cxmx();
        h = cxmxVar;
        dsqw.cc(cxmx.class, cxmxVar);
    }

    private cxmx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b\u0006ဂ\u0004", new Object[]{"a", "b", "c", "d", "e", "g", cxmz.class, "f"});
            }
            if (i3 == 3) {
                return new cxmx();
            }
            if (i3 == 4) {
                return new cxmw();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<cxmx> dssrVar = i;
            if (dssrVar == null) {
                synchronized (cxmx.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<cxmz> dsrjVar = this.g;
        if (!dsrjVar.a()) {
            this.g = dsqw.cl(dsrjVar);
        }
    }
}
