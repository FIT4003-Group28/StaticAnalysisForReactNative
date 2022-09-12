package defpackage;
/* compiled from: PG */
/* renamed from: dtrk  reason: default package */
/* loaded from: classes6.dex */
public final class dtrk extends dsqw<dtrk, dtrj> implements dssk {
    public static final dtrk f;
    private static volatile dssr<dtrk> h;
    public int a;
    public dgrh c;
    public dgrn d;
    public boolean e;
    private byte g = 2;
    public String b = "";

    static {
        dtrk dtrkVar = new dtrk();
        f = dtrkVar;
        dsqw.cc(dtrk.class, dtrkVar);
    }

    private dtrk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dtrk();
            }
            if (i2 == 4) {
                return new dtrj();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dtrk> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dtrk.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
