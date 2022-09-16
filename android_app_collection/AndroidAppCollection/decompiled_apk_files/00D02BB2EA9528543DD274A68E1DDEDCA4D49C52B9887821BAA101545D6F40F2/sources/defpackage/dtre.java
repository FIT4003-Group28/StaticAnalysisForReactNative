package defpackage;
/* compiled from: PG */
/* renamed from: dtre  reason: default package */
/* loaded from: classes6.dex */
public final class dtre extends dsqw<dtre, dtrb> implements dssk {
    public static final dtre h;
    private static volatile dssr<dtre> i;
    public int a;
    public dtjp b;
    public int c;
    public int d = 2;
    public dsrf e;
    public dtiq f;
    public dthf g;

    static {
        dtre dtreVar = new dtre();
        h = dtreVar;
        dsqw.cc(dtre.class, dtreVar);
    }

    private dtre() {
        dsqz dsqzVar = dsqz.b;
        this.e = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0002\u0011\u0006\u0000\u0001\u0000\u0002ဉ\u0001\b\u001e\nဉ\u000e\u000bဉ\u000f\u000fဌ\b\u0011ဆ\u0003", new Object[]{"a", "b", "e", dtrd.c(), "f", "g", "d", dowa.c(), "c"});
            }
            if (i3 == 3) {
                return new dtre();
            }
            if (i3 == 4) {
                return new dtrb();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dtre> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dtre.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
