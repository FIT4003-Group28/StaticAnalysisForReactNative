package defpackage;
/* compiled from: PG */
/* renamed from: dtkl  reason: default package */
/* loaded from: classes6.dex */
public final class dtkl extends dsqs<dtkl, dtkk> implements dsqt {
    public static final dtkl a;
    private static volatile dssr<dtkl> g;
    private int b;
    private dtkf c;
    private dtkf d;
    private dtkf e;
    private byte f = 2;

    static {
        dtkl dtklVar = new dtkl();
        a = dtklVar;
        dsqw.cc(dtkl.class, dtklVar);
    }

    private dtkl() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dtkl();
            }
            if (i2 == 4) {
                return new dtkk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dtkl> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dtkl.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
