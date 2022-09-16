package defpackage;
/* compiled from: PG */
/* renamed from: dovh  reason: default package */
/* loaded from: classes6.dex */
public final class dovh extends dsqw<dovh, dovc> implements dssk {
    public static final dovh g;
    private static volatile dssr<dovh> i;
    public int a;
    public dove b;
    public boolean c;
    public dgas d;
    public douj f;
    private byte h = 2;
    public dsrj<dovg> e = dssu.b;

    static {
        dovh dovhVar = new dovh();
        g = dovhVar;
        dsqw.cc(dovh.class, dovhVar);
    }

    private dovh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ᐉ\u0003", new Object[]{"a", "b", "c", "d", "e", dovg.class, "f"});
            }
            if (i3 == 3) {
                return new dovh();
            }
            if (i3 == 4) {
                return new dovc();
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
            dssr<dovh> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dovh.class) {
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
