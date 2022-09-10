package defpackage;
/* compiled from: PG */
/* renamed from: dldb  reason: default package */
/* loaded from: classes6.dex */
public final class dldb extends dsqw<dldb, dlda> implements dssk {
    public static final dldb d;
    private static volatile dssr<dldb> g;
    private int e;
    private byte f = 2;
    public String a = "";
    public String b = "";
    public dsrj<dlcx> c = dssu.b;

    static {
        dldb dldbVar = new dldb();
        d = dldbVar;
        dsqw.cc(dldb.class, dldbVar);
    }

    private dldb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003Л", new Object[]{"e", "a", "b", "c", dlcx.class});
            }
            if (i2 == 3) {
                return new dldb();
            }
            if (i2 == 4) {
                return new dlda();
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
            dssr<dldb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dldb.class) {
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
