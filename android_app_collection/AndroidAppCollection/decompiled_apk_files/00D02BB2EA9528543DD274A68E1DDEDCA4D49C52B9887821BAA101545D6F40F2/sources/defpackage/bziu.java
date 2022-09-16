package defpackage;
/* compiled from: PG */
/* renamed from: bziu  reason: default package */
/* loaded from: classes4.dex */
public final class bziu extends dsqw<bziu, bzit> implements dssk {
    public static final bziu c;
    private static volatile dssr<bziu> d;
    public int a;
    public String b = "";

    static {
        bziu bziuVar = new bziu();
        c = bziuVar;
        dsqw.cc(bziu.class, bziuVar);
    }

    private bziu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new bziu();
            }
            if (i2 == 4) {
                return new bzit();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bziu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (bziu.class) {
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
