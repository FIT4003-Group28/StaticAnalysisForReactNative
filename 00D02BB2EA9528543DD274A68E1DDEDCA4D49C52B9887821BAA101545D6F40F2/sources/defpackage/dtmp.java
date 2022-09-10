package defpackage;
/* compiled from: PG */
/* renamed from: dtmp  reason: default package */
/* loaded from: classes6.dex */
public final class dtmp extends dsqw<dtmp, dtmo> implements dssk {
    public static final dtmp e;
    private static volatile dssr<dtmp> h;
    public int a;
    public dgrt b;
    public dgrn c;
    public int d;
    private dtag f;
    private byte g = 2;

    static {
        dtmp dtmpVar = new dtmp();
        e = dtmpVar;
        dsqw.cc(dtmp.class, dtmpVar);
    }

    private dtmp() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u000b\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003င\u0003\u000bᐉ\u0007", new Object[]{"a", "b", "c", "d", "f"});
            }
            if (i2 == 3) {
                return new dtmp();
            }
            if (i2 == 4) {
                return new dtmo();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dtmp> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dtmp.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
