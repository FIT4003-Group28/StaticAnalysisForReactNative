package defpackage;
/* compiled from: PG */
/* renamed from: ccln  reason: default package */
/* loaded from: classes4.dex */
public final class ccln extends dsqw<ccln, cclm> implements dssk {
    public static final ccln p;
    private static volatile dssr<ccln> q;
    public int a;
    public Object c;
    public int e;
    public int g;
    public int h;
    public int k;
    public dgep l;
    public int b = 0;
    public String d = "";
    public String f = "";
    public dsrj<dwfl> i = dssu.b;
    public String j = "";
    public String m = "";
    public dsrj<cclv> n = dssu.b;
    public dsrj<dgez> o = dssu.b;

    static {
        ccln cclnVar = new ccln();
        p = cclnVar;
        dsqw.cc(ccln.class, cclnVar);
    }

    private ccln() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(p, "\u0001\r\u0001\u0001\u0001\r\r\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0003\u0004င\u0004\u0005င\u0005\u0006\u001b\u0007ဈ\u0006\bဌ\u0007\tဉ\b\nြ\u0000\u000bဈ\t\f\u001b\r\u001b", new Object[]{"c", "b", "a", "d", "e", dgfb.c(), "f", "g", "h", "i", dwfl.class, "j", "k", dray.a, "l", dgev.class, "m", "n", cclv.class, "o", dgez.class});
            }
            if (i2 == 3) {
                return new ccln();
            }
            if (i2 == 4) {
                return new cclm();
            }
            if (i2 == 5) {
                return p;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ccln> dssrVar = q;
            if (dssrVar == null) {
                synchronized (ccln.class) {
                    dssrVar = q;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(p);
                        q = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<dwfl> dsrjVar = this.i;
        if (!dsrjVar.a()) {
            this.i = dsqw.cl(dsrjVar);
        }
    }
}
