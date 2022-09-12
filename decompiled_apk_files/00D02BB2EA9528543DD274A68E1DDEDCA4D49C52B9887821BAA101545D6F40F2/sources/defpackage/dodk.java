package defpackage;
/* compiled from: PG */
/* renamed from: dodk  reason: default package */
/* loaded from: classes6.dex */
public final class dodk extends dsqw<dodk, dodh> implements dssk {
    public static final dodk c;
    private static volatile dssr<dodk> d;
    public dsrj<dgls> a = dssu.b;
    public dsrj<dodj> b = dssu.b;

    static {
        dodk dodkVar = new dodk();
        c = dodkVar;
        dsqw.cc(dodk.class, dodkVar);
    }

    private dodk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", dgls.class, "b", dodj.class});
            }
            if (i2 == 3) {
                return new dodk();
            }
            if (i2 == 4) {
                return new dodh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dodk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dodk.class) {
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
