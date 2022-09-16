package defpackage;
/* compiled from: PG */
/* renamed from: dknf  reason: default package */
/* loaded from: classes6.dex */
public final class dknf extends dsqw<dknf, dkne> implements dssk {
    public static final dknf h;
    private static volatile dssr<dknf> j;
    public boolean a;
    public boolean b;
    public float c;
    public float d;
    public boolean e;
    public dsrj<String> f = dssu.b;
    public boolean g;
    private int i;

    static {
        dknf dknfVar = new dknf();
        h = dknfVar;
        dsqw.cc(dknf.class, dknfVar);
    }

    private dknf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဇ\u0004\u0006\u001a\u0007ဇ\u0005", new Object[]{"i", "a", "b", "c", "d", "e", "f", "g"});
            }
            if (i2 == 3) {
                return new dknf();
            }
            if (i2 == 4) {
                return new dkne();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dknf> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dknf.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
