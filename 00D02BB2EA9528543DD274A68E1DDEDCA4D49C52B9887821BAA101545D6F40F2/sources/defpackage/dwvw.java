package defpackage;
/* compiled from: PG */
/* renamed from: dwvw  reason: default package */
/* loaded from: classes6.dex */
public final class dwvw extends dsqw<dwvw, dwvv> implements dssk {
    public static final dwvw c;
    private static volatile dssr<dwvw> d;
    public int a;
    public boolean b;

    static {
        dwvw dwvwVar = new dwvw();
        c = dwvwVar;
        dsqw.cc(dwvw.class, dwvwVar);
    }

    private dwvw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwvw();
            }
            if (i2 == 4) {
                return new dwvv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwvw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwvw.class) {
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
