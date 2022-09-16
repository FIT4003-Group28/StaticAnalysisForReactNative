package defpackage;
/* compiled from: PG */
/* renamed from: diqt  reason: default package */
/* loaded from: classes6.dex */
public final class diqt extends dsqw<diqt, diqs> implements dssk {
    public static final diqt a;
    private static volatile dssr<diqt> b;

    static {
        diqt diqtVar = new diqt();
        a = diqtVar;
        dsqw.cc(diqt.class, diqtVar);
    }

    private diqt() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new diqt();
            }
            if (i2 == 4) {
                return new diqs();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diqt> dssrVar = b;
            if (dssrVar == null) {
                synchronized (diqt.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
