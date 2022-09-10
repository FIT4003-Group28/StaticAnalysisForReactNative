package defpackage;
/* compiled from: PG */
/* renamed from: djgd  reason: default package */
/* loaded from: classes6.dex */
public final class djgd extends dsqw<djgd, djfy> implements dssk {
    public static final djgd j;
    private static volatile dssr<djgd> l;
    public int a;
    public Object c;
    public int f;
    public boolean g;
    public int b = 0;
    private byte k = 2;
    public dsrj<dqeg> d = dssu.b;
    public String e = "";
    public dsrj<djvd> h = dssu.b;
    public dsrj<djev> i = dssu.b;

    static {
        djgd djgdVar = new djgd();
        j = djgdVar;
        dsqw.cc(djgd.class, djgdVar);
    }

    private djgd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0003\u0002\u0001\u001b\u0002ဈ\u0000\u0003\u001b\u0004Л\u0005ဇ\u0002\u0006ᐼ\u0000\u0007င\u0001\bြ\u0000", new Object[]{"c", "b", "a", "d", dqeg.class, "e", "h", djvd.class, "i", djev.class, "g", djhw.class, "f", djgc.class});
            }
            if (i2 == 3) {
                return new djgd();
            }
            if (i2 == 4) {
                return new djfy();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            }
            dssr<djgd> dssrVar = l;
            if (dssrVar == null) {
                synchronized (djgd.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.k);
    }
}
