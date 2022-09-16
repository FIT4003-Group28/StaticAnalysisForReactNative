package defpackage;
/* compiled from: PG */
/* renamed from: awpy  reason: default package */
/* loaded from: classes2.dex */
public final class awpy extends aopi implements aoqv {
    public static final awpy a;
    private static volatile aorb b;
    private int c;
    private awpa d;
    private awmt e;
    private awmt f;
    private awmt g;
    private awmt h;
    private awpt i;
    private awmt j;
    private awmt k;
    private awmt l;
    private awpg m;
    private awpb n;
    private byte o = 2;

    static {
        awpy awpyVar = new awpy();
        a = awpyVar;
        aopi.registerDefaultInstance(awpy.class, awpyVar);
    }

    private awpy() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.o = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u0014\u000b\u0000\u0000\u000b\u0001ᐉ\u0000\u0004ᐉ\u0004\u0006ᐉ\u0006\bᐉ\b\nᐉ\n\u000bᐉ\u000b\u000fᐉ\u000e\u0010ᐉ\u000f\u0011ᐉ\u0010\u0012ᐉ\u0011\u0014ᐉ\u0012", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case 3:
                return new awpy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awpy.class) {
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
