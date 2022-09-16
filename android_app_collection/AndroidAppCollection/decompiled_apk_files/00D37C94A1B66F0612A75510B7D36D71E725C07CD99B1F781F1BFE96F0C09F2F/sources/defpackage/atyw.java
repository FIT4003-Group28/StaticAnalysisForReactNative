package defpackage;
/* compiled from: PG */
/* renamed from: atyw  reason: default package */
/* loaded from: classes2.dex */
public final class atyw extends aopi implements aoqv {
    private static final atyw a;
    private static volatile aorb b;
    private String c = "";

    static {
        atyw atywVar = new atyw();
        a = atywVar;
        aopi.registerDefaultInstance(atyw.class, atywVar);
    }

    private atyw() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new atyw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atyw.class) {
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
