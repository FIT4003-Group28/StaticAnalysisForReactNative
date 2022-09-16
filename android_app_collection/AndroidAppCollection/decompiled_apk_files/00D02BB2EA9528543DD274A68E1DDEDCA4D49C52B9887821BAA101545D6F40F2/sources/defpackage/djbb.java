package defpackage;
/* compiled from: PG */
/* renamed from: djbb  reason: default package */
/* loaded from: classes6.dex */
public final class djbb extends dsqw<djbb, djba> implements dssk {
    public static final djbb d;
    private static volatile dssr<djbb> g;
    public int a;
    public dqcm c;
    private dnqh e;
    private byte f = 2;
    public String b = "";

    static {
        djbb djbbVar = new djbb();
        d = djbbVar;
        dsqw.cc(djbb.class, djbbVar);
    }

    private djbb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ဉ\u0001", new Object[]{"a", "b", "e", "c"});
            }
            if (i2 == 3) {
                return new djbb();
            }
            if (i2 == 4) {
                return new djba();
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
            dssr<djbb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djbb.class) {
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
