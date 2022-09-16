package defpackage;
/* compiled from: PG */
/* renamed from: cfgf  reason: default package */
/* loaded from: classes4.dex */
public final class cfgf extends dsqw<cfgf, cfge> implements dssk {
    public static final cfgf e;
    private static volatile dssr<cfgf> f;
    public int a;
    public dlnm b;
    public cfgd c;
    public boolean d;

    static {
        cfgf cfgfVar = new cfgf();
        e = cfgfVar;
        dsqw.cc(cfgf.class, cfgfVar);
    }

    private cfgf() {
    }

    public static /* synthetic */ void b(cfgf cfgfVar) {
        cfgfVar.a |= 4;
        cfgfVar.d = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဇ\u0002\u0005ဉ\u0001", new Object[]{"a", "b", "d", "c"});
            }
            if (i2 == 3) {
                return new cfgf();
            }
            if (i2 == 4) {
                return new cfge();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cfgf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (cfgf.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
