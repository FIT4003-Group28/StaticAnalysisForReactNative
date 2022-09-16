package defpackage;
/* compiled from: PG */
/* renamed from: dwxz  reason: default package */
/* loaded from: classes6.dex */
public final class dwxz extends dsqw<dwxz, dwxy> implements dssk {
    public static final dwxz d;
    private static volatile dssr<dwxz> e;
    public int a;
    public String b = "";
    public boolean c;

    static {
        dwxz dwxzVar = new dwxz();
        d = dwxzVar;
        dsqw.cc(dwxz.class, dwxzVar);
    }

    private dwxz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwxz();
            }
            if (i2 == 4) {
                return new dwxy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwxz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwxz.class) {
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
