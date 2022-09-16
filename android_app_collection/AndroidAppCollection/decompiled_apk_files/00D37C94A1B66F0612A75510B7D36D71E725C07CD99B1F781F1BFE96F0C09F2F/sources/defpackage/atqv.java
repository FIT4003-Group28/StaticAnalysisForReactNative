package defpackage;
/* compiled from: PG */
/* renamed from: atqv  reason: default package */
/* loaded from: classes2.dex */
public final class atqv extends aopi implements aoqv {

    /* renamed from: J  reason: collision with root package name */
    private static volatile aorb f113J;
    public static final atqv a;
    public boolean A;
    public long B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public long G;
    public boolean H;
    public boolean I;
    private int K;
    private int L;
    private int M;
    public int b;
    public atsc c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public int l;
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
        atqv atqvVar = new atqv();
        a = atqvVar;
        aopi.registerDefaultInstance(atqv.class, atqvVar);
    }

    private atqv() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001!\u0000\u0004\u0004\ue3ce㸤!\u0000\u0000\u0000\u0004င\u0006\u0006ဇ\b\rဇ\u000f\u000eဇ\u0010\u0013ဇ\u0015\u0014ဇ\u0016\u0015င\u0017\u0016ဇ\u0018\u0017ဇ\u001a\u001aဇ\u001d\u001bင\u0019\u001dဇ\u001f\u001eဇ &ဇ'/ဇ0;ဇ;>ဇ>BဇBJဇHKဇINဇKOဇLPဇMQဇNUဂQVဇRYဇUZဇVeဇ`fဂakဇdoဇh\ue3ce㸤ဉ\u0000", new Object[]{"b", "K", "L", "M", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "l", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "c"});
            case 3:
                return new atqv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f113J;
                if (aorbVar == null) {
                    synchronized (atqv.class) {
                        aorbVar = f113J;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f113J = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
