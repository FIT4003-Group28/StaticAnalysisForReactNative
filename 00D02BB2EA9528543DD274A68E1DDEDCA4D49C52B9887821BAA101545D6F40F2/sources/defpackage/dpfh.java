package defpackage;
/* compiled from: PG */
/* renamed from: dpfh  reason: default package */
/* loaded from: classes6.dex */
public final class dpfh extends dsqw<dpfh, dpey> implements dssk {
    public static final dpfh l;
    private static volatile dssr<dpfh> n;
    public int a;
    public int d;
    public boolean g;
    public dozz h;
    public dpfa i;
    public dpfc j;
    public int k;
    private byte m = 2;
    public String b = "";
    public String c = "";
    public dsrj<dotj> e = dssu.b;
    public dspd f = dspd.b;

    static {
        dpfh dpfhVar = new dpfh();
        l = dpfhVar;
        dsqw.cc(dpfh.class, dpfhVar);
    }

    private dpfh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0002\r\n\u0000\u0001\u0001\u0002ည\u0003\u0003ᐉ\u0005\u0006ဈ\u0000\u0007ဈ\u0001\bဉ\u0006\t\u001b\nဉ\u0007\u000bဌ\u0002\fဇ\u0004\rဌ\b", new Object[]{"a", "f", "h", "b", "c", "i", "e", dotj.class, "j", "d", dpfe.c(), "g", "k", dpew.a});
            }
            if (i2 == 3) {
                return new dpfh();
            }
            if (i2 == 4) {
                return new dpey();
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
            dssr<dpfh> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dpfh.class) {
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
