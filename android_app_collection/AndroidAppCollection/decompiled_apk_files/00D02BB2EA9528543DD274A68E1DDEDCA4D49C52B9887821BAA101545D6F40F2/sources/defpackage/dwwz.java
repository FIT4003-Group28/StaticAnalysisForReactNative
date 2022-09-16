package defpackage;
/* compiled from: PG */
/* renamed from: dwwz  reason: default package */
/* loaded from: classes6.dex */
public final class dwwz extends dsqw<dwwz, dwwy> implements dssk {
    public static final dwwz c;
    private static volatile dssr<dwwz> d;
    public int a;
    public String b = "";

    static {
        dwwz dwwzVar = new dwwz();
        c = dwwzVar;
        dsqw.cc(dwwz.class, dwwzVar);
    }

    private dwwz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwwz();
            }
            if (i2 == 4) {
                return new dwwy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwwz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwwz.class) {
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
