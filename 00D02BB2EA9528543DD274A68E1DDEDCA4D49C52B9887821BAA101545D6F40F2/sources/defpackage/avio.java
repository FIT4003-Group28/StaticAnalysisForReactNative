package defpackage;
/* compiled from: PG */
/* renamed from: avio  reason: default package */
/* loaded from: classes3.dex */
public final class avio extends dsqw<avio, avin> implements dssk {
    public static final avio d;
    private static volatile dssr<avio> e;
    public int a;
    public int b;
    public String c = "";

    static {
        avio avioVar = new avio();
        d = avioVar;
        dsqw.cc(avio.class, avioVar);
    }

    private avio() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", avip.a, "c"});
            }
            if (i2 == 3) {
                return new avio();
            }
            if (i2 == 4) {
                return new avin();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<avio> dssrVar = e;
            if (dssrVar == null) {
                synchronized (avio.class) {
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
