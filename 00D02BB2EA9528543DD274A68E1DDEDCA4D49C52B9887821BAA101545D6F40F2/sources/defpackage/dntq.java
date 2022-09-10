package defpackage;
/* compiled from: PG */
/* renamed from: dntq  reason: default package */
/* loaded from: classes6.dex */
public final class dntq extends dsqw<dntq, dntn> implements dssk {
    public static final dntq d;
    private static volatile dssr<dntq> e;
    public int a;
    public int b;
    public dpzm c;

    static {
        dntq dntqVar = new dntq();
        d = dntqVar;
        dsqw.cc(dntq.class, dntqVar);
    }

    private dntq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", dnto.a, "c"});
            }
            if (i2 == 3) {
                return new dntq();
            }
            if (i2 == 4) {
                return new dntn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dntq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dntq.class) {
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
