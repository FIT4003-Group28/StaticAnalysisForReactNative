package defpackage;
/* compiled from: PG */
/* renamed from: avts  reason: default package */
/* loaded from: classes2.dex */
public final class avts extends aopi implements aoqv {
    public static final avts a;
    private static volatile aorb d;
    public int b;
    public int c;

    static {
        avts avtsVar = new avts();
        a = avtsVar;
        aopi.registerDefaultInstance(avts.class, avtsVar);
    }

    private avts() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c", avui.a()});
            case 3:
                return new avts();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avts.class) {
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
