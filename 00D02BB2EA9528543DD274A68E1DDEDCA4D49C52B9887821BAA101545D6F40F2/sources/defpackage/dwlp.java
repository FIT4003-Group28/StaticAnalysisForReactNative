package defpackage;
/* compiled from: PG */
/* renamed from: dwlp  reason: default package */
/* loaded from: classes6.dex */
public final class dwlp extends dsqw<dwlp, dwlo> implements dssk {
    public static final dwlp c;
    private static volatile dssr<dwlp> e;
    public dsrj<dppl> a = dssu.b;
    public dpvc b;
    private int d;

    static {
        dwlp dwlpVar = new dwlp();
        c = dwlpVar;
        dsqw.cc(dwlp.class, dwlpVar);
    }

    private dwlp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"d", "a", dppl.class, "b"});
            }
            if (i2 == 3) {
                return new dwlp();
            }
            if (i2 == 4) {
                return new dwlo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwlp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwlp.class) {
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
