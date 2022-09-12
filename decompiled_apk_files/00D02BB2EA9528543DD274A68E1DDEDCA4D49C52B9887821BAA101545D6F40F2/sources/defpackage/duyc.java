package defpackage;
/* compiled from: PG */
/* renamed from: duyc  reason: default package */
/* loaded from: classes6.dex */
public final class duyc extends dsqw<duyc, duyb> implements dssk {
    public static final duyc h;
    private static volatile dssr<duyc> j;
    public int a;
    public boolean c;
    public boolean d;
    public dnwb e;
    public dnqh f;
    public dhvq g;
    private byte i = 2;
    public dsrj<dnrw> b = dssu.b;

    static {
        duyc duycVar = new duyc();
        h = duycVar;
        dsqw.cc(duyc.class, duycVar);
    }

    private duyc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\u001b\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဉ\u0002\u0005ᐉ\u0003\u0006ဉ\u0004", new Object[]{"a", "b", dnrw.class, "c", "d", "e", "f", "g"});
            }
            if (i2 == 3) {
                return new duyc();
            }
            if (i2 == 4) {
                return new duyb();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<duyc> dssrVar = j;
            if (dssrVar == null) {
                synchronized (duyc.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
