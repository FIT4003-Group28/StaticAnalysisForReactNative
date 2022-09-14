package defpackage;
/* compiled from: PG */
/* renamed from: duyy  reason: default package */
/* loaded from: classes6.dex */
public final class duyy extends dsqw<duyy, duyx> implements dssk {
    public static final duyy c;
    private static volatile dssr<duyy> d;
    public dsrj<duza> a = dssu.b;
    public dsrj<duyw> b = dssu.b;

    static {
        duyy duyyVar = new duyy();
        c = duyyVar;
        dsqw.cc(duyy.class, duyyVar);
    }

    private duyy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", duza.class, "b", duyw.class});
            }
            if (i2 == 3) {
                return new duyy();
            }
            if (i2 == 4) {
                return new duyx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duyy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (duyy.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
