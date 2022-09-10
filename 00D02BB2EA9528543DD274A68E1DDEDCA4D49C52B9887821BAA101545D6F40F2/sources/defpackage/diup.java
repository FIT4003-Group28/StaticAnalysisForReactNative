package defpackage;
/* compiled from: PG */
/* renamed from: diup  reason: default package */
/* loaded from: classes6.dex */
public final class diup extends dsqw<diup, diuo> implements dssk {
    public static final diup d;
    private static volatile dssr<diup> f;
    public String a = "";
    public String b = "";
    public String c = "";
    private int e;

    static {
        diup diupVar = new diup();
        d = diupVar;
        dsqw.cc(diup.class, diupVar);
    }

    private diup() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0003", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new diup();
            }
            if (i2 == 4) {
                return new diuo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diup> dssrVar = f;
            if (dssrVar == null) {
                synchronized (diup.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
