package defpackage;
/* compiled from: PG */
/* renamed from: diev  reason: default package */
/* loaded from: classes6.dex */
public final class diev extends dsqw<diev, dieu> implements dssk {
    public static final diev b;
    private static volatile dssr<diev> d;
    public String a = "";
    private int c;

    static {
        diev dievVar = new diev();
        b = dievVar;
        dsqw.cc(diev.class, dievVar);
    }

    private diev() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new diev();
            }
            if (i2 == 4) {
                return new dieu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diev> dssrVar = d;
            if (dssrVar == null) {
                synchronized (diev.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
