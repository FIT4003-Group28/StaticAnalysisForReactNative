package defpackage;
/* compiled from: PG */
/* renamed from: dxjp  reason: default package */
/* loaded from: classes6.dex */
public final class dxjp extends dsqw<dxjp, dxjo> implements dssk {
    public static final dxjp d;
    private static volatile dssr<dxjp> e;
    public dxwi a;
    public dxmq b;
    public boolean c;

    static {
        dxjp dxjpVar = new dxjp();
        d = dxjpVar;
        dsqw.cc(dxjp.class, dxjpVar);
    }

    private dxjp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0007", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dxjp();
            }
            if (i2 == 4) {
                return new dxjo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxjp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxjp.class) {
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
