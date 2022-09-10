package defpackage;
/* compiled from: PG */
/* renamed from: dwpp  reason: default package */
/* loaded from: classes6.dex */
public final class dwpp extends dsqw<dwpp, dwpo> implements dssk {
    public static final dwpp d;
    private static volatile dssr<dwpp> e;
    public int a;
    public dwpc b;
    public dwpg c;

    static {
        dwpp dwppVar = new dwpp();
        d = dwppVar;
        dsqw.cc(dwpp.class, dwppVar);
    }

    private dwpp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwpp();
            }
            if (i2 == 4) {
                return new dwpo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwpp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwpp.class) {
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
