package defpackage;
/* compiled from: PG */
/* renamed from: aoyd  reason: default package */
/* loaded from: classes.dex */
public final class aoyd extends aopi implements aoqv {
    public static final aoyd a;
    private static volatile aorb b;
    private int c;
    private aunb d;
    private aunb e;
    private byte f = 2;

    static {
        aoyd aoydVar = new aoyd();
        a = aoydVar;
        aopi.registerDefaultInstance(aoyd.class, aoydVar);
    }

    private aoyd() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"c", "d", "e"});
            case 3:
                return new aoyd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aoyd.class) {
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
