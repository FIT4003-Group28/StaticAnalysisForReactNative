package defpackage;
/* compiled from: PG */
/* renamed from: drlp  reason: default package */
/* loaded from: classes.dex */
public final class drlp extends dsqw<drlp, drlk> implements dssk {
    public static final drlp b;
    private static volatile dssr<drlp> c;
    public dsrj<drlo> a = dssu.b;

    static {
        drlp drlpVar = new drlp();
        b = drlpVar;
        dsqw.cc(drlp.class, drlpVar);
    }

    private drlp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", drlo.class});
            }
            if (i2 == 3) {
                return new drlp();
            }
            if (i2 == 4) {
                return new drlk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drlp> dssrVar = c;
            if (dssrVar == null) {
                synchronized (drlp.class) {
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
