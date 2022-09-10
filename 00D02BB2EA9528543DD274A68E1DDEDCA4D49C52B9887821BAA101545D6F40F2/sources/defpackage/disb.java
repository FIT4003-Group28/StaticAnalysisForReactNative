package defpackage;
/* compiled from: PG */
/* renamed from: disb  reason: default package */
/* loaded from: classes6.dex */
public final class disb extends dsqw<disb, disa> implements dssk {
    public static final disb c;
    private static volatile dssr<disb> e;
    public int a;
    public dpie b;
    private byte d = 2;

    static {
        disb disbVar = new disb();
        c = disbVar;
        dsqw.cc(disb.class, disbVar);
    }

    private disb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new disb();
            }
            if (i2 == 4) {
                return new disa();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<disb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (disb.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
