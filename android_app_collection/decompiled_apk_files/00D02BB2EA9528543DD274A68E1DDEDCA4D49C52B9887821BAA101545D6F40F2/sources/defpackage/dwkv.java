package defpackage;
/* compiled from: PG */
/* renamed from: dwkv  reason: default package */
/* loaded from: classes6.dex */
public final class dwkv extends dsqw<dwkv, dwks> implements dssk {
    public static final dwkv d;
    private static volatile dssr<dwkv> e;
    public int a;
    public int b;
    public int c;

    static {
        dwkv dwkvVar = new dwkv();
        d = dwkvVar;
        dsqw.cc(dwkv.class, dwkvVar);
    }

    private dwkv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", dwku.c(), "c"});
            }
            if (i2 == 3) {
                return new dwkv();
            }
            if (i2 == 4) {
                return new dwks();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwkv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwkv.class) {
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
