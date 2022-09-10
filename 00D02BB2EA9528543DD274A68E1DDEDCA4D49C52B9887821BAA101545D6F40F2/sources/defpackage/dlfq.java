package defpackage;
/* compiled from: PG */
/* renamed from: dlfq  reason: default package */
/* loaded from: classes6.dex */
public final class dlfq extends dsqw<dlfq, dlfp> implements dssk {
    public static final dlfq c;
    private static volatile dssr<dlfq> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dlfq dlfqVar = new dlfq();
        c = dlfqVar;
        dsqw.cc(dlfq.class, dlfqVar);
    }

    private dlfq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dlfq();
            }
            if (i2 == 4) {
                return new dlfp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlfq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlfq.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
