package defpackage;
/* compiled from: PG */
/* renamed from: akun  reason: default package */
/* loaded from: classes.dex */
public final class akun extends dsqw<akun, akum> implements dssk {
    public static final akun d;
    private static volatile dssr<akun> e;
    public int a;
    public boolean b;
    public int c;

    static {
        akun akunVar = new akun();
        d = akunVar;
        dsqw.cc(akun.class, akunVar);
    }

    private akun() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new akun();
            }
            if (i2 == 4) {
                return new akum();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<akun> dssrVar = e;
            if (dssrVar == null) {
                synchronized (akun.class) {
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
