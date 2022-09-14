package defpackage;
/* compiled from: PG */
/* renamed from: djrz  reason: default package */
/* loaded from: classes.dex */
public final class djrz extends dsqw<djrz, djry> implements dssk {
    public static final djrz c;
    private static volatile dssr<djrz> d;
    public int a;
    public String b = "";

    static {
        djrz djrzVar = new djrz();
        c = djrzVar;
        dsqw.cc(djrz.class, djrzVar);
    }

    private djrz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဈ\u0002", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new djrz();
            }
            if (i2 == 4) {
                return new djry();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djrz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djrz.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
