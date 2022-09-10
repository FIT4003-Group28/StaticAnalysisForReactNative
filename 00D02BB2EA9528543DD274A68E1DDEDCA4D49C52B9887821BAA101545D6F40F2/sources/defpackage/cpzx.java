package defpackage;
/* compiled from: PG */
/* renamed from: cpzx  reason: default package */
/* loaded from: classes5.dex */
public final class cpzx extends dsqw<cpzx, cpzs> implements dssk {
    public static final cpzx h;
    private static volatile dssr<cpzx> i;
    public int a;
    public int b;
    public cpzu d;
    public int f;
    public cpzr g;
    public String c = "";
    public String e = "";

    static {
        cpzx cpzxVar = new cpzx();
        h = cpzxVar;
        dsqw.cc(cpzx.class, cpzxVar);
    }

    private cpzx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0003\n\u0006\u0000\u0000\u0000\u0003ဌ\u0000\u0004ဈ\u0001\u0005ဉ\u0002\bဈ\u0004\tင\u0005\nဉ\u0006", new Object[]{"a", "b", cpzv.a, "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new cpzx();
            }
            if (i3 == 4) {
                return new cpzs();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<cpzx> dssrVar = i;
            if (dssrVar == null) {
                synchronized (cpzx.class) {
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
}
