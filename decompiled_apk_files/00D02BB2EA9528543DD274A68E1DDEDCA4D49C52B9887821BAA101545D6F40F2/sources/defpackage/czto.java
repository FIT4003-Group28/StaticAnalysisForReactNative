package defpackage;
/* compiled from: PG */
/* renamed from: czto  reason: default package */
/* loaded from: classes5.dex */
public final class czto extends dsqw<czto, cztn> implements dssk {
    public static final czto f;
    private static volatile dssr<czto> g;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        czto cztoVar = new czto();
        f = cztoVar;
        dsqw.cc(czto.class, cztoVar);
    }

    private czto() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new czto();
            }
            if (i2 == 4) {
                return new cztn();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<czto> dssrVar = g;
            if (dssrVar == null) {
                synchronized (czto.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
