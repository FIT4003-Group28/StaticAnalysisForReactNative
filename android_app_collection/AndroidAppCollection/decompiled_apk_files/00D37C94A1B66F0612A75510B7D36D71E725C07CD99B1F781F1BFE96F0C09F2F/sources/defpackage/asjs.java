package defpackage;
/* compiled from: PG */
/* renamed from: asjs  reason: default package */
/* loaded from: classes2.dex */
public final class asjs extends aopi implements aoqv {
    public static final asjs a;
    private static volatile aorb e;
    public int b;
    public int c;
    public boolean d;

    static {
        asjs asjsVar = new asjs();
        a = asjsVar;
        aopi.registerDefaultInstance(asjs.class, asjsVar);
    }

    private asjs() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new asjs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (asjs.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
