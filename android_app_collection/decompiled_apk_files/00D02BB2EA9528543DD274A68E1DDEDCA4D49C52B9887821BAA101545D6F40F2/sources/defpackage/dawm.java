package defpackage;
/* compiled from: PG */
/* renamed from: dawm  reason: default package */
/* loaded from: classes5.dex */
public final class dawm extends dsqw<dawm, dawj> implements dssk {
    public static final dawm g;
    private static volatile dssr<dawm> i;
    public int a;
    public daww c;
    public int d;
    public long e;
    public boolean f;
    private byte h = 2;
    public String b = "";

    static {
        dawm dawmVar = new dawm();
        g = dawmVar;
        dsqw.cc(dawm.class, dawmVar);
    }

    private dawm() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u000b\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0004ᐉ\u0002\u0005ဌ\u0003\tဃ\u0007\u000bဇ\t", new Object[]{"a", "b", "c", "d", dawk.a, "e", "f"});
            }
            if (i3 == 3) {
                return new dawm();
            }
            if (i3 == 4) {
                return new dawj();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dawm> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dawm.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
