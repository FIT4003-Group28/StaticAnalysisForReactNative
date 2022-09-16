package defpackage;
/* compiled from: PG */
/* renamed from: dhjf  reason: default package */
/* loaded from: classes.dex */
public final class dhjf extends dsqw<dhjf, dhix> implements dssk {
    public static final dhjf i;
    private static volatile dssr<dhjf> j;
    public int a;
    public int b;
    public int c;
    public int d;
    public dhjb e;
    public String f = "";
    public dsrj<dhjd> g = dssu.b;
    public dspd h = dspd.b;

    static {
        dhjf dhjfVar = new dhjf();
        i = dhjfVar;
        dsqw.cc(dhjf.class, dhjfVar);
    }

    private dhjf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဉ\u0003\u0003\u001b\u0004င\u0001\u0005ဌ\u0002\u0007ည\u0006\bဈ\u0004", new Object[]{"a", "b", dhje.a, "e", "g", dhjd.class, "c", "d", dhiz.c(), "h", "f"});
            }
            if (i3 == 3) {
                return new dhjf();
            }
            if (i3 == 4) {
                return new dhix();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dhjf> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dhjf.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
