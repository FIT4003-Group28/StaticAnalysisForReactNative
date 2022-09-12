package defpackage;
/* compiled from: PG */
/* renamed from: dwdk  reason: default package */
/* loaded from: classes6.dex */
public final class dwdk extends dsqw<dwdk, dwdj> implements dssk {
    public static final dwdk c;
    private static volatile dssr<dwdk> d;
    public int a;
    public dwdp b;

    static {
        dwdk dwdkVar = new dwdk();
        c = dwdkVar;
        dsqw.cc(dwdk.class, dwdkVar);
    }

    private dwdk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwdk();
            }
            if (i2 == 4) {
                return new dwdj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwdk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwdk.class) {
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
