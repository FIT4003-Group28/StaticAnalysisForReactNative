package defpackage;
/* compiled from: PG */
/* renamed from: dird  reason: default package */
/* loaded from: classes6.dex */
public final class dird extends dsqs<dird, dirc> implements dsqt {
    public static final dird k;
    private static volatile dssr<dird> m;
    public int a;
    public long g;
    public dqac h;
    public dlau i;
    public boolean j;
    private byte l = 2;
    public String b = "";
    public String c = "";
    public dsrj<dlcv> d = dssu.b;
    public dspd e = dspd.b;
    public dspd f = dspd.b;

    static {
        dird dirdVar = new dird();
        k = dirdVar;
        dsqw.cc(dird.class, dirdVar);
    }

    private dird() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0002\u0001Л\u0002ည\u0002\u0004ဂ\u0004\u0005ᐉ\u0006\u0006ဈ\u0000\u0007ဈ\u0001\bည\u0003\tဇ\u0007\nဉ\u0005", new Object[]{"a", "d", dlcv.class, "e", "g", "i", "b", "c", "f", "j", "h"});
            }
            if (i2 == 3) {
                return new dird();
            }
            if (i2 == 4) {
                return new dirc();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            }
            dssr<dird> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dird.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.l);
    }
}
