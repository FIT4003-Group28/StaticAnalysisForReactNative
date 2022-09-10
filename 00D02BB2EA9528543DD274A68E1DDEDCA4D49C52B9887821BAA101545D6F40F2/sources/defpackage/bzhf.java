package defpackage;
/* compiled from: PG */
/* renamed from: bzhf  reason: default package */
/* loaded from: classes4.dex */
public final class bzhf extends dsqw<bzhf, bzhc> implements dssk {
    public static final bzhf b;
    private static volatile dssr<bzhf> c;
    public dsrj<bzhe> a = dssu.b;

    static {
        bzhf bzhfVar = new bzhf();
        b = bzhfVar;
        dsqw.cc(bzhf.class, bzhfVar);
    }

    private bzhf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzhe.class});
            }
            if (i2 == 3) {
                return new bzhf();
            }
            if (i2 == 4) {
                return new bzhc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzhf> dssrVar = c;
            if (dssrVar == null) {
                synchronized (bzhf.class) {
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
        dsrj<bzhe> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
