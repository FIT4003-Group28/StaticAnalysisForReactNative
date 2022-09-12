package defpackage;
/* compiled from: PG */
/* renamed from: dlta  reason: default package */
/* loaded from: classes6.dex */
public final class dlta extends dsqw<dlta, dlsz> implements dssk {
    public static final dlta d;
    private static volatile dssr<dlta> g;
    public dvfk a;
    public dltc b;
    public int c;
    private int e;
    private byte f = 2;

    static {
        dlta dltaVar = new dlta();
        d = dltaVar;
        dsqw.cc(dlta.class, dltaVar);
    }

    private dlta() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", "c", dltz.c()});
            }
            if (i2 == 3) {
                return new dlta();
            }
            if (i2 == 4) {
                return new dlsz();
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
            dssr<dlta> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlta.class) {
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
