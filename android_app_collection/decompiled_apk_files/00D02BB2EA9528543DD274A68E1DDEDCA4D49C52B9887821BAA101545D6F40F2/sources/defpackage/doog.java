package defpackage;
/* compiled from: PG */
/* renamed from: doog  reason: default package */
/* loaded from: classes6.dex */
public final class doog extends dsqw<doog, doob> implements dssk {
    public static final doog f;
    private static volatile dssr<doog> h;
    public int a;
    private byte g = 2;
    public String b = "";
    public String c = "";
    public dsrj<dooa> d = dssu.b;
    public dsrj<dood> e = dssu.b;

    static {
        doog doogVar = new doog();
        f = doogVar;
        dsqw.cc(doog.class, doogVar);
    }

    private doog() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0002\u0001ဈ\u0000\u0002Л\u0004Л\u0006ဈ\u0001", new Object[]{"a", "b", "d", dooa.class, "e", dood.class, "c"});
            }
            if (i2 == 3) {
                return new doog();
            }
            if (i2 == 4) {
                return new doob();
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
            dssr<doog> dssrVar = h;
            if (dssrVar == null) {
                synchronized (doog.class) {
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
