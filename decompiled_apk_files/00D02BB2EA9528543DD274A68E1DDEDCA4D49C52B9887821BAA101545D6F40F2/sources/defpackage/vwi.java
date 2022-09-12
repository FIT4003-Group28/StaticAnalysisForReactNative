package defpackage;
/* compiled from: PG */
/* renamed from: vwi  reason: default package */
/* loaded from: classes7.dex */
public final class vwi extends dsqw<vwi, vvz> implements dssk {
    public static final vwi b;
    private static volatile dssr<vwi> c;
    public dsrj<vwh> a = dssu.b;

    static {
        vwi vwiVar = new vwi();
        b = vwiVar;
        dsqw.cc(vwi.class, vwiVar);
    }

    private vwi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", vwh.class});
            }
            if (i2 == 3) {
                return new vwi();
            }
            if (i2 == 4) {
                return new vvz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<vwi> dssrVar = c;
            if (dssrVar == null) {
                synchronized (vwi.class) {
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
        dsrj<vwh> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
