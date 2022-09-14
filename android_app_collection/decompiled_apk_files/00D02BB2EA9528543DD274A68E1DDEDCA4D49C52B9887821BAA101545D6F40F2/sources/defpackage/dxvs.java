package defpackage;
/* compiled from: PG */
/* renamed from: dxvs  reason: default package */
/* loaded from: classes6.dex */
public final class dxvs extends dsqw<dxvs, dxvr> implements dssk {
    public static final dxvs d;
    private static volatile dssr<dxvs> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dxvs dxvsVar = new dxvs();
        d = dxvsVar;
        dsqw.cc(dxvs.class, dxvsVar);
    }

    private dxvs() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dxvs();
            }
            if (i2 == 4) {
                return new dxvr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxvs> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxvs.class) {
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
