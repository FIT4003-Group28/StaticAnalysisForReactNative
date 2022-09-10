package defpackage;
/* compiled from: PG */
/* renamed from: awhv  reason: default package */
/* loaded from: classes3.dex */
public final class awhv extends dsqw<awhv, awhu> implements dssk {
    public static final awhv e;
    private static volatile dssr<awhv> f;
    public int a;
    public String b = "";
    public avjy c;
    public long d;

    static {
        awhv awhvVar = new awhv();
        e = awhvVar;
        dsqw.cc(awhv.class, awhvVar);
    }

    private awhv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new awhv();
            }
            if (i2 == 4) {
                return new awhu();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<awhv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (awhv.class) {
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
