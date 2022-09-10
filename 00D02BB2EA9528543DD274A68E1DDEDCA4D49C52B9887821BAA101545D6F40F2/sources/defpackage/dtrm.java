package defpackage;
/* compiled from: PG */
/* renamed from: dtrm  reason: default package */
/* loaded from: classes6.dex */
public final class dtrm extends dsqw<dtrm, dtrl> implements dssk {
    public static final dtrm l;
    private static volatile dssr<dtrm> n;
    public int a;
    public dgrh b;
    public int d;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean k;
    private byte m = 2;
    public String c = "";
    public String e = "";
    public String i = "";
    public String j = "";

    static {
        dtrm dtrmVar = new dtrm();
        l = dtrmVar;
        dsqw.cc(dtrm.class, dtrmVar);
    }

    private dtrm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0002\u0003ဈ\u0003\u0004ဇ\u0004\u0005ဇ\u0005\u0006ဇ\u0006\tဈ\t\nဈ\n\u000bဈ\u0001\fဇ\u000b", new Object[]{"a", "b", "d", "e", "f", "g", "h", "i", "j", "c", "k"});
            }
            if (i2 == 3) {
                return new dtrm();
            }
            if (i2 == 4) {
                return new dtrl();
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
            dssr<dtrm> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dtrm.class) {
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
