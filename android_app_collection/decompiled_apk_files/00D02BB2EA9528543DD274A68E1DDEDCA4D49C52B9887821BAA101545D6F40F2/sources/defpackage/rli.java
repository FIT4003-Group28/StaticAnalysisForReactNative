package defpackage;
/* compiled from: PG */
/* renamed from: rli  reason: default package */
/* loaded from: classes7.dex */
public final class rli extends dsqw<rli, rle> implements dssk {
    public static final rli b;
    private static volatile dssr<rli> c;
    public dssd<String, rlg> a = dssd.b;

    static {
        rli rliVar = new rli();
        b = rliVar;
        dsqw.cc(rli.class, rliVar);
    }

    private rli() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", rlh.a});
            }
            if (i2 == 3) {
                return new rli();
            }
            if (i2 == 4) {
                return new rle();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<rli> dssrVar = c;
            if (dssrVar == null) {
                synchronized (rli.class) {
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

    public final dssd<String, rlg> b() {
        dssd<String, rlg> dssdVar = this.a;
        if (!dssdVar.a) {
            this.a = dssdVar.a();
        }
        return this.a;
    }
}
