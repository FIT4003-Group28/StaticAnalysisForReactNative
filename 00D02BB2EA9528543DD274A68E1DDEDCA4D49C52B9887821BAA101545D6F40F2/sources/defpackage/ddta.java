package defpackage;
/* compiled from: PG */
/* renamed from: ddta  reason: default package */
/* loaded from: classes6.dex */
public final class ddta extends dsqw<ddta, ddsx> implements dssk {
    public static final ddta c;
    private static volatile dssr<ddta> e;
    private byte d = 2;
    public dsrj<ddsz> a = dssu.b;
    public dsrj<ddhk> b = dssu.b;

    static {
        ddta ddtaVar = new ddta();
        c = ddtaVar;
        dsqw.cc(ddta.class, ddtaVar);
    }

    private ddta() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"a", ddsz.class, "b", ddhk.class});
            }
            if (i2 == 3) {
                return new ddta();
            }
            if (i2 == 4) {
                return new ddsx();
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
            dssr<ddta> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddta.class) {
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
