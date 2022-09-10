package defpackage;
/* compiled from: PG */
/* renamed from: dkzt  reason: default package */
/* loaded from: classes6.dex */
public final class dkzt extends dsqw<dkzt, dkzs> implements dssk {
    public static final dkzt d;
    private static volatile dssr<dkzt> g;
    public dlcx b;
    public djul c;
    private int e;
    private byte f = 2;
    public String a = "";

    static {
        dkzt dkztVar = new dkzt();
        d = dkztVar;
        dsqw.cc(dkzt.class, dkztVar);
    }

    private dkzt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dkzt();
            }
            if (i2 == 4) {
                return new dkzs();
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
            dssr<dkzt> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkzt.class) {
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
