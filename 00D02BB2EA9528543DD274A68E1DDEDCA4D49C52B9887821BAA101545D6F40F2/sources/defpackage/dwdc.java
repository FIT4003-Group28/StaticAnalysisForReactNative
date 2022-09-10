package defpackage;
/* compiled from: PG */
/* renamed from: dwdc  reason: default package */
/* loaded from: classes6.dex */
public final class dwdc extends dsqw<dwdc, dwdb> implements dssk {
    public static final dwdc b;
    private static volatile dssr<dwdc> c;
    public dsrj<dqzv> a = dssu.b;

    static {
        dwdc dwdcVar = new dwdc();
        b = dwdcVar;
        dsqw.cc(dwdc.class, dwdcVar);
    }

    private dwdc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dqzv.class});
            }
            if (i2 == 3) {
                return new dwdc();
            }
            if (i2 == 4) {
                return new dwdb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwdc> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dwdc.class) {
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

    public final void c() {
        dsrj<dqzv> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
