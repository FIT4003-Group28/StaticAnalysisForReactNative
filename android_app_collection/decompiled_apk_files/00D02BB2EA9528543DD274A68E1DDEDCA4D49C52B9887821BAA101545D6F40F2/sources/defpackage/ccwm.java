package defpackage;
/* compiled from: PG */
/* renamed from: ccwm  reason: default package */
/* loaded from: classes4.dex */
public final class ccwm extends dsqw<ccwm, ccwl> implements dssk {
    public static final ccwm j;
    private static volatile dssr<ccwm> l;
    public int a;
    public djgl b;
    public boolean c;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    private byte k = 2;
    public String d = "";

    static {
        ccwm ccwmVar = new ccwm();
        j = ccwmVar;
        dsqw.cc(ccwm.class, ccwmVar);
    }

    private ccwm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006ဌ\u0006\u0007င\u0007\bဇ\u0001", new Object[]{"a", "b", "d", "e", "f", "g", "h", dgfb.c(), "i", "c"});
            }
            if (i2 == 3) {
                return new ccwm();
            }
            if (i2 == 4) {
                return new ccwl();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            }
            dssr<ccwm> dssrVar = l;
            if (dssrVar == null) {
                synchronized (ccwm.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.k);
    }
}
