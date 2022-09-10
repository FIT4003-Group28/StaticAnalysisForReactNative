package defpackage;
/* compiled from: PG */
/* renamed from: djcq  reason: default package */
/* loaded from: classes6.dex */
public final class djcq extends dsqw<djcq, djcn> implements dssk {
    public static final djcq h;
    private static volatile dssr<djcq> k;
    public int a;
    public djcp b;
    public int c;
    public dqlk e;
    public dnwb g;
    private dnqh i;
    private byte j = 2;
    public dspd d = dspd.b;
    public int f = 100;

    static {
        djcq djcqVar = new djcq();
        h = djcqVar;
        dsqw.cc(djcq.class, djcqVar);
    }

    private djcq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0007\u0000\u0001\u0002\n\u0007\u0000\u0000\u0001\u0002ဉ\u0001\u0004ᐉ\t\u0006င\u0004\u0007ည\u0005\bဉ\u0006\tင\u0007\nဉ\b", new Object[]{"a", "b", "i", "c", "d", "e", "f", "g"});
            }
            if (i2 == 3) {
                return new djcq();
            }
            if (i2 == 4) {
                return new djcn();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<djcq> dssrVar = k;
            if (dssrVar == null) {
                synchronized (djcq.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
