package defpackage;
/* compiled from: PG */
/* renamed from: asin  reason: default package */
/* loaded from: classes2.dex */
public final class asin extends aopi implements aoqv {
    public static final asin a;
    private static volatile aorb b;
    private int c;
    private boolean d;

    static {
        asin asinVar = new asin();
        a = asinVar;
        aopi.registerDefaultInstance(asin.class, asinVar);
    }

    private asin() {
    }

    public static /* synthetic */ void a(asin asinVar) {
        asinVar.c |= 1;
        asinVar.d = true;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "d"});
            case 3:
                return new asin();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (asin.class) {
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
