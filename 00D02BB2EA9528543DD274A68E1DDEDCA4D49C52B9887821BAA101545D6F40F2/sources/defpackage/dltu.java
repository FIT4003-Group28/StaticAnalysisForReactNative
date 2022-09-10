package defpackage;
/* compiled from: PG */
/* renamed from: dltu  reason: default package */
/* loaded from: classes6.dex */
public final class dltu extends dsqw<dltu, dltt> implements dssk {
    public static final dltu g;
    private static volatile dssr<dltu> i;
    public int a;
    public dvfo b;
    public dltc c;
    public boolean d;
    public int f;
    private byte h = 2;
    public dsri e = dsrx.b;

    static {
        dltu dltuVar = new dltu();
        g = dltuVar;
        dsqw.cc(dltu.class, dltuVar);
    }

    private dltu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004\u0014\u0005င\u0003", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dltu();
            }
            if (i3 == 4) {
                return new dltt();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dltu> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dltu.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
