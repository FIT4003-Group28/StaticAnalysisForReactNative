package defpackage;
/* compiled from: PG */
/* renamed from: dluc  reason: default package */
/* loaded from: classes6.dex */
public final class dluc extends dsqw<dluc, dlub> implements dssk {
    public static final dluc d;
    private static volatile dssr<dluc> f;
    public int a;
    public dwzj b;
    public dwzj c;
    private byte e = 2;

    static {
        dluc dlucVar = new dluc();
        d = dlucVar;
        dsqw.cc(dluc.class, dlucVar);
    }

    private dluc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dluc();
            }
            if (i2 == 4) {
                return new dlub();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dluc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dluc.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
