package defpackage;
/* compiled from: PG */
/* renamed from: cylk  reason: default package */
/* loaded from: classes5.dex */
public final class cylk extends dsqw<cylk, cylj> implements dssk {
    public static final cylk c;
    private static volatile dssr<cylk> d;
    public dsht a;
    public cylg b;

    static {
        cylk cylkVar = new cylk();
        c = cylkVar;
        dsqw.cc(cylk.class, cylkVar);
    }

    private cylk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cylk();
            }
            if (i2 == 4) {
                return new cylj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cylk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cylk.class) {
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
