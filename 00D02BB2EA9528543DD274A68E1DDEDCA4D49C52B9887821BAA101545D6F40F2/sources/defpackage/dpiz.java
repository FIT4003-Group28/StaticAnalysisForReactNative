package defpackage;
/* compiled from: PG */
/* renamed from: dpiz  reason: default package */
/* loaded from: classes6.dex */
public final class dpiz extends dsqw<dpiz, dpiw> implements dssk {
    public static final dpiz h;
    private static volatile dssr<dpiz> j;
    public int a;
    public int c;
    public dozz d;
    public dpiy f;
    private byte i = 2;
    public String b = "";
    public dsrj<dpce> e = dssu.b;
    public String g = "";

    static {
        dpiz dpizVar = new dpiz();
        h = dpizVar;
        dsqw.cc(dpiz.class, dpizVar);
    }

    private dpiz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0003\u0001ဈ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002\u0004Л\u0005ᐉ\u0003\u0006ဈ\u0004", new Object[]{"a", "b", "c", dqvj.d(), "d", "e", dpce.class, "f", "g"});
            }
            if (i2 == 3) {
                return new dpiz();
            }
            if (i2 == 4) {
                return new dpiw();
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
            dssr<dpiz> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dpiz.class) {
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
