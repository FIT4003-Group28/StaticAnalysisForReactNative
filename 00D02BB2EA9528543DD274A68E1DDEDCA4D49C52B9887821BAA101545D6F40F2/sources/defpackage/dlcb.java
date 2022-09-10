package defpackage;
/* compiled from: PG */
/* renamed from: dlcb  reason: default package */
/* loaded from: classes6.dex */
public final class dlcb extends dsqw<dlcb, dlca> implements dssk {
    public static final dlcb e;
    private static volatile dssr<dlcb> g;
    public int a;
    public dlcx b;
    public docg c;
    private byte f = 2;
    public dsrj<dwfl> d = dssu.b;

    static {
        dlcb dlcbVar = new dlcb();
        e = dlcbVar;
        dsqw.cc(dlcb.class, dlcbVar);
    }

    private dlcb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", dwfl.class});
            }
            if (i2 == 3) {
                return new dlcb();
            }
            if (i2 == 4) {
                return new dlca();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dlcb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlcb.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
