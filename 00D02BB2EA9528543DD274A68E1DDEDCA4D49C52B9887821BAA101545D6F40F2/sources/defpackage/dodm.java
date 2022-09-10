package defpackage;
/* compiled from: PG */
/* renamed from: dodm  reason: default package */
/* loaded from: classes6.dex */
public final class dodm extends dsqw<dodm, dodl> implements dssk {
    public static final dodm d;
    private static volatile dssr<dodm> f;
    public String a = "";
    public String b = "";
    public dsrj<dglo> c = dssu.b;
    private int e;

    static {
        dodm dodmVar = new dodm();
        d = dodmVar;
        dsqw.cc(dodm.class, dodmVar);
    }

    private dodm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001", new Object[]{"e", "a", "c", dglo.class, "b"});
            }
            if (i2 == 3) {
                return new dodm();
            }
            if (i2 == 4) {
                return new dodl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dodm> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dodm.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
