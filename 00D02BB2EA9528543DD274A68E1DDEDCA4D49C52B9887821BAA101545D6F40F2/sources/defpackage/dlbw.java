package defpackage;
/* compiled from: PG */
/* renamed from: dlbw  reason: default package */
/* loaded from: classes6.dex */
public final class dlbw extends dsqw<dlbw, dlbv> implements dssk {
    public static final dlbw g;
    private static volatile dssr<dlbw> j;
    public dlcs e;
    private int h;
    private byte i = 2;
    public String a = "";
    public String b = "";
    public String c = "";
    public dsrj<dwfl> d = dssu.b;
    public dsrj<dlcx> f = dssu.b;

    static {
        dlbw dlbwVar = new dlbw();
        g = dlbwVar;
        dsqw.cc(dlbw.class, dlbwVar);
    }

    private dlbw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0002\u0001\u0001ဈ\u0001\u0002ဈ\u0002\u0003\u001b\u0005ဉ\u0004\u0007Л\bဈ\u0000", new Object[]{"h", "b", "c", "d", dwfl.class, "e", "f", dlcx.class, "a"});
            }
            if (i2 == 3) {
                return new dlbw();
            }
            if (i2 == 4) {
                return new dlbv();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dlbw> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dlbw.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
