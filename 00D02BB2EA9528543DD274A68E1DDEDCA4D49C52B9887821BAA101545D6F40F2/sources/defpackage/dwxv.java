package defpackage;
/* compiled from: PG */
/* renamed from: dwxv  reason: default package */
/* loaded from: classes6.dex */
public final class dwxv extends dsqw<dwxv, dwxu> implements dssk {
    public static final dwxv e;
    private static volatile dssr<dwxv> f;
    public int a;
    public drpm b;
    public dwxt c;
    public drrf d;

    static {
        dwxv dwxvVar = new dwxv();
        e = dwxvVar;
        dsqw.cc(dwxv.class, dwxvVar);
    }

    private dwxv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dwxv();
            }
            if (i2 == 4) {
                return new dwxu();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwxv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwxv.class) {
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
