package defpackage;
/* compiled from: PG */
/* renamed from: dxnp  reason: default package */
/* loaded from: classes6.dex */
public final class dxnp extends dsqw<dxnp, dxno> implements dssk {
    public static final dxnp d;
    private static volatile dssr<dxnp> e;
    public dxmm b;
    public String a = "";
    public dspd c = dspd.b;

    static {
        dxnp dxnpVar = new dxnp();
        d = dxnpVar;
        dsqw.cc(dxnp.class, dxnpVar);
    }

    private dxnp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\n", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dxnp();
            }
            if (i2 == 4) {
                return new dxno();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxnp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxnp.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
