package defpackage;
/* compiled from: PG */
/* renamed from: bziz  reason: default package */
/* loaded from: classes4.dex */
public final class bziz extends dsqw<bziz, bziq> implements dssk {
    public static final bziz d;
    private static volatile dssr<bziz> e;
    public int a;
    public dsrj<bziy> b = dssu.b;
    public long c;

    static {
        bziz bzizVar = new bziz();
        d = bzizVar;
        dsqw.cc(bziz.class, bzizVar);
    }

    private bziz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new Object[]{"a", "b", bziy.class, "c"});
            }
            if (i2 == 3) {
                return new bziz();
            }
            if (i2 == 4) {
                return new bziq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bziz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bziz.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<bziy> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
