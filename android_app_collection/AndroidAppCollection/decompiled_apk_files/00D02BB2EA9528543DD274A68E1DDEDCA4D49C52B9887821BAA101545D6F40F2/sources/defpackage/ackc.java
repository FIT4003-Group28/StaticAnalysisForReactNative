package defpackage;
/* compiled from: PG */
/* renamed from: ackc  reason: default package */
/* loaded from: classes2.dex */
public final class ackc extends dsqw<ackc, acka> implements dssk {
    public static final ackc b;
    private static volatile dssr<ackc> c;
    public dssd<String, Long> a = dssd.b;

    static {
        ackc ackcVar = new ackc();
        b = ackcVar;
        dsqw.cc(ackc.class, ackcVar);
    }

    private ackc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", ackb.a});
            }
            if (i2 == 3) {
                return new ackc();
            }
            if (i2 == 4) {
                return new acka();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ackc> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ackc.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final dssd<String, Long> b() {
        dssd<String, Long> dssdVar = this.a;
        if (!dssdVar.a) {
            this.a = dssdVar.a();
        }
        return this.a;
    }
}
