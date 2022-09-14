package defpackage;
/* compiled from: PG */
/* renamed from: drbj  reason: default package */
/* loaded from: classes.dex */
public final class drbj extends dsqw<drbj, drbi> implements dssk {
    public static final drbj Z;
    private static volatile dssr<drbj> aa;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        drbj drbjVar = new drbj();
        Z = drbjVar;
        dsqw.cc(drbj.class, drbjVar);
    }

    private drbj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(Z, "\u00011\u0000\u0002\u0001A1\u0000\u0000\u0000\u0001ဇ\b\u0002ဇ\t\u0003ဇ\u000b\u0005ဇ\u000f\u0006ဇ\u0011\u0007ဇ\"\tဇ-\nဇ.\u000bဇ0\fဇ\u001e\rဇ\u0005\u000eဇ/\u000fဇ\u0019\u0010ဇ\u0014\u0013ဇ&\u0014ဇ!\u0017ဇ6\u0018ဇ7\u0019ဇ8\u001aဇ\u0006\u001bဇ\u001f\u001cဇ\u0002\u001dဇ2\u001fဇ\u001a ဇ\u001b!ဇ\u001c\"ဇ\u001d#ဇ\u0004$ဇ %ဇ\u0018'ဇ#(ဇ\u0013)ဇ%*ဇ1+ဇ\u0001-ဇ$0ဇ\u00071ဇ\u00122ဇ\n3ဇ'6ဇ+7ဇ\f9ဇ\u0015:ဇ4;ဇ\u0010=ဇ)?ဇ5@ဇ\u0000Aဇ\u0003", new Object[]{"a", "b", "k", "l", "n", "p", "r", "G", "O", "P", "R", "C", "h", "Q", "x", "u", "K", "F", "W", "X", "Y", "i", "D", "e", "T", "y", "z", "A", "B", "g", "E", "w", "H", "t", "J", "S", "d", "I", "j", "s", "m", "L", "N", "o", "v", "U", "q", "M", "V", "c", "f"});
            }
            if (i2 == 3) {
                return new drbj();
            }
            if (i2 == 4) {
                return new drbi();
            }
            if (i2 == 5) {
                return Z;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drbj> dssrVar = aa;
            if (dssrVar == null) {
                synchronized (drbj.class) {
                    dssrVar = aa;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(Z);
                        aa = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
