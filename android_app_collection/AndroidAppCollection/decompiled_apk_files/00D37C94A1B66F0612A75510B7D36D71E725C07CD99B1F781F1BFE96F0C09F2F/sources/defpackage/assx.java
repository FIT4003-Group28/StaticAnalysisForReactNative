package defpackage;
/* compiled from: PG */
/* renamed from: assx */
/* loaded from: classes2.dex */
public final class assx extends aopi implements aoqv {
    public static final assx a;
    private static volatile aorb d;
    public int b;
    public boolean c;
    private boolean e;

    static {
        assx assxVar = new assx();
        a = assxVar;
        aopi.registerDefaultInstance(assx.class, assxVar);
    }

    private assx() {
    }

    public static /* synthetic */ void a(assx assxVar) {
        assxVar.b |= 2;
        assxVar.e = true;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "e"});
            case 3:
                return new assx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (assx.class) {
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
