package defpackage;
/* compiled from: PG */
/* renamed from: dusu  reason: default package */
/* loaded from: classes6.dex */
public final class dusu extends dsqw<dusu, dust> implements dssk {
    public static final dusu d;
    private static volatile dssr<dusu> e;
    public int a;
    public dsrj<String> b = dssu.b;
    public String c = "";

    static {
        dusu dusuVar = new dusu();
        d = dusuVar;
        dsqw.cc(dusu.class, dusuVar);
    }

    private dusu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dusu();
            }
            if (i2 == 4) {
                return new dust();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dusu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dusu.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
