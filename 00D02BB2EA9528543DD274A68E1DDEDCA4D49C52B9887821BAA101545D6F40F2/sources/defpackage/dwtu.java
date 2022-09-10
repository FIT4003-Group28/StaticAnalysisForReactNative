package defpackage;
/* compiled from: PG */
/* renamed from: dwtu  reason: default package */
/* loaded from: classes6.dex */
public final class dwtu extends dsqw<dwtu, dwtt> implements dssk {
    public static final dwtu c;
    private static volatile dssr<dwtu> d;
    public int a;
    public dpvo b;

    static {
        dwtu dwtuVar = new dwtu();
        c = dwtuVar;
        dsqw.cc(dwtu.class, dwtuVar);
    }

    private dwtu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwtu();
            }
            if (i2 == 4) {
                return new dwtt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwtu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwtu.class) {
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
