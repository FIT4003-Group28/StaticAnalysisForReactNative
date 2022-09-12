package defpackage;
/* compiled from: PG */
/* renamed from: dlyc  reason: default package */
/* loaded from: classes6.dex */
public final class dlyc extends dsqw<dlyc, dlyb> implements dssk {
    public static final dlyc n;
    private static volatile dssr<dlyc> p;
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public long h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    private int o;

    static {
        dlyc dlycVar = new dlyc();
        n = dlycVar;
        dsqw.cc(dlyc.class, dlycVar);
    }

    private dlyc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bဂ\u0007\tင\b\nင\t\u000bင\n\fင\u000b\rဂ\f", new Object[]{"o", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            }
            if (i2 == 3) {
                return new dlyc();
            }
            if (i2 == 4) {
                return new dlyb();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlyc> dssrVar = p;
            if (dssrVar == null) {
                synchronized (dlyc.class) {
                    dssrVar = p;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        p = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
