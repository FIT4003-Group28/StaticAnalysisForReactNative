package defpackage;
/* compiled from: PG */
/* renamed from: dunk  reason: default package */
/* loaded from: classes.dex */
public final class dunk extends dsqw<dunk, dunj> implements dssk {
    public static final dunk m;
    private static volatile dssr<dunk> o;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "https://support.google.com/gmm/?p=questions_help";
    public String e = "https://www.google.com/local/hashtags/list";
    public String f = "https://myactivity.google.com/product/maps/embed?utm_source=gmm&utm_medium=er&utm_campaign=";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    private int n;

    static {
        dunk dunkVar = new dunk();
        m = dunkVar;
        dsqw.cc(dunk.class, dunkVar);
    }

    private dunk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\f\u0000\u0001\u0002\u001a\f\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\bဈ\u0007\u000fဈ\u000e\u0012ဈ\u0010\u0013ဈ\u0011\u0015ဈ\u0013\u0016ဈ\u0014\u0017ဈ\u0015\u0018ဈ\u0016\u0019ဈ\u0017\u001aဈ\u0018", new Object[]{"n", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            }
            if (i2 == 3) {
                return new dunk();
            }
            if (i2 == 4) {
                return new dunj();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dunk> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dunk.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
