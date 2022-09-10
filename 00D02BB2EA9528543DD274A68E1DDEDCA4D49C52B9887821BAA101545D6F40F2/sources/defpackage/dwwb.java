package defpackage;
/* compiled from: PG */
/* renamed from: dwwb  reason: default package */
/* loaded from: classes6.dex */
public final class dwwb extends dsqw<dwwb, dwwa> implements dssk {
    public static final dwwb j;
    private static volatile dssr<dwwb> l;
    public int a;
    public dusk b;
    public drdu h;
    private byte k = 2;
    public dsrj<dulb> c = dssu.b;
    public dsrj<drdy> d = dssu.b;
    public dsrj<djda> e = dssu.b;
    public String f = "";
    public String g = "";
    public String i = "";

    static {
        dwwb dwwbVar = new dwwb();
        j = dwwbVar;
        dsqw.cc(dwwb.class, dwwbVar);
    }

    private dwwb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0003\u0003\u0001ᐉ\u0000\u0002Л\u0003ဈ\u0004\u0005ဈ\u0001\u0006Л\u0007ဈ\u0002\bဉ\u0003\t\u001b", new Object[]{"a", "b", "c", dulb.class, "i", "f", "d", drdy.class, "g", "h", "e", djda.class});
            }
            if (i2 == 3) {
                return new dwwb();
            }
            if (i2 == 4) {
                return new dwwa();
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
            dssr<dwwb> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dwwb.class) {
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
