package defpackage;
/* compiled from: PG */
/* renamed from: ajja  reason: default package */
/* loaded from: classes2.dex */
public final class ajja extends dsqw<ajja, ajix> implements dssk {
    public static final ajja d;
    private static volatile dssr<ajja> e;
    public int a;
    public String b = "";
    public int c;

    static {
        ajja ajjaVar = new ajja();
        d = ajjaVar;
        dsqw.cc(ajja.class, ajjaVar);
    }

    private ajja() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", ajiy.a});
            }
            if (i2 == 3) {
                return new ajja();
            }
            if (i2 == 4) {
                return new ajix();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ajja> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ajja.class) {
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
