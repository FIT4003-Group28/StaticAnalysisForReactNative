package defpackage;
/* compiled from: PG */
/* renamed from: dpvk  reason: default package */
/* loaded from: classes6.dex */
public final class dpvk extends dsqw<dpvk, dpvj> implements dssk {
    public static final dpvk d;
    private static volatile dssr<dpvk> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dpvk dpvkVar = new dpvk();
        d = dpvkVar;
        dsqw.cc(dpvk.class, dpvkVar);
    }

    private dpvk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpvk();
            }
            if (i2 == 4) {
                return new dpvj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpvk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpvk.class) {
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
