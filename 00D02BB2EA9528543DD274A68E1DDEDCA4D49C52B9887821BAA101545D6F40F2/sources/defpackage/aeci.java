package defpackage;
/* compiled from: PG */
/* renamed from: aeci  reason: default package */
/* loaded from: classes2.dex */
public final class aeci extends dsqw<aeci, aech> implements dssk {
    public static final aeci b;
    private static volatile dssr<aeci> c;
    public dsrj<aecg> a = dssu.b;

    static {
        aeci aeciVar = new aeci();
        b = aeciVar;
        dsqw.cc(aeci.class, aeciVar);
    }

    private aeci() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", aecg.class});
            }
            if (i2 == 3) {
                return new aeci();
            }
            if (i2 == 4) {
                return new aech();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aeci> dssrVar = c;
            if (dssrVar == null) {
                synchronized (aeci.class) {
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
        dsrj<aecg> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
