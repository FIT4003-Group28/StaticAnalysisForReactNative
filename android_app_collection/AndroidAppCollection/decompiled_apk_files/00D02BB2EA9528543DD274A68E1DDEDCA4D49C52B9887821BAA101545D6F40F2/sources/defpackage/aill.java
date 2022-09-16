package defpackage;
/* compiled from: PG */
/* renamed from: aill  reason: default package */
/* loaded from: classes2.dex */
public final class aill extends dsqw<aill, ailk> implements dssk {
    public static final aill e;
    private static volatile dssr<aill> f;
    public int a;
    public int b = 0;
    public Object c;
    public long d;

    static {
        aill aillVar = new aill();
        e = aillVar;
        dsqw.cc(aill.class, aillVar);
    }

    private aill() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ြ\u0000", new Object[]{"c", "b", "a", "d", ailj.class});
            }
            if (i2 == 3) {
                return new aill();
            }
            if (i2 == 4) {
                return new ailk();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aill> dssrVar = f;
            if (dssrVar == null) {
                synchronized (aill.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
