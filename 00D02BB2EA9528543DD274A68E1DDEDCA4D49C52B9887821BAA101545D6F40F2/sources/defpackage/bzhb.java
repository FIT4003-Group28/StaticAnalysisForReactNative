package defpackage;
/* compiled from: PG */
/* renamed from: bzhb  reason: default package */
/* loaded from: classes4.dex */
public final class bzhb extends dsqw<bzhb, bzha> implements dssk {
    public static final bzhb c;
    private static volatile dssr<bzhb> d;
    public int a;
    public int b;

    static {
        bzhb bzhbVar = new bzhb();
        c = bzhbVar;
        dsqw.cc(bzhb.class, bzhbVar);
    }

    private bzhb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new bzhb();
            }
            if (i2 == 4) {
                return new bzha();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzhb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (bzhb.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
