package defpackage;
/* compiled from: PG */
/* renamed from: aorw  reason: default package */
/* loaded from: classes.dex */
public final class aorw extends aopi implements aoqv {
    public static final aorw a;
    private static volatile aorb d;
    public long b;
    public int c;

    static {
        aorw aorwVar = new aorw();
        a = aorwVar;
        aopi.registerDefaultInstance(aorw.class, aorwVar);
    }

    private aorw() {
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"b", "c"});
            case 3:
                return new aorw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aorw.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
