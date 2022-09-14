package defpackage;
/* compiled from: PG */
/* renamed from: dwuk  reason: default package */
/* loaded from: classes6.dex */
public final class dwuk extends dsqw<dwuk, dwuj> implements dssk {
    public static final dwuk d;
    private static volatile dssr<dwuk> g;
    public dvyw a;
    private int e;
    private byte f = 2;
    public String b = "";
    public String c = "";

    static {
        dwuk dwukVar = new dwuk();
        d = dwukVar;
        dsqw.cc(dwuk.class, dwukVar);
    }

    private dwuk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwuk();
            }
            if (i2 == 4) {
                return new dwuj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dwuk> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dwuk.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
