package defpackage;
/* compiled from: PG */
/* renamed from: dpug  reason: default package */
/* loaded from: classes6.dex */
public final class dpug extends dsqw<dpug, dpuf> implements dssk {
    public static final dpug d;
    private static volatile dssr<dpug> e;
    public int a;
    public dsrj<dnoj> b = dssu.b;
    public String c = "";

    static {
        dpug dpugVar = new dpug();
        d = dpugVar;
        dsqw.cc(dpug.class, dpugVar);
    }

    private dpug() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003ဈ\u0001", new Object[]{"a", "b", dnoj.class, "c"});
            }
            if (i2 == 3) {
                return new dpug();
            }
            if (i2 == 4) {
                return new dpuf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpug> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpug.class) {
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
