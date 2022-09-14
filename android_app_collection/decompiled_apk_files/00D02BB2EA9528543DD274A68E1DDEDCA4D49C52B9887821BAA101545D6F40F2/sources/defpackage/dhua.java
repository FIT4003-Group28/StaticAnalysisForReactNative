package defpackage;
/* compiled from: PG */
/* renamed from: dhua  reason: default package */
/* loaded from: classes6.dex */
public final class dhua extends dsqw<dhua, dhtz> implements dssk {
    public static final dhua c;
    private static volatile dssr<dhua> e;
    public dsrj<dppl> a = dssu.b;
    public dpql b;
    private int d;

    static {
        dhua dhuaVar = new dhua();
        c = dhuaVar;
        dsqw.cc(dhua.class, dhuaVar);
    }

    private dhua() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003ဉ\u0001", new Object[]{"d", "a", dppl.class, "b"});
            }
            if (i2 == 3) {
                return new dhua();
            }
            if (i2 == 4) {
                return new dhtz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhua> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhua.class) {
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
