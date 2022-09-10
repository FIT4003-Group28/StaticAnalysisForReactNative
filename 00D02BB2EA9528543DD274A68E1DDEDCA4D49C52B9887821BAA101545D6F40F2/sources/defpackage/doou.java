package defpackage;
/* compiled from: PG */
/* renamed from: doou  reason: default package */
/* loaded from: classes6.dex */
public final class doou extends dsqw<doou, doot> implements dssk {
    public static final doou h;
    private static volatile dssr<doou> j;
    public int a;
    public douj f;
    private byte i = 2;
    public String b = "";
    public String c = "";
    public dsrj<dpce> d = dssu.b;
    public String e = "";
    public dsrj<dooq> g = dssu.b;

    static {
        doou doouVar = new doou();
        h = doouVar;
        dsqw.cc(doou.class, doouVar);
    }

    private doou() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0003\u0001Л\u0002ᐉ\u0003\u0003Л\u0004ဈ\u0002\u0005ဈ\u0000\u0006ဈ\u0001", new Object[]{"a", "d", dpce.class, "f", "g", dooq.class, "e", "b", "c"});
            }
            if (i2 == 3) {
                return new doou();
            }
            if (i2 == 4) {
                return new doot();
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
            dssr<doou> dssrVar = j;
            if (dssrVar == null) {
                synchronized (doou.class) {
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
