package defpackage;
/* compiled from: PG */
/* renamed from: dpdy  reason: default package */
/* loaded from: classes6.dex */
public final class dpdy extends dsqw<dpdy, dpdr> implements dssk {
    public static final dpdy n;
    private static volatile dssr<dpdy> p;
    public int a;
    public dpec c;
    public dphe e;
    public dpdx g;
    public dpdt h;
    public dpax i;
    public dpah j;
    public dowh k;
    public dowf l;
    public dpdv m;
    private byte o = 2;
    public String b = "";
    public dsrj<dpdq> d = dssu.b;
    public dspd f = dspd.b;

    static {
        dpdy dpdyVar = new dpdy();
        n = dpdyVar;
        dsqw.cc(dpdy.class, dpdyVar);
    }

    private dpdy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0001\n\u0001ᐉ\u0001\u0002Л\u0005ဈ\u0000\u0006ᐉ\u0003\u0007ᐉ\u0005\bည\u0004\tᐉ\u0006\nᐉ\u0007\u000bᐉ\b\fᐉ\t\rᐉ\n\u000eᐉ\u000b", new Object[]{"a", "c", "d", dpdq.class, "b", "e", "g", "f", "h", "i", "j", "k", "l", "m"});
            }
            if (i2 == 3) {
                return new dpdy();
            }
            if (i2 == 4) {
                return new dpdr();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            }
            dssr<dpdy> dssrVar = p;
            if (dssrVar == null) {
                synchronized (dpdy.class) {
                    dssrVar = p;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        p = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.o);
    }

    public final void b() {
        dsrj<dpdq> dsrjVar = this.d;
        if (!dsrjVar.a()) {
            this.d = dsqw.cl(dsrjVar);
        }
    }
}
