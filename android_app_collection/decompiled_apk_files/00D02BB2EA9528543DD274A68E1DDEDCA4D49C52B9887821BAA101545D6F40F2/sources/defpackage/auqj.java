package defpackage;
/* compiled from: PG */
/* renamed from: auqj  reason: default package */
/* loaded from: classes2.dex */
public final class auqj extends dsqw<auqj, auqi> implements dssk {
    public static final auqj d;
    private static volatile dssr<auqj> e;
    public int a;
    public long b;
    public String c = "";

    static {
        auqj auqjVar = new auqj();
        d = auqjVar;
        dsqw.cc(auqj.class, auqjVar);
    }

    private auqj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new auqj();
            }
            if (i2 == 4) {
                return new auqi();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<auqj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (auqj.class) {
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
