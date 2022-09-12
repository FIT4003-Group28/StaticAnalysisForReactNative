package defpackage;
/* compiled from: PG */
/* renamed from: ccwk  reason: default package */
/* loaded from: classes4.dex */
public final class ccwk extends dsqw<ccwk, ccwj> implements dssk {
    public static final ccwk m;
    private static volatile dssr<ccwk> n;
    public int a;
    public int b;
    public ccxa c;
    public int h;
    public int k;
    public dgfg l;
    public dsrj<String> d = dssu.b;
    public dsrj<String> e = dssu.b;
    public String f = "";
    public String g = "";
    public String i = "";
    public String j = "";

    static {
        ccwk ccwkVar = new ccwk();
        m = ccwkVar;
        dsqw.cc(ccwk.class, ccwkVar);
    }

    private ccwk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003\u001a\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဌ\u0004\u0007ဈ\u0005\bဈ\u0006\tဌ\u0007\nဉ\b\u000b\u001a", new Object[]{"a", "b", dgfb.c(), "c", "d", "f", "g", "h", dray.a, "i", "j", "k", draa.a, "l", "e"});
            }
            if (i2 == 3) {
                return new ccwk();
            }
            if (i2 == 4) {
                return new ccwj();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ccwk> dssrVar = n;
            if (dssrVar == null) {
                synchronized (ccwk.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<String> dsrjVar = this.d;
        if (!dsrjVar.a()) {
            this.d = dsqw.cl(dsrjVar);
        }
    }
}
