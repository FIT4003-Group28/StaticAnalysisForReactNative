package defpackage;
/* compiled from: PG */
/* renamed from: bwns  reason: default package */
/* loaded from: classes4.dex */
public final class bwns extends dsqw<bwns, bwnr> implements dssk {
    public static final bwns d;
    private static volatile dssr<bwns> f;
    public int a;
    public dtkx b;
    public long c;
    private byte e = 2;

    static {
        bwns bwnsVar = new bwns();
        d = bwnsVar;
        dsqw.cc(bwns.class, bwnsVar);
    }

    private bwns() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bwns();
            }
            if (i2 == 4) {
                return new bwnr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<bwns> dssrVar = f;
            if (dssrVar == null) {
                synchronized (bwns.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
