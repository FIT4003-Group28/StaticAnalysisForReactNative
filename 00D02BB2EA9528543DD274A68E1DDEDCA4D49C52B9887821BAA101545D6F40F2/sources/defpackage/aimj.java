package defpackage;
/* compiled from: PG */
/* renamed from: aimj  reason: default package */
/* loaded from: classes2.dex */
public final class aimj extends dsqw<aimj, aimi> implements dssk {
    public static final aimj b;
    private static volatile dssr<aimj> c;
    public dsrj<aiml> a = dssu.b;

    static {
        aimj aimjVar = new aimj();
        b = aimjVar;
        dsqw.cc(aimj.class, aimjVar);
    }

    private aimj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", aiml.class});
            }
            if (i2 == 3) {
                return new aimj();
            }
            if (i2 == 4) {
                return new aimi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aimj> dssrVar = c;
            if (dssrVar == null) {
                synchronized (aimj.class) {
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
        dsrj<aiml> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
