package defpackage;
/* compiled from: PG */
/* renamed from: chus  reason: default package */
/* loaded from: classes4.dex */
public final class chus extends dsqw<chus, chup> implements dssk {
    public static final chus e;
    private static volatile dssr<chus> f;
    public int a;
    public dsrj<chur> b = dssu.b;
    public String c = "";
    public int d;

    static {
        chus chusVar = new chus();
        e = chusVar;
        dsqw.cc(chus.class, chusVar);
    }

    private chus() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003င\u0001", new Object[]{"a", "b", chur.class, "c", "d"});
            }
            if (i2 == 3) {
                return new chus();
            }
            if (i2 == 4) {
                return new chup();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chus> dssrVar = f;
            if (dssrVar == null) {
                synchronized (chus.class) {
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
