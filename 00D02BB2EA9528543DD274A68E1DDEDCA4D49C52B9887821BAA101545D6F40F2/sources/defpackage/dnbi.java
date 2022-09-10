package defpackage;
/* compiled from: PG */
/* renamed from: dnbi  reason: default package */
/* loaded from: classes.dex */
public final class dnbi extends dsqw<dnbi, dnbf> implements dssk {
    public static final dnbi h;
    private static volatile dssr<dnbi> k;
    public int a;
    public dniu b;
    public dncl c;
    public int d;
    public dsrf e;
    public dnas f;
    public dnbi g;
    private dnhs i;
    private byte j = 2;

    static {
        dnbi dnbiVar = new dnbi();
        h = dnbiVar;
        dsqw.cc(dnbi.class, dnbiVar);
    }

    private dnbi() {
        dsqz dsqzVar = dsqz.b;
        this.d = 1;
        this.e = dsqz.b;
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0007\u0000\u0001\u0001\u0014\u0007\u0000\u0001\u0003\u0001ᐉ\u000e\u0002ဉ\u0000\bᐉ\u0004\u000bဌ\u0007\fᐉ\u0003\u0013\u001d\u0014ဉ\n", new Object[]{"a", "g", "b", "i", "d", dnbh.c(), "c", "e", "f"});
            }
            if (i2 == 3) {
                return new dnbi();
            }
            if (i2 == 4) {
                return new dnbf();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<dnbi> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dnbi.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
