package defpackage;
/* compiled from: PG */
/* renamed from: dwej  reason: default package */
/* loaded from: classes.dex */
public final class dwej extends dsqw<dwej, dwei> implements dssk {
    public static final dwej b;
    private static volatile dssr<dwej> c;
    public dsrj<dweh> a = dssu.b;

    static {
        dwej dwejVar = new dwej();
        b = dwejVar;
        dsqw.cc(dwej.class, dwejVar);
    }

    private dwej() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dweh.class});
            }
            if (i2 == 3) {
                return new dwej();
            }
            if (i2 == 4) {
                return new dwei();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwej> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dwej.class) {
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
        dsrj<dweh> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
