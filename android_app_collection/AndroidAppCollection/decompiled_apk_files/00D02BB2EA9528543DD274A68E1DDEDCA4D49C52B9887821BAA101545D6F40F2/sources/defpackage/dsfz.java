package defpackage;
/* compiled from: PG */
/* renamed from: dsfz  reason: default package */
/* loaded from: classes6.dex */
public final class dsfz extends dsqw<dsfz, dsfy> implements dssk {
    public static final dsfz h;
    private static volatile dssr<dsfz> j;
    public dsgb a;
    public dsfm b;
    public dsfo c;
    public dsft d;
    public dsfx e;
    public dsfv f;
    public dsfe g;
    private int i;

    static {
        dsfz dsfzVar = new dsfz();
        h = dsfzVar;
        dsqw.cc(dsfz.class, dsfzVar);
    }

    private dsfz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"i", "a", "b", "c", "d", "e", "f", "g"});
            }
            if (i2 == 3) {
                return new dsfz();
            }
            if (i2 == 4) {
                return new dsfy();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsfz> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dsfz.class) {
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
