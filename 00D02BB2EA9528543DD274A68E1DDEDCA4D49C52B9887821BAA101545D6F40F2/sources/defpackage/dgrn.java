package defpackage;
/* compiled from: PG */
/* renamed from: dgrn  reason: default package */
/* loaded from: classes.dex */
public final class dgrn extends dsqw<dgrn, dgrm> implements dssk {
    public static final dgrn d;
    private static volatile dssr<dgrn> g;
    public int a;
    public int b;
    public int c;
    private dtro e;
    private byte f = 2;

    static {
        dgrn dgrnVar = new dgrn();
        d = dgrnVar;
        dsqw.cc(dgrn.class, dgrnVar);
    }

    private dgrn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u000f\u0003\u0000\u0000\u0003\u0001ᔆ\u0000\u0002ᔆ\u0001\u000fᐉ\u0003", new Object[]{"a", "b", "c", "e"});
            }
            if (i2 == 3) {
                return new dgrn();
            }
            if (i2 == 4) {
                return new dgrm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dgrn> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgrn.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
