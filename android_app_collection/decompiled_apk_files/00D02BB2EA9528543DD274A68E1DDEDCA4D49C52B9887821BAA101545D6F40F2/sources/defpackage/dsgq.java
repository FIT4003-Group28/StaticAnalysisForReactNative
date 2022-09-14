package defpackage;
/* compiled from: PG */
/* renamed from: dsgq  reason: default package */
/* loaded from: classes6.dex */
public final class dsgq extends dsqw<dsgq, dsgp> implements dssk {
    public static final dsgq b;
    private static volatile dssr<dsgq> c;
    public dsrj<dsgt> a = dssu.b;

    static {
        dsgq dsgqVar = new dsgq();
        b = dsgqVar;
        dsqw.cc(dsgq.class, dsgqVar);
    }

    private dsgq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dsgt.class});
            }
            if (i2 == 3) {
                return new dsgq();
            }
            if (i2 == 4) {
                return new dsgp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsgq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dsgq.class) {
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
}
