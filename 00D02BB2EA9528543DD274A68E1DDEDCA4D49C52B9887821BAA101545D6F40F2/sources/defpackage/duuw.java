package defpackage;
/* compiled from: PG */
/* renamed from: duuw  reason: default package */
/* loaded from: classes.dex */
public final class duuw extends dsqw<duuw, duuv> implements dssk {
    public static final duuw c;
    private static volatile dssr<duuw> e;
    public int a;
    public String b = "";
    private int d;

    static {
        duuw duuwVar = new duuw();
        c = duuwVar;
        dsqw.cc(duuw.class, duuwVar);
    }

    private duuw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", dgge.c(), "b"});
            }
            if (i2 == 3) {
                return new duuw();
            }
            if (i2 == 4) {
                return new duuv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duuw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duuw.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
