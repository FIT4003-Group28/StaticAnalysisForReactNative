package defpackage;
/* compiled from: PG */
/* renamed from: duag  reason: default package */
/* loaded from: classes.dex */
public final class duag extends dsqw<duag, duaf> implements dssk {
    public static final duag b;
    private static volatile dssr<duag> c;
    public dsrj<duan> a = dssu.b;

    static {
        duag duagVar = new duag();
        b = duagVar;
        dsqw.cc(duag.class, duagVar);
    }

    private duag() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", duan.class});
            }
            if (i2 == 3) {
                return new duag();
            }
            if (i2 == 4) {
                return new duaf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duag> dssrVar = c;
            if (dssrVar == null) {
                synchronized (duag.class) {
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
