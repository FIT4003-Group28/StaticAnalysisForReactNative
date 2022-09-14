package defpackage;
/* compiled from: PG */
/* renamed from: dlbe  reason: default package */
/* loaded from: classes6.dex */
public final class dlbe extends dsqw<dlbe, dlbb> implements dssk {
    public static final dlbe g;
    private static volatile dssr<dlbe> i;
    public int a;
    public dlcx d;
    public dlbd e;
    private byte h = 2;
    public String b = "";
    public String c = "";
    public dsrj<dipk> f = dssu.b;

    static {
        dlbe dlbeVar = new dlbe();
        g = dlbeVar;
        dsqw.cc(dlbe.class, dlbeVar);
    }

    private dlbe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001ဈ\u0001\u0002ᐉ\u0002\u0003Л\u0004ဈ\u0000\u0005ဉ\u0003", new Object[]{"a", "c", "d", "f", dipk.class, "b", "e"});
            }
            if (i3 == 3) {
                return new dlbe();
            }
            if (i3 == 4) {
                return new dlbb();
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
            dssr<dlbe> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dlbe.class) {
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
