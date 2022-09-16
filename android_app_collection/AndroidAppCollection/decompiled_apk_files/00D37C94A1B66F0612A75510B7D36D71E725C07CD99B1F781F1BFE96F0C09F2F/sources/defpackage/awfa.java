package defpackage;
/* compiled from: PG */
/* renamed from: awfa  reason: default package */
/* loaded from: classes2.dex */
public final class awfa extends aopi implements aoqv {
    public static final awfa a;
    private static volatile aorb b;
    private int c;
    private apzg d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private arag i;
    private arag j;
    private apzg k;
    private aunb l;
    private awez m;
    private aoux n;
    private byte o = 2;

    static {
        awfa awfaVar = new awfa();
        a = awfaVar;
        aopi.registerDefaultInstance(awfa.class, awfaVar);
    }

    private awfa() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0002\u000f\u000b\u0000\u0000\u000b\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0007ᐉ\b\bᐉ\n\nᐉ\u000e\u000bᐉ\u0006\fᐉ\t\rᐉ\u0000\u000fᐉ\u000b", new Object[]{"c", "e", "f", "g", "h", "j", "l", "n", "i", "k", "d", "m"});
            case 3:
                return new awfa();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awfa.class) {
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
