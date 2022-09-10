package defpackage;
/* compiled from: PG */
/* renamed from: chvw  reason: default package */
/* loaded from: classes4.dex */
public final class chvw extends dsqw<chvw, chvv> implements dssk {
    public static final chvw d;
    private static volatile dssr<chvw> e;
    public int a;
    public dsrj<dppl> b = dssu.b;
    public dpvc c;

    static {
        chvw chvwVar = new chvw();
        d = chvwVar;
        dsqw.cc(chvw.class, chvwVar);
    }

    private chvw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", dppl.class, "c"});
            }
            if (i2 == 3) {
                return new chvw();
            }
            if (i2 == 4) {
                return new chvv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chvw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (chvw.class) {
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
