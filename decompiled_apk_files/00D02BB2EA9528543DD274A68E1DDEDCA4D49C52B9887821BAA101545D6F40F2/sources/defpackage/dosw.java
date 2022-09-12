package defpackage;
/* compiled from: PG */
/* renamed from: dosw  reason: default package */
/* loaded from: classes6.dex */
public final class dosw extends dsqw<dosw, dosv> implements dosx {
    public static final dosw f;
    private static volatile dssr<dosw> g;
    public int a;
    public dsrj<String> b = dssu.b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        dosw doswVar = new dosw();
        f = doswVar;
        dsqw.cc(dosw.class, doswVar);
    }

    private dosw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dosw();
            }
            if (i2 == 4) {
                return new dosv();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dosw> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dosw.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
