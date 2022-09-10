package defpackage;
/* compiled from: PG */
/* renamed from: ddsz  reason: default package */
/* loaded from: classes6.dex */
public final class ddsz extends dsqw<ddsz, ddsy> implements dssk {
    public static final ddsz g;
    private static volatile dssr<ddsz> i;
    public int a;
    public long d;
    public ddet f;
    private byte h = 2;
    public String b = "";
    public dsrj<ddsw> c = dssu.b;
    public int e = -1;

    static {
        ddsz ddszVar = new ddsz();
        g = ddszVar;
        dsqw.cc(ddsz.class, ddszVar);
    }

    private ddsz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ဂ\u0001\u0004င\u0002\u0005ᐉ\u0003", new Object[]{"a", "b", "c", ddsw.class, "d", "e", "f"});
            }
            if (i3 == 3) {
                return new ddsz();
            }
            if (i3 == 4) {
                return new ddsy();
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
            dssr<ddsz> dssrVar = i;
            if (dssrVar == null) {
                synchronized (ddsz.class) {
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
