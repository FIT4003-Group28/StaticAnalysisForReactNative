package defpackage;
/* compiled from: PG */
/* renamed from: dipt  reason: default package */
/* loaded from: classes6.dex */
public final class dipt extends dsqw<dipt, dipp> implements dssk {
    public static final dipt j;
    private static volatile dssr<dipt> m;
    public int a;
    public long c;
    public long e;
    public boolean i;
    private dnqh k;
    private byte l = 2;
    public int b = 1;
    public String d = "";
    public dspd f = dspd.b;
    public int g = 10;
    public dsrj<dips> h = dssu.b;

    static {
        dipt diptVar = new dipt();
        j = diptVar;
        dsqw.cc(dipt.class, diptVar);
    }

    private dipt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(j, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဃ\u0001\u0003ဃ\u0003\u0004ည\u0004\u0005င\u0005\u0006\u001b\u0007ᐉ\u0006\bဈ\u0002\nဇ\b", new Object[]{"a", "b", dipq.a, "c", "e", "f", "g", "h", dips.class, "k", "d", "i"});
            }
            if (i2 == 3) {
                return new dipt();
            }
            if (i2 == 4) {
                return new dipp();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            }
            dssr<dipt> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dipt.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.l);
    }
}
