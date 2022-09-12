package defpackage;
/* compiled from: PG */
/* renamed from: wcm  reason: default package */
/* loaded from: classes7.dex */
public final class wcm extends dsqw<wcm, wcl> implements dssk {
    public static final wcm d;
    private static volatile dssr<wcm> e;
    public int a;
    public dsrj<dpum> b = dssu.b;
    public dspd c = dspd.b;

    static {
        wcm wcmVar = new wcm();
        d = wcmVar;
        dsqw.cc(wcm.class, wcmVar);
    }

    private wcm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ည\u0000", new Object[]{"a", "b", dpum.class, "c"});
            }
            if (i2 == 3) {
                return new wcm();
            }
            if (i2 == 4) {
                return new wcl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<wcm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (wcm.class) {
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
