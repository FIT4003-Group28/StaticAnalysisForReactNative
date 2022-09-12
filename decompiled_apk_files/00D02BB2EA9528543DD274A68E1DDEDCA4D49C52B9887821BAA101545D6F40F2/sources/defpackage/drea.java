package defpackage;
/* compiled from: PG */
/* renamed from: drea  reason: default package */
/* loaded from: classes6.dex */
public final class drea extends dsqw<drea, drdz> implements dssk {
    public static final drea f;
    private static volatile dssr<drea> g;
    public int a;
    public drec b;
    public int d;
    public String c = "";
    public String e = "";

    static {
        drea dreaVar = new drea();
        f = dreaVar;
        dsqw.cc(drea.class, dreaVar);
    }

    private drea() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new drea();
            }
            if (i2 == 4) {
                return new drdz();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drea> dssrVar = g;
            if (dssrVar == null) {
                synchronized (drea.class) {
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
