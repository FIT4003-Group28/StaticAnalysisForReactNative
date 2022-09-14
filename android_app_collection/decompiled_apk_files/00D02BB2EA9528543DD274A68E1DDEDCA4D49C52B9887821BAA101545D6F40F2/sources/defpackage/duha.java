package defpackage;
/* compiled from: PG */
/* renamed from: duha  reason: default package */
/* loaded from: classes6.dex */
public final class duha extends dsqw<duha, dugz> implements dssk {
    public static final duha d;
    private static volatile dssr<duha> e;
    public int a;
    public int b;
    public int c;

    static {
        duha duhaVar = new duha();
        d = duhaVar;
        dsqw.cc(duha.class, duhaVar);
    }

    private duha() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new duha();
            }
            if (i2 == 4) {
                return new dugz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duha> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duha.class) {
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
