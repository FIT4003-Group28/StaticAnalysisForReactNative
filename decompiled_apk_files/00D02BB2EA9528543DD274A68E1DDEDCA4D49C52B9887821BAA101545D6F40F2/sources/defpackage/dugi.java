package defpackage;
/* compiled from: PG */
/* renamed from: dugi  reason: default package */
/* loaded from: classes6.dex */
public final class dugi extends dsqw<dugi, dugh> implements dssk {
    public static final dugi c;
    private static volatile dssr<dugi> e;
    public duef a;
    public int b;
    private int d;

    static {
        dugi dugiVar = new dugi();
        c = dugiVar;
        dsqw.cc(dugi.class, dugiVar);
    }

    private dugi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dugi();
            }
            if (i2 == 4) {
                return new dugh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dugi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dugi.class) {
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
