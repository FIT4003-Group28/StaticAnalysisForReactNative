package defpackage;
/* compiled from: PG */
/* renamed from: vvl  reason: default package */
/* loaded from: classes7.dex */
public final class vvl extends dsqw<vvl, vvg> implements dssk {
    public static final vvl b;
    private static volatile dssr<vvl> c;
    public dssd<String, vvi> a = dssd.b;

    static {
        vvl vvlVar = new vvl();
        b = vvlVar;
        dsqw.cc(vvl.class, vvlVar);
    }

    private vvl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", vvk.a});
            }
            if (i2 == 3) {
                return new vvl();
            }
            if (i2 == 4) {
                return new vvg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<vvl> dssrVar = c;
            if (dssrVar == null) {
                synchronized (vvl.class) {
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

    public final dssd<String, vvi> b() {
        dssd<String, vvi> dssdVar = this.a;
        if (!dssdVar.a) {
            this.a = dssdVar.a();
        }
        return this.a;
    }
}
