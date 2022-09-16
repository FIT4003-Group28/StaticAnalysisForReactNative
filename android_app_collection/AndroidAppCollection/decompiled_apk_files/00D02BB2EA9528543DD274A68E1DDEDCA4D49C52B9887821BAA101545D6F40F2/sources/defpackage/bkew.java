package defpackage;
/* compiled from: PG */
/* renamed from: bkew  reason: default package */
/* loaded from: classes3.dex */
public final class bkew extends dsqw<bkew, bkes> implements dssk {
    public static final bkew b;
    private static volatile dssr<bkew> c;
    public dssd<String, bkeu> a = dssd.b;

    static {
        bkew bkewVar = new bkew();
        b = bkewVar;
        dsqw.cc(bkew.class, bkewVar);
    }

    private bkew() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", bkev.a});
            }
            if (i2 == 3) {
                return new bkew();
            }
            if (i2 == 4) {
                return new bkes();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bkew> dssrVar = c;
            if (dssrVar == null) {
                synchronized (bkew.class) {
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

    public final dssd<String, bkeu> b() {
        dssd<String, bkeu> dssdVar = this.a;
        if (!dssdVar.a) {
            this.a = dssdVar.a();
        }
        return this.a;
    }
}
