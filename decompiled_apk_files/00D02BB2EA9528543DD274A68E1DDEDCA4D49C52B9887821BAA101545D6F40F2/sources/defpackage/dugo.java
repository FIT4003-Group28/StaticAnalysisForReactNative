package defpackage;
/* compiled from: PG */
/* renamed from: dugo  reason: default package */
/* loaded from: classes6.dex */
public final class dugo extends dsqw<dugo, dugn> implements dssk {
    public static final dugo b;
    private static volatile dssr<dugo> d;
    public String a = "";
    private int c;

    static {
        dugo dugoVar = new dugo();
        b = dugoVar;
        dsqw.cc(dugo.class, dugoVar);
    }

    private dugo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dugo();
            }
            if (i2 == 4) {
                return new dugn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dugo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dugo.class) {
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
