package defpackage;
/* compiled from: PG */
/* renamed from: duxm  reason: default package */
/* loaded from: classes.dex */
public final class duxm extends dsqw<duxm, duxh> implements dssk {
    public static final duxm P;
    private static volatile dssr<duxm> S;
    public boolean A;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ddln K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    private int Q;
    private int R;
    public int a;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public float i;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean q;
    public boolean r;
    public boolean s;
    public duxj t;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public int b = 80;
    public int c = 20160;
    public int d = 10;
    public dsrf j = dsqz.b;
    public int k = 1;
    public dsrf p = dsqz.b;
    public int u = 10000;
    public int B = 60;

    static {
        duxm duxmVar = new duxm();
        P = duxmVar;
        dsqw.cc(duxm.class, duxmVar);
    }

    private duxm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(P, "\u0001(\u0000\u0003\u0001M(\u0000\u0002\u0000\u0001င\u0000\u0004င\u0002\u0005င\u0003\n\u0016\u000bဌ\u0010\fဇ\u0011\u000fဇ\u0012\u0010ဇ\u0013\u0011ဇ\b\u0012ဇ\t\u0013ဇ\n\u0014ဇ\u000b\u0015ဇ\u0014\u0019\u0016\u001bခ\u000f\u001cဇ\u0016\u001dဇ\u0017\u001eဇ\u0018\u001fဉ\u0019\"ဇ\u001e'ဇ&/ဇ00ဇ!1ဇ\"2ဇ#5င-6ဇ37ဇ48ဇ/:င5;ဇ6<ဇ7=င\u001a>ဇ8Dဉ>Fဇ@Gဇ\u001bIဇBLဇEMဇF", new Object[]{"a", "Q", "R", "b", "c", "d", "j", "k", duxk.a, "l", "m", "n", "e", "f", "g", "h", "o", "p", "i", "q", "r", "s", "t", "w", "A", "D", "x", "y", "z", "B", "E", "F", "C", "G", "H", "I", "u", "J", "K", "L", "v", "M", "N", "O"});
            }
            if (i2 == 3) {
                return new duxm();
            }
            if (i2 == 4) {
                return new duxh();
            }
            if (i2 == 5) {
                return P;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duxm> dssrVar = S;
            if (dssrVar == null) {
                synchronized (duxm.class) {
                    dssrVar = S;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(P);
                        S = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
