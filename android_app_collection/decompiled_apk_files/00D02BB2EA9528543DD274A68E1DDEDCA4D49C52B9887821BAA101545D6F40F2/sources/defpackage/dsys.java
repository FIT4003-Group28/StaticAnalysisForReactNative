package defpackage;
/* compiled from: PG */
/* renamed from: dsys  reason: default package */
/* loaded from: classes6.dex */
public final class dsys extends dsqs<dsys, dsyr> implements dsqt {
    public static final dsys d;
    private static volatile dssr<dsys> g;
    public int a;
    public dbko b;
    public int c;
    private dbkr e;
    private byte f = 2;

    static {
        dsys dsysVar = new dsys();
        d = dsysVar;
        dsqw.cc(dsys.class, dsysVar);
    }

    private dsys() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0004ဌ\u0004", new Object[]{"a", "e", "b", "c", dsyt.a});
            }
            if (i2 == 3) {
                return new dsys();
            }
            if (i2 == 4) {
                return new dsyr();
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
            dssr<dsys> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dsys.class) {
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
