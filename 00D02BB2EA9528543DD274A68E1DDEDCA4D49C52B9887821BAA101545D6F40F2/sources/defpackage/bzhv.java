package defpackage;
/* compiled from: PG */
/* renamed from: bzhv  reason: default package */
/* loaded from: classes4.dex */
public final class bzhv extends dsqw<bzhv, bzhs> implements dssk {
    public static final bzhv b;
    private static volatile dssr<bzhv> c;
    public dsrj<bzhu> a;

    static {
        bzhv bzhvVar = new bzhv();
        b = bzhvVar;
        dsqw.cc(bzhv.class, bzhvVar);
    }

    private bzhv() {
        dssu<Object> dssuVar = dssu.b;
        this.a = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", bzhu.class});
            }
            if (i2 == 3) {
                return new bzhv();
            }
            if (i2 == 4) {
                return new bzhs();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzhv> dssrVar = c;
            if (dssrVar == null) {
                synchronized (bzhv.class) {
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
        dsrj<bzhu> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
