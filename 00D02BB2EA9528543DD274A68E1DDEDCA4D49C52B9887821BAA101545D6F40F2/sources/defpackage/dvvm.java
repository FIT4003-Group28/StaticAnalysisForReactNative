package defpackage;
/* compiled from: PG */
/* renamed from: dvvm  reason: default package */
/* loaded from: classes6.dex */
public final class dvvm extends dsqw<dvvm, dvvj> implements dssk {
    public static final dvvm g;
    private static volatile dssr<dvvm> i;
    public int a;
    public int b;
    public long c;
    public dniu e;
    public String f;
    private byte h = 2;
    public String d = "";

    static {
        dvvm dvvmVar = new dvvm();
        g = dvvmVar;
        dsqw.cc(dvvm.class, dvvmVar);
    }

    private dvvm() {
        dssu<Object> dssuVar = dssu.b;
        this.f = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဃ\u0001\u0003ဈ\u0002\u0006ဉ\u0004\bဈ\u0006", new Object[]{"a", "b", dvvl.c(), "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dvvm();
            }
            if (i3 == 4) {
                return new dvvj();
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
            dssr<dvvm> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dvvm.class) {
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
