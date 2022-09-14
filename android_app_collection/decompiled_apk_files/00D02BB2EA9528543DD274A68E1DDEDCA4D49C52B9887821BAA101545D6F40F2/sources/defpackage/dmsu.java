package defpackage;
/* compiled from: PG */
/* renamed from: dmsu  reason: default package */
/* loaded from: classes6.dex */
public final class dmsu extends dsqw<dmsu, dmsr> implements dssk {
    public static final dsrg<Integer, dmlo> i = new dmsq();
    public static final dmsu u;
    private static volatile dssr<dmsu> w;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean p;
    public float s;
    public float t;
    private byte v = 2;
    public dsrf h = dsqz.b;
    public int o = 1;
    public dsrj<dmoh> q = dssu.b;
    public dsrf r = dsqz.b;

    static {
        dmsu dmsuVar = new dmsu();
        u = dmsuVar;
        dsqw.cc(dmsu.class, dmsuVar);
    }

    private dmsu() {
    }

    public static /* synthetic */ void c(dmsu dmsuVar) {
        dmsuVar.a |= 4096;
        dmsuVar.p = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(u, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0003\u0001\u0001ဆ\u0000\u0002င\u0001\u0003ဆ\u0002\u0004င\u0003\u0005င\u0006\u0006Л\u0007ခ\r\bခ\u000e\t'\nင\u0004\u000bင\u0005\f\u001e\rင\t\u000eင\n\u000fဌ\u000b\u0010င\u0007\u0011ဆ\b\u0012ဇ\f", new Object[]{"a", "b", "c", "d", "e", "j", "q", dmoh.class, "s", "t", "r", "f", "g", "h", dmlo.c(), "m", "n", "o", dmss.a, "k", "l", "p"});
            }
            if (i3 == 3) {
                return new dmsu();
            }
            if (i3 == 4) {
                return new dmsr();
            }
            if (i3 == 5) {
                return u;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.v = b;
                return null;
            }
            dssr<dmsu> dssrVar = w;
            if (dssrVar == null) {
                synchronized (dmsu.class) {
                    dssrVar = w;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(u);
                        w = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.v);
    }

    public final void b() {
        dsrf dsrfVar = this.h;
        if (!dsrfVar.a()) {
            this.h = dsqw.cg(dsrfVar);
        }
    }
}
