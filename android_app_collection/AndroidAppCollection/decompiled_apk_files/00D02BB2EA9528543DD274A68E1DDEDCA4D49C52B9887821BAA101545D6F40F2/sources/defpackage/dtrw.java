package defpackage;
/* compiled from: PG */
/* renamed from: dtrw  reason: default package */
/* loaded from: classes6.dex */
public final class dtrw extends dsqs<dtrw, dtrv> implements dsqt {
    public static final dtrw a;
    public static final dsqv<dtrw, dtsc> b;
    public static final dsqv<dtrw, eavq> c;
    private static volatile dssr<dtrw> e;
    private byte d = 2;

    static {
        dtrw dtrwVar = new dtrw();
        a = dtrwVar;
        dsqw.cc(dtrw.class, dtrwVar);
        b = dsqw.newSingularGeneratedExtension(dtrwVar, dtsc.a, dtsc.a, null, 293792731, dsur.MESSAGE, dtsc.class);
        c = dsqw.newSingularGeneratedExtension(dtrwVar, eavq.b, eavq.b, null, 294660687, dsur.MESSAGE, eavq.class);
    }

    private dtrw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtrw();
            }
            if (i2 == 4) {
                return new dtrv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dtrw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtrw.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
