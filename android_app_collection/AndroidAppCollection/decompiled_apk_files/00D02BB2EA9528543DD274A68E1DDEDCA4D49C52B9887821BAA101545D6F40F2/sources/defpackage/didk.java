package defpackage;
/* compiled from: PG */
/* renamed from: didk  reason: default package */
/* loaded from: classes6.dex */
public final class didk extends dsqw<didk, didj> implements dssk {
    public static final didk l;
    private static volatile dssr<didk> m;
    public int a;
    public long e;
    public boolean f;
    public dpum g;
    public int i;
    public boolean k;
    public String b = "";
    public String c = "";
    public String d = "";
    public String h = "";
    public String j = "";

    static {
        didk didkVar = new didk();
        l = didkVar;
        dsqw.cc(didk.class, didkVar);
    }

    private didk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004စ\u0003\u0005ဉ\u0005\u0007ဌ\b\bဇ\u0004\tဈ\t\nဇ\n\u000bဈ\u0006", new Object[]{"a", "b", "c", "d", "e", "g", "i", dqvj.d(), "f", "j", "k", "h"});
            }
            if (i2 == 3) {
                return new didk();
            }
            if (i2 == 4) {
                return new didj();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<didk> dssrVar = m;
            if (dssrVar == null) {
                synchronized (didk.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
