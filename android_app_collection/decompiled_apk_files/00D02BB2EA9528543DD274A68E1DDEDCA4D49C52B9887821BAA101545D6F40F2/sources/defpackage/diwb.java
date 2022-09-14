package defpackage;
/* compiled from: PG */
/* renamed from: diwb  reason: default package */
/* loaded from: classes6.dex */
public final class diwb extends dsqs<diwb, diug> implements dsqt {
    public static final diwb U;
    private static volatile dssr<diwb> X;
    public divo A;
    public boolean C;
    public drlp D;
    public dhxw E;
    public djsp H;
    public dijn I;
    public dhxz J;
    public divc L;
    public dqja M;
    public diuk O;
    public dpte P;
    public diwa Q;
    public divg R;
    public divw S;
    public dqth T;
    public int a;
    public int b;
    public int d;
    public ditt e;
    public dmni f;
    public dmxh g;
    public diuf j;
    public dium k;
    public int n;
    public dnpq p;
    public dgfy q;
    public dhti s;
    public diwl t;
    public diuw u;
    public dive v;
    public divk w;
    public dpjx y;
    public divm z;
    private byte W = 2;
    public String c = "";
    public dsrj<divq> h = dssu.b;
    public String i = "";
    public String l = "";
    public dsrj<dpzw> m = dssu.b;
    public String o = "";
    public dsrj<diud> r = dssu.b;
    public dsrj<divy> x = dssu.b;
    public boolean B = true;
    public dsrj<diub> F = dssu.b;
    public dsrj<diub> G = dssu.b;
    public String K = "";
    public String N = "";

    static {
        diwb diwbVar = new diwb();
        U = diwbVar;
        dsqw.cc(diwb.class, diwbVar);
    }

    private diwb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(U, "\u0001,\u0000\u0002\u0001D,\u0000\u0006\u0004\u0001ဈ\u0000\u0002ဉ\u0002\u0003ဈ\u0006\u0004ဈ\t\u0005ဉ\u000e\u0006ဉ\u0018\u0007ဉ\u0019\b\u001b\u000fЛ\u0014ဉ!\u0017ဉ$\u0019ဉ\u0017\u001aဉ\u001b\u001dဉ%\u001eဉ\u001d \u001b!ဉ&\"ဈ'#ဉ\u0015$ဈ+%ဉ*&ဉ\u0007'ဇ\u001e(ဉ\u001c)ဌ\u0001*ဉ\u001a+ဆ\f,ဈ\r/ဉ 0ဇ\u001f1ဉ,3ဉ-4ᐉ\u00035ᐉ\u00047ဉ.9\u001b:ဉ);\u001b<Л=ဉ/?ဉ\bBဉ0Cဉ\u000fDဉ1", new Object[]{"a", "b", "c", "e", "i", "l", "p", "u", "v", "x", divy.class, "F", diub.class, "E", "H", "t", "y", "I", "A", "r", diud.class, "J", "K", "s", "N", "M", "j", "B", "z", "d", dpuk.c(), "w", "n", "o", "D", "C", "O", "P", "f", "g", "Q", "h", divq.class, "L", "m", dpzw.class, "G", diub.class, "R", "k", "S", "q", "T"});
            }
            if (i2 == 3) {
                return new diwb();
            }
            if (i2 == 4) {
                return new diug();
            }
            if (i2 == 5) {
                return U;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.W = b;
                return null;
            }
            dssr<diwb> dssrVar = X;
            if (dssrVar == null) {
                synchronized (diwb.class) {
                    dssrVar = X;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(U);
                        X = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.W);
    }
}
