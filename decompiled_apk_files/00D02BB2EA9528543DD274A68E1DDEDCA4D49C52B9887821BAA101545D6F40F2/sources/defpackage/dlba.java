package defpackage;
/* compiled from: PG */
/* renamed from: dlba  reason: default package */
/* loaded from: classes6.dex */
public final class dlba extends dsqw<dlba, dlaz> implements dssk {
    public static final dlba d;
    private static volatile dssr<dlba> f;
    public int a;
    public dlcx b;
    public dipk c;
    private byte e = 2;

    static {
        dlba dlbaVar = new dlba();
        d = dlbaVar;
        dsqw.cc(dlba.class, dlbaVar);
    }

    private dlba() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0003ᐉ\u0000", new Object[]{"a", "c", "b"});
            }
            if (i2 == 3) {
                return new dlba();
            }
            if (i2 == 4) {
                return new dlaz();
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
            dssr<dlba> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlba.class) {
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
