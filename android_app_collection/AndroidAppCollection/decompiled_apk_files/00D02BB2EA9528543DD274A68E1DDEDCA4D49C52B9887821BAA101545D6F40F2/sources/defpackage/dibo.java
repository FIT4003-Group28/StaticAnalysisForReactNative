package defpackage;
/* compiled from: PG */
/* renamed from: dibo  reason: default package */
/* loaded from: classes6.dex */
public final class dibo extends dsqw<dibo, dibn> implements dssk {
    public static final dibo i;
    private static volatile dssr<dibo> k;
    public int a;
    public Object c;
    public int d;
    public int e;
    public dspd f;
    public dnqh g;
    public dpqy h;
    public int b = 0;
    private byte j = 2;

    static {
        dibo diboVar = new dibo();
        i = diboVar;
        dsqw.cc(dibo.class, diboVar);
    }

    private dibo() {
        dspd dspdVar = dspd.b;
        this.d = 1;
        this.e = 10;
        this.f = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0001\u0001\u0001\u000e\u0007\u0000\u0000\u0001\u0001ြ\u0000\u0003ဌ\u0004\u0004င\u0005\u0005ည\u0006\u0006ᐉ\n\rဉ\f\u000eျ\u0000", new Object[]{"c", "b", "a", dpov.class, "d", dpqs.a, "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dibo();
            }
            if (i3 == 4) {
                return new dibn();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<dibo> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dibo.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
