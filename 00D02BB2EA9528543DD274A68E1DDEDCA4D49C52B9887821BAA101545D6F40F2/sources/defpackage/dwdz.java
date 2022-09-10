package defpackage;
/* compiled from: PG */
/* renamed from: dwdz  reason: default package */
/* loaded from: classes.dex */
public final class dwdz extends dsqw<dwdz, dwdy> implements dssk {
    public static final dwdz c;
    private static volatile dssr<dwdz> d;
    public int a;
    public boolean b;

    static {
        dwdz dwdzVar = new dwdz();
        c = dwdzVar;
        dsqw.cc(dwdz.class, dwdzVar);
    }

    private dwdz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwdz();
            }
            if (i2 == 4) {
                return new dwdy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwdz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwdz.class) {
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
