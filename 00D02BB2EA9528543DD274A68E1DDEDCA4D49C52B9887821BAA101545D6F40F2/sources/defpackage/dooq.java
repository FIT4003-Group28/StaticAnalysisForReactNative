package defpackage;
/* compiled from: PG */
/* renamed from: dooq  reason: default package */
/* loaded from: classes6.dex */
public final class dooq extends dsqw<dooq, doop> implements dssk {
    public static final dooq f;
    private static volatile dssr<dooq> h;
    public int a;
    public doui c;
    public dooy d;
    private byte g = 2;
    public dsrj<dpce> b = dssu.b;
    public dsrj<dopa> e = dssu.b;

    static {
        dooq dooqVar = new dooq();
        f = dooqVar;
        dsqw.cc(dooq.class, dooqVar);
    }

    private dooq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0004\u0007\u0004\u0000\u0002\u0001\u0004Л\u0005ဉ\u0003\u0006ဉ\u0004\u0007\u001b", new Object[]{"a", "b", dpce.class, "c", "d", "e", dopa.class});
            }
            if (i2 == 3) {
                return new dooq();
            }
            if (i2 == 4) {
                return new doop();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dooq> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dooq.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}