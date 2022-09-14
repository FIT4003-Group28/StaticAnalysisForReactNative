package defpackage;
/* compiled from: PG */
/* renamed from: djux  reason: default package */
/* loaded from: classes6.dex */
public final class djux extends dsqw<djux, djuw> implements dssk {
    public static final djux c;
    private static volatile dssr<djux> g;
    public boolean b;
    private int d;
    private docg e;
    private byte f = 2;
    public dsrj<docg> a = dssu.b;

    static {
        djux djuxVar = new djux();
        c = djuxVar;
        dsqw.cc(djux.class, djuxVar);
    }

    private djux() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0001\u0002\u0001Л\u0002ဇ\u0001\tᐉ\u0000", new Object[]{"d", "a", docg.class, "b", "e"});
            }
            if (i2 == 3) {
                return new djux();
            }
            if (i2 == 4) {
                return new djuw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<djux> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djux.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
