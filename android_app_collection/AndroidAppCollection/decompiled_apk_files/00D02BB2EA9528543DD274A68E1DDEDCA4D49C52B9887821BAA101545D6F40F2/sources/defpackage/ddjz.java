package defpackage;
/* compiled from: PG */
/* renamed from: ddjz  reason: default package */
/* loaded from: classes5.dex */
public final class ddjz extends dsqw<ddjz, ddjy> implements dssk {
    public static final ddjz e;
    private static volatile dssr<ddjz> f;
    public int a;
    public boolean b;
    public dsrj<String> c = dssu.b;
    public String d = "";

    static {
        ddjz ddjzVar = new ddjz();
        e = ddjzVar;
        dsqw.cc(ddjz.class, ddjzVar);
    }

    private ddjz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a\u0003ဈ\u0001", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ddjz();
            }
            if (i2 == 4) {
                return new ddjy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddjz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddjz.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
