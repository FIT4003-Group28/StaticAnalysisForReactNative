package defpackage;
/* compiled from: PG */
/* renamed from: cbto  reason: default package */
/* loaded from: classes4.dex */
public final class cbto extends dsqw<cbto, cbtj> implements dssk {
    public static final cbto b;
    private static volatile dssr<cbto> c;
    public dsrj<cbtn> a = dssu.b;

    static {
        cbto cbtoVar = new cbto();
        b = cbtoVar;
        dsqw.cc(cbto.class, cbtoVar);
    }

    private cbto() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cbtn.class});
            }
            if (i2 == 3) {
                return new cbto();
            }
            if (i2 == 4) {
                return new cbtj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cbto> dssrVar = c;
            if (dssrVar == null) {
                synchronized (cbto.class) {
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
}
