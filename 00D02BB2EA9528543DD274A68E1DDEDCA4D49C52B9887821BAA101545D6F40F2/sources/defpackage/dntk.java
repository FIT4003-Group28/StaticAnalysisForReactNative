package defpackage;
/* compiled from: PG */
/* renamed from: dntk  reason: default package */
/* loaded from: classes6.dex */
public final class dntk extends dsqw<dntk, dntj> implements dssk {
    public static final dntk c;
    private static volatile dssr<dntk> e;
    private byte d = 2;
    public dsrj<dmwx> a = dssu.b;
    public dsrj<dmyu> b = dssu.b;

    static {
        dntk dntkVar = new dntk();
        c = dntkVar;
        dsqw.cc(dntk.class, dntkVar);
    }

    private dntk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"a", dmwx.class, "b", dmyu.class});
            }
            if (i2 == 3) {
                return new dntk();
            }
            if (i2 == 4) {
                return new dntj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dntk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dntk.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
