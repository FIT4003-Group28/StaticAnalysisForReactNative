package defpackage;
/* compiled from: PG */
/* renamed from: dwug  reason: default package */
/* loaded from: classes6.dex */
public final class dwug extends dsqw<dwug, dwuf> implements dssk {
    public static final dwug e;
    private static volatile dssr<dwug> h;
    public dvyw a;
    private int f;
    private byte g = 2;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        dwug dwugVar = new dwug();
        e = dwugVar;
        dsqw.cc(dwug.class, dwugVar);
    }

    private dwug() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dwug();
            }
            if (i2 == 4) {
                return new dwuf();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dwug> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dwug.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
