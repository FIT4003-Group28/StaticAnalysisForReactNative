package defpackage;
/* compiled from: PG */
/* renamed from: dsvd  reason: default package */
/* loaded from: classes6.dex */
public final class dsvd extends dsqw<dsvd, dsvc> implements dssk {
    public static final dsvd d;
    private static volatile dssr<dsvd> g;
    public Object b;
    public int c;
    private int e;
    public int a = 0;
    private byte f = 2;

    static {
        dsvd dsvdVar = new dsvd();
        d = dsvdVar;
        dsqw.cc(dsvd.class, dsvdVar);
    }

    private dsvd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐼ\u0000", new Object[]{"b", "a", "e", "c", dsyl.c(), dsvf.class});
            }
            if (i2 == 3) {
                return new dsvd();
            }
            if (i2 == 4) {
                return new dsvc();
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
            dssr<dsvd> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dsvd.class) {
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
