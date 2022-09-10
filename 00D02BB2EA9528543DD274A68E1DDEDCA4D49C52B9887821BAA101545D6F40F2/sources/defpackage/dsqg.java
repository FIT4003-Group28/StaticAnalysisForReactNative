package defpackage;
/* compiled from: PG */
/* renamed from: dsqg  reason: default package */
/* loaded from: classes6.dex */
public final class dsqg extends dsqw<dsqg, dsqf> implements dssk {
    public static final dsqg b;
    private static volatile dssr<dsqg> c;
    public dsrj<String> a = dssu.b;

    static {
        dsqg dsqgVar = new dsqg();
        b = dsqgVar;
        dsqw.cc(dsqg.class, dsqgVar);
    }

    private dsqg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dsqg();
            }
            if (i2 == 4) {
                return new dsqf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsqg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dsqg.class) {
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
        dsrj<String> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
