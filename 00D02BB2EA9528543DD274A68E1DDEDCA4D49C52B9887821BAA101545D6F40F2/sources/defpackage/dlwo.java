package defpackage;
/* compiled from: PG */
/* renamed from: dlwo  reason: default package */
/* loaded from: classes.dex */
public final class dlwo extends dsqw<dlwo, dlwn> implements dssk {
    public static final dlwo k;
    private static volatile dssr<dlwo> l;
    public int a;
    public dlws b;
    public dlwi c;
    public dlxq d;
    public dlwc e;
    public dlxa f;
    public dsrj<dlww> g = dssu.b;
    public dsrj<dlxs> h = dssu.b;
    public dsrj<dlvu> i = dssu.b;
    public dsrj<dlxi> j = dssu.b;

    static {
        dlwo dlwoVar = new dlwo();
        k = dlwoVar;
        dsqw.cc(dlwo.class, dlwoVar);
    }

    private dlwo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0004\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007\u001b\b\u001b\n\u001b\r\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", dlww.class, "h", dlxs.class, "i", dlvu.class, "j", dlxi.class});
            }
            if (i2 == 3) {
                return new dlwo();
            }
            if (i2 == 4) {
                return new dlwn();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlwo> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dlwo.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
