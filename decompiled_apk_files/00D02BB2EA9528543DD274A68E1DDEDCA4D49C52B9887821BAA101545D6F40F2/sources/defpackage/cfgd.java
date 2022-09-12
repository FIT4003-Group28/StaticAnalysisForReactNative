package defpackage;
/* compiled from: PG */
/* renamed from: cfgd  reason: default package */
/* loaded from: classes4.dex */
public final class cfgd extends dsqw<cfgd, cfga> implements dssk {
    public static final cfgd h;
    private static volatile dssr<cfgd> i;
    public int a;
    public boolean c;
    public dpum e;
    public dspd b = dspd.b;
    public dsrj<dspd> d = dssu.b;
    public dsrj<cfgc> f = dssu.b;
    public String g = "";

    static {
        cfgd cfgdVar = new cfgd();
        h = cfgdVar;
        dsqw.cc(cfgd.class, cfgdVar);
    }

    private cfgd() {
    }

    public static /* synthetic */ void d(cfgd cfgdVar) {
        cfgdVar.a |= 2;
        cfgdVar.c = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ည\u0000\u0002\u001c\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဇ\u0001\u0006\u001b", new Object[]{"a", "b", "d", "e", "g", "c", "f", cfgc.class});
            }
            if (i3 == 3) {
                return new cfgd();
            }
            if (i3 == 4) {
                return new cfga();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<cfgd> dssrVar = i;
            if (dssrVar == null) {
                synchronized (cfgd.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<dspd> dsrjVar = this.d;
        if (!dsrjVar.a()) {
            this.d = dsqw.cl(dsrjVar);
        }
    }

    public final void c() {
        dsrj<cfgc> dsrjVar = this.f;
        if (!dsrjVar.a()) {
            this.f = dsqw.cl(dsrjVar);
        }
    }
}
