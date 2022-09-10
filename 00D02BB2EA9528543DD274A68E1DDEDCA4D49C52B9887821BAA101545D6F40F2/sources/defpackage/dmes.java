package defpackage;
/* compiled from: PG */
/* renamed from: dmes  reason: default package */
/* loaded from: classes6.dex */
public final class dmes extends dsqw<dmes, dmer> implements dssk {
    public static final dmes a;
    public static final dsqv<dmfs, dmes> b;
    private static volatile dssr<dmes> c;

    static {
        dmes dmesVar = new dmes();
        a = dmesVar;
        dsqw.cc(dmes.class, dmesVar);
        b = dsqw.newSingularGeneratedExtension(dmfs.c, dmesVar, dmesVar, null, 1022, dsur.MESSAGE, dmes.class);
    }

    private dmes() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmes();
            }
            if (i2 == 4) {
                return new dmer();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmes> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmes.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
