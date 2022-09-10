package defpackage;
/* compiled from: PG */
/* renamed from: cfgj  reason: default package */
/* loaded from: classes4.dex */
public final class cfgj extends dsqw<cfgj, cfgi> implements dssk {
    public static final cfgj h;
    private static volatile dssr<cfgj> j;
    public int a;
    public dlno b;
    public dhjx c;
    public boolean f;
    private byte i = 2;
    public dsrj<cfgf> d = dssu.b;
    public dsrj<dvyw> e = dssu.b;
    public dsrj<cfgh> g = dssu.b;

    static {
        cfgj cfgjVar = new cfgj();
        h = cfgjVar;
        dsqw.cc(cfgj.class, cfgjVar);
    }

    private cfgj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0003\u0001\u0001ဉ\u0000\u0003ဉ\u0001\bЛ\tဇ\u0002\f\u001b\u000f\u001b", new Object[]{"a", "b", "c", "e", dvyw.class, "f", "d", cfgf.class, "g", cfgh.class});
            }
            if (i2 == 3) {
                return new cfgj();
            }
            if (i2 == 4) {
                return new cfgi();
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
            dssr<cfgj> dssrVar = j;
            if (dssrVar == null) {
                synchronized (cfgj.class) {
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

    public final void b() {
        dsrj<dvyw> dsrjVar = this.e;
        if (!dsrjVar.a()) {
            this.e = dsqw.cl(dsrjVar);
        }
    }

    public final void c() {
        dsrj<cfgh> dsrjVar = this.g;
        if (!dsrjVar.a()) {
            this.g = dsqw.cl(dsrjVar);
        }
    }
}
