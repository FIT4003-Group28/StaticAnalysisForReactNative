package defpackage;
/* compiled from: PG */
/* renamed from: dncj  reason: default package */
/* loaded from: classes6.dex */
public final class dncj extends dsqw<dncj, dnbw> implements dssk {
    public static final dncj p;
    private static volatile dssr<dncj> r;
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public dncc e;
    public boolean f;
    public int g;
    public dncc h;
    public int i;
    public int j;
    public int k;
    public int l;
    public dncg m;
    public int n;
    public boolean o;
    private boolean q;

    static {
        dncj dncjVar = new dncj();
        p = dncjVar;
        dsqw.cc(dncj.class, dncjVar);
    }

    private dncj() {
    }

    public static /* synthetic */ void b(dncj dncjVar) {
        dncjVar.a |= 32768;
        dncjVar.q = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(p, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0002\u0003င\u0005\u0004ဌ\u0007\u0005ဇ\u0001\u0007ဌ\b\bဉ\u0003\tဉ\u0006\nဌ\n\u000bဇ\u0004\fဌ\t\rဉ\u000b\u000eဌ\f\u000fဇ\r\u0011ဇ\u000f", new Object[]{"a", "b", "d", "g", "i", dnby.a, "c", "j", dnch.a, "e", "h", "l", dnbx.a, "f", "k", dnci.a, "m", "n", dfpv.a, "o", "q"});
            }
            if (i2 == 3) {
                return new dncj();
            }
            if (i2 == 4) {
                return new dnbw();
            }
            if (i2 == 5) {
                return p;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dncj> dssrVar = r;
            if (dssrVar == null) {
                synchronized (dncj.class) {
                    dssrVar = r;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(p);
                        r = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
