package defpackage;
/* compiled from: PG */
/* renamed from: atgl  reason: default package */
/* loaded from: classes2.dex */
public final class atgl extends aopi implements aoqv {
    public static final atgl a;
    private static volatile aorb t;
    private byte A = 2;
    public int b;
    public arag c;
    public arag d;
    public atgk e;
    public atgk f;
    public aunb g;
    public aunb h;
    public atgj i;
    public aunb j;
    public aunb k;
    public avhn l;
    public arag m;
    public arag n;
    public arag o;
    public arhs p;
    public boolean q;
    public boolean r;
    public aunb s;
    private atgm u;
    private atgi v;
    private aunb w;
    private aunb x;
    private atis y;
    private arag z;

    static {
        atgl atglVar = new atgl();
        a = atglVar;
        aopi.registerDefaultInstance(atgl.class, atglVar);
    }

    private atgl() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.A);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.A = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0017\u0000\u0001\u0001\u001a\u0017\u0000\u0000\u0015\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\b\u0006ᐉ\u0005\u0007ᐉ\t\bᐉ\n\tᐉ\r\nᐉ\u0006\u000bᐉ\u0007\fᐉ\f\rᐉ\u000e\u000eᐉ\u000f\u0010ᐉ\u000b\u0011ᐉ\u0001\u0012ᐉ\u0010\u0013ᐉ\u0011\u0015ဇ\u0013\u0016ᐉ\u0014\u0017ᐉ\u0015\u0019ဇ\u0017\u001aᐉ\u0018", new Object[]{"b", "c", "e", "f", "u", "i", "v", "j", "w", "l", "g", "h", "k", "m", "n", "x", "d", "o", "p", "q", "y", "z", "r", "s"});
            case 3:
                return new atgl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = t;
                if (aorbVar == null) {
                    synchronized (atgl.class) {
                        aorbVar = t;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            t = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
