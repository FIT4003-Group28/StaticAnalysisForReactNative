package defpackage;
/* compiled from: PG */
/* renamed from: dwlj  reason: default package */
/* loaded from: classes6.dex */
public final class dwlj extends dsqw<dwlj, dwli> implements dssk {
    public static final dwlj c;
    private static volatile dssr<dwlj> e;
    public String a = "";
    public dpvc b;
    private int d;

    static {
        dwlj dwljVar = new dwlj();
        c = dwljVar;
        dsqw.cc(dwlj.class, dwljVar);
    }

    private dwlj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dwlj();
            }
            if (i2 == 4) {
                return new dwli();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwlj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwlj.class) {
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
