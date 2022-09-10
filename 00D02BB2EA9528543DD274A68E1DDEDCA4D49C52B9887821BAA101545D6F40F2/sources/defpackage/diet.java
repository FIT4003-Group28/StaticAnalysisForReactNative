package defpackage;
/* compiled from: PG */
/* renamed from: diet  reason: default package */
/* loaded from: classes6.dex */
public final class diet extends dsqw<diet, dies> implements dssk {
    public static final diet f;
    private static volatile dssr<diet> h;
    public int a;
    public dnqh b;
    public dpmv e;
    private byte g = 2;
    public String c = "";
    public String d = "";

    static {
        diet dietVar = new diet();
        f = dietVar;
        dsqw.cc(diet.class, dietVar);
    }

    private diet() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new diet();
            }
            if (i2 == 4) {
                return new dies();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<diet> dssrVar = h;
            if (dssrVar == null) {
                synchronized (diet.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
