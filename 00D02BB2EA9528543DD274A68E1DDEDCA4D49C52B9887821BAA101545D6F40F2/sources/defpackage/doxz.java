package defpackage;
/* compiled from: PG */
/* renamed from: doxz  reason: default package */
/* loaded from: classes6.dex */
public final class doxz extends dsqw<doxz, doxs> implements dssk {
    public static final doxz j;
    private static volatile dssr<doxz> l;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int h;
    private byte k = 2;
    public String g = "";
    public dsrj<doxy> i = dssu.b;

    static {
        doxz doxzVar = new doxz();
        j = doxzVar;
        dsqw.cc(doxz.class, doxzVar);
    }

    private doxz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0001\u0001ᔌ\u0000\u0002ဏ\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဈ\u0005\bင\u0007\t\u001b", new Object[]{"a", "b", doxu.c(), "c", "d", "e", "f", "g", "h", "i", doxy.class});
            }
            if (i2 == 3) {
                return new doxz();
            }
            if (i2 == 4) {
                return new doxs();
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
            dssr<doxz> dssrVar = l;
            if (dssrVar == null) {
                synchronized (doxz.class) {
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
