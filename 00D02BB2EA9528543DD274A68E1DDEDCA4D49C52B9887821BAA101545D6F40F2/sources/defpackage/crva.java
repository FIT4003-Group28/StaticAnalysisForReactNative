package defpackage;
/* compiled from: PG */
/* renamed from: crva  reason: default package */
/* loaded from: classes5.dex */
public final class crva extends dsqw<crva, crux> implements dssk {
    public static final crva b;
    private static volatile dssr<crva> c;
    public dsrj<cruz> a = dssu.b;

    static {
        crva crvaVar = new crva();
        b = crvaVar;
        dsqw.cc(crva.class, crvaVar);
    }

    private crva() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cruz.class});
            }
            if (i2 == 3) {
                return new crva();
            }
            if (i2 == 4) {
                return new crux();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<crva> dssrVar = c;
            if (dssrVar == null) {
                synchronized (crva.class) {
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
        dsrj<cruz> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
