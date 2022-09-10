package defpackage;
/* compiled from: PG */
/* renamed from: dxki  reason: default package */
/* loaded from: classes6.dex */
public final class dxki extends dsqw<dxki, dxkh> implements dssk {
    public static final dxki b;
    private static volatile dssr<dxki> c;
    public dsrf a = dsqz.b;

    static {
        dxki dxkiVar = new dxki();
        b = dxkiVar;
        dsqw.cc(dxki.class, dxkiVar);
    }

    private dxki() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxki();
            }
            if (i2 == 4) {
                return new dxkh();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxki> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxki.class) {
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
