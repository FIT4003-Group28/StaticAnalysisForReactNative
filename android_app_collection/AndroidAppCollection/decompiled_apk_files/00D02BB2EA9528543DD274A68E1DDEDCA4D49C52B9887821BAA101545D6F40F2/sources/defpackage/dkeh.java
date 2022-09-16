package defpackage;
/* compiled from: PG */
/* renamed from: dkeh  reason: default package */
/* loaded from: classes.dex */
public final class dkeh extends dsqw<dkeh, dkeg> implements dssk {
    public static final dkeh e;
    private static volatile dssr<dkeh> f;
    public int a;
    public String b = "";
    public dwfl c;
    public dqlo d;

    static {
        dkeh dkehVar = new dkeh();
        e = dkehVar;
        dsqw.cc(dkeh.class, dkehVar);
    }

    private dkeh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0005ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dkeh();
            }
            if (i2 == 4) {
                return new dkeg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkeh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkeh.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
