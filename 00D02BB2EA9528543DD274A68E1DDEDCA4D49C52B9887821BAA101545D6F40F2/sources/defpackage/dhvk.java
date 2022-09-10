package defpackage;
/* compiled from: PG */
/* renamed from: dhvk  reason: default package */
/* loaded from: classes6.dex */
public final class dhvk extends dsqw<dhvk, dhvj> implements dssk {
    public static final dhvk d;
    private static volatile dssr<dhvk> e;
    public int a;
    public String b = "";
    public dwpe c;

    static {
        dhvk dhvkVar = new dhvk();
        d = dhvkVar;
        dsqw.cc(dhvk.class, dhvkVar);
    }

    private dhvk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dhvk();
            }
            if (i2 == 4) {
                return new dhvj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhvk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhvk.class) {
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
