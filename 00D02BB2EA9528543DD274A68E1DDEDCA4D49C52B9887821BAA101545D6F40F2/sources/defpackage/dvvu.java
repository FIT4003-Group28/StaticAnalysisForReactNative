package defpackage;
/* compiled from: PG */
/* renamed from: dvvu  reason: default package */
/* loaded from: classes6.dex */
public final class dvvu extends dsqw<dvvu, dvvt> implements dssk {
    public static final dvvu f;
    private static volatile dssr<dvvu> i;
    public int a;
    public dpum b;
    public int d;
    public boolean e;
    private dnqh g;
    private byte h = 2;
    public String c = "";

    static {
        dvvu dvvuVar = new dvvu();
        f = dvvuVar;
        dsqw.cc(dvvu.class, dvvuVar);
    }

    private dvvu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဇ\u0003\u0006ᐉ\u0004", new Object[]{"a", "b", "c", "d", "e", "g"});
            }
            if (i3 == 3) {
                return new dvvu();
            }
            if (i3 == 4) {
                return new dvvt();
            }
            if (i3 == 5) {
                return f;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dvvu> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dvvu.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
