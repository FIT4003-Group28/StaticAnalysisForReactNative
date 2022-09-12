package defpackage;
/* compiled from: PG */
/* renamed from: dxvy  reason: default package */
/* loaded from: classes6.dex */
public final class dxvy extends dsqw<dxvy, dxvx> implements dssk {
    public static final dxvy d;
    private static volatile dssr<dxvy> e;
    public String a = "";
    public int b;
    public dsqy c;

    static {
        dxvy dxvyVar = new dxvy();
        d = dxvyVar;
        dsqw.cc(dxvy.class, dxvyVar);
    }

    private dxvy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\t", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dxvy();
            }
            if (i2 == 4) {
                return new dxvx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxvy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxvy.class) {
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
