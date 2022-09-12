package defpackage;
/* compiled from: PG */
/* renamed from: aimx  reason: default package */
/* loaded from: classes2.dex */
public final class aimx extends dsqw<aimx, aimu> implements dssk {
    public static final aimx d;
    private static volatile dssr<aimx> e;
    public int a;
    public aimw b;
    public dsrj<aimw> c = dssu.b;

    static {
        aimx aimxVar = new aimx();
        d = aimxVar;
        dsqw.cc(aimx.class, aimxVar);
    }

    private aimx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0001\u0000\u0004ဉ\u0000\u0005\u001b", new Object[]{"a", "b", "c", aimw.class});
            }
            if (i2 == 3) {
                return new aimx();
            }
            if (i2 == 4) {
                return new aimu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aimx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (aimx.class) {
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
        dsrj<aimw> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }
}
