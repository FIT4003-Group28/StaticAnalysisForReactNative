package defpackage;
/* compiled from: PG */
/* renamed from: doxd  reason: default package */
/* loaded from: classes6.dex */
public final class doxd extends dsqw<doxd, dows> implements dssk {
    public static final doxd l;
    private static volatile dssr<doxd> n;
    public int a;
    public dgas b;
    public int c;
    public dgas d;
    public dowu e;
    public dgas f;
    public dgaw h;
    public dgaw i;
    private byte m = 2;
    public dspd g = dspd.b;
    public dsrj<doxc> j = dssu.b;
    public dsrj<doxc> k = dssu.b;

    static {
        doxd doxdVar = new doxd();
        l = doxdVar;
        dsqw.cc(doxd.class, doxdVar);
    }

    private doxd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0002\u0002\u0001ဉ\u0000\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ည\u0006\bဉ\u0007\tဉ\b\nЛ\u000bЛ", new Object[]{"a", "b", "c", dpej.c(), "d", "e", "f", "g", "h", "i", "j", doxc.class, "k", doxc.class});
            }
            if (i2 == 3) {
                return new doxd();
            }
            if (i2 == 4) {
                return new dows();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            }
            dssr<doxd> dssrVar = n;
            if (dssrVar == null) {
                synchronized (doxd.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.m);
    }
}
