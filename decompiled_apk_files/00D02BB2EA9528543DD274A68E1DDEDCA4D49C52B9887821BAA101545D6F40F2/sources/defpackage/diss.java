package defpackage;
/* compiled from: PG */
/* renamed from: diss  reason: default package */
/* loaded from: classes6.dex */
public final class diss extends dsqw<diss, disr> implements dssk {
    public static final diss d;
    private static volatile dssr<diss> e;
    public int a;
    public dqzx b;
    public int c;

    static {
        diss dissVar = new diss();
        d = dissVar;
        dsqw.cc(diss.class, dissVar);
    }

    private diss() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new diss();
            }
            if (i2 == 4) {
                return new disr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diss> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diss.class) {
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
