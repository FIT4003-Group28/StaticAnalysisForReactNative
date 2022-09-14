package defpackage;
/* compiled from: PG */
/* renamed from: dlbi  reason: default package */
/* loaded from: classes6.dex */
public final class dlbi extends dsqw<dlbi, dlbh> implements dssk {
    public static final dlbi d;
    private static volatile dssr<dlbi> f;
    public int a;
    public dnqh c;
    private byte e = 2;
    public String b = "";

    static {
        dlbi dlbiVar = new dlbi();
        d = dlbiVar;
        dsqw.cc(dlbi.class, dlbiVar);
    }

    private dlbi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dlbi();
            }
            if (i2 == 4) {
                return new dlbh();
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
            dssr<dlbi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlbi.class) {
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
