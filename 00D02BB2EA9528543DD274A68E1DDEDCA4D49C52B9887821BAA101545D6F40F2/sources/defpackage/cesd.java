package defpackage;
/* compiled from: PG */
/* renamed from: cesd  reason: default package */
/* loaded from: classes4.dex */
public final class cesd extends dsqw<cesd, cesa> implements dssk {
    public static final cesd g;
    private static volatile dssr<cesd> i;
    public int a;
    public drdu d;
    public drfs e;
    public int f;
    private byte h = 2;
    public dsrj<drdy> b = dssu.b;
    public dsrj<djda> c = dssu.b;

    static {
        cesd cesdVar = new cesd();
        g = cesdVar;
        dsqw.cc(cesd.class, cesdVar);
    }

    private cesd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0001\u0001Л\u0002\u001b\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဌ\u0002", new Object[]{"a", "b", drdy.class, "c", djda.class, "d", "e", "f", cesb.a});
            }
            if (i3 == 3) {
                return new cesd();
            }
            if (i3 == 4) {
                return new cesa();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<cesd> dssrVar = i;
            if (dssrVar == null) {
                synchronized (cesd.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
