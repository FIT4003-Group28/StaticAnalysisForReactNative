package defpackage;
/* compiled from: PG */
/* renamed from: dtas  reason: default package */
/* loaded from: classes6.dex */
public final class dtas extends dsqw<dtas, dtar> implements dssk {
    public static final dtas b;
    private static volatile dssr<dtas> c;
    public dsrj<dtaq> a = dssu.b;

    static {
        dtas dtasVar = new dtas();
        b = dtasVar;
        dsqw.cc(dtas.class, dtasVar);
    }

    private dtas() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dtaq.class});
            }
            if (i2 == 3) {
                return new dtas();
            }
            if (i2 == 4) {
                return new dtar();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtas> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtas.class) {
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
