package defpackage;
/* compiled from: PG */
/* renamed from: djev  reason: default package */
/* loaded from: classes6.dex */
public final class djev extends dsqw<djev, djeq> implements dssk {
    public static final djev h;
    private static volatile dssr<djev> j;
    public int a;
    public djep c;
    public int e;
    public int f;
    public int g;
    private byte i = 2;
    public String b = "";
    public String d = "";

    static {
        djev djevVar = new djev();
        h = djevVar;
        dsqw.cc(djev.class, djevVar);
    }

    private djev() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", "c", "d", "e", djeu.c(), "f", djes.c(), "g", djes.c()});
            }
            if (i2 == 3) {
                return new djev();
            }
            if (i2 == 4) {
                return new djeq();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<djev> dssrVar = j;
            if (dssrVar == null) {
                synchronized (djev.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
