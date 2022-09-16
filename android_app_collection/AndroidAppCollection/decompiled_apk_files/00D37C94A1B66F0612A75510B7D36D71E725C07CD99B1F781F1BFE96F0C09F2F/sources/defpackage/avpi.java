package defpackage;
/* compiled from: PG */
/* renamed from: avpi  reason: default package */
/* loaded from: classes2.dex */
public final class avpi extends aopi implements aoqv {
    public static final avpi a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apok f;
    private apzg g;
    private arag h;
    private arag i;
    private arag j;
    private arag k;
    private arag l;
    private arag m;
    private arag n;
    private arag o;
    private arag p;
    private arag q;
    private arag r;
    private aoux s;
    private arag t;
    private apok u;
    private apok v;
    private byte w = 2;

    static {
        avpi avpiVar = new avpi();
        a = avpiVar;
        aopi.registerDefaultInstance(avpi.class, avpiVar);
    }

    private avpi() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.w);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.w = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0014\u0013\u0000\u0000\u0013\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\u0012\u000bᐉ\u0013\fᐉ\u000f\u000eᐉ\u0011\u000fᐉ\t\u0010ᐉ\u000b\u0011ᐉ\n\u0012ᐉ\f\u0013ᐉ\r\u0014ᐉ\u000e", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "u", "v", "s", "t", "m", "o", "n", "p", "q", "r"});
            case 3:
                return new avpi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avpi.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
