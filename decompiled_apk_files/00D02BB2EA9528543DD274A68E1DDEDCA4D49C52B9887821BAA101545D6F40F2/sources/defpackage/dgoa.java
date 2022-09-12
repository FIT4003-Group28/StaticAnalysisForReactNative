package defpackage;
/* compiled from: PG */
/* renamed from: dgoa  reason: default package */
/* loaded from: classes6.dex */
public final class dgoa extends dsqw<dgoa, dgnz> implements dssk {
    public static final dgoa d;
    private static volatile dssr<dgoa> e;
    public int a;
    public String b = "";
    public dnqe c;

    static {
        dgoa dgoaVar = new dgoa();
        d = dgoaVar;
        dsqw.cc(dgoa.class, dgoaVar);
    }

    private dgoa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dgoa();
            }
            if (i2 == 4) {
                return new dgnz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgoa> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgoa.class) {
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
