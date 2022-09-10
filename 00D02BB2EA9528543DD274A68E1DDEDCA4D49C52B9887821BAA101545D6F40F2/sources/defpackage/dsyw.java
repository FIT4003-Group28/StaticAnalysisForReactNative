package defpackage;
/* compiled from: PG */
/* renamed from: dsyw  reason: default package */
/* loaded from: classes6.dex */
public final class dsyw extends dsqs<dsyw, dsyv> implements dsqt {
    public static final dsyw d;
    private static volatile dssr<dsyw> g;
    private int e;
    private byte f = 2;
    public String a = "";
    public dsrj<dsyn> b = dssu.b;
    public dsrj<dsyn> c = dssu.b;

    static {
        dsyw dsywVar = new dsyw();
        d = dsywVar;
        dsqw.cc(dsyw.class, dsywVar);
    }

    private dsyw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0002\u0004ဈ\u0002\u0005Л\u0006Л", new Object[]{"e", "a", "b", dsyn.class, "c", dsyn.class});
            }
            if (i2 == 3) {
                return new dsyw();
            }
            if (i2 == 4) {
                return new dsyv();
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
            dssr<dsyw> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dsyw.class) {
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
