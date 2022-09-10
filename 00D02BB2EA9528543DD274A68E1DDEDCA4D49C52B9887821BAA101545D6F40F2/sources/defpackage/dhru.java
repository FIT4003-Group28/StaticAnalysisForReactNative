package defpackage;
/* compiled from: PG */
/* renamed from: dhru  reason: default package */
/* loaded from: classes6.dex */
public final class dhru extends dsqw<dhru, dhrp> implements dssk {
    public static final dhru g;
    private static volatile dssr<dhru> j;
    public int a;
    public drrp b;
    public int d;
    public dhrt f;
    private dnqh h;
    private byte i = 2;
    public int c = 2;
    public boolean e = true;

    static {
        dhru dhruVar = new dhru();
        g = dhruVar;
        dsqw.cc(dhru.class, dhruVar);
    }

    private dhru() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0005ဉ\u0004\u0006ဇ\u0003\u0007ᐉ\u0006", new Object[]{"a", "b", "c", djrx.a, "d", dhrq.a, "f", "e", "h"});
            }
            if (i2 == 3) {
                return new dhru();
            }
            if (i2 == 4) {
                return new dhrp();
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
            dssr<dhru> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dhru.class) {
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
