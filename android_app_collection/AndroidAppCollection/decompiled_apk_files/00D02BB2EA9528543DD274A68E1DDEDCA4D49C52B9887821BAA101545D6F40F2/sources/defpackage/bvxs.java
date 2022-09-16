package defpackage;
/* compiled from: PG */
/* renamed from: bvxs  reason: default package */
/* loaded from: classes4.dex */
public final class bvxs extends dsqw<bvxs, bvxr> implements dssk {
    public static final bvxs d;
    private static volatile dssr<bvxs> e;
    public int a;
    public String b = "_theme";
    public String c = "dark";

    static {
        bvxs bvxsVar = new bvxs();
        d = bvxsVar;
        dsqw.cc(bvxs.class, bvxsVar);
    }

    private bvxs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bvxs();
            }
            if (i2 == 4) {
                return new bvxr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bvxs> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bvxs.class) {
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
