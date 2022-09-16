package defpackage;
/* compiled from: PG */
/* renamed from: dsbi  reason: default package */
/* loaded from: classes6.dex */
public final class dsbi extends dsqw<dsbi, dsbf> implements dssk {
    public static final dsbi j;
    private static volatile dssr<dsbi> k;
    public int a;
    public Object c;
    public Object e;
    public dsef h;
    public dsok i;
    public int b = 0;
    public int d = 0;
    public String f = "";
    public String g = "";

    static {
        dsbi dsbiVar = new dsbi();
        j = dsbiVar;
        dsqw.cc(dsbi.class, dsbiVar);
    }

    private dsbi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\t\u0002\u0001\u0002\n\t\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ျ\u0000\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဿ\u0000\bျ\u0001\tြ\u0001\nြ\u0001", new Object[]{"c", "b", "e", "d", "a", "f", "g", "h", "i", dsbg.a, drxx.class, dspt.class});
            }
            if (i2 == 3) {
                return new dsbi();
            }
            if (i2 == 4) {
                return new dsbf();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsbi> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dsbi.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
