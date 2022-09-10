package defpackage;
/* compiled from: PG */
/* renamed from: cvte  reason: default package */
/* loaded from: classes5.dex */
public final class cvte extends dsqw<cvte, cvtd> implements dssk {
    public static final cvte b;
    private static volatile dssr<cvte> c;
    public dsrj<String> a = dssu.b;

    static {
        cvte cvteVar = new cvte();
        b = cvteVar;
        dsqw.cc(cvte.class, cvteVar);
    }

    private cvte() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new cvte();
            }
            if (i2 == 4) {
                return new cvtd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cvte> dssrVar = c;
            if (dssrVar == null) {
                synchronized (cvte.class) {
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

    public final void b() {
        dsrj<String> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
