package defpackage;
/* compiled from: PG */
/* renamed from: aofc  reason: default package */
/* loaded from: classes.dex */
public final class aofc extends aopi implements aoqv {
    public static final aofc a;
    private static volatile aorb b;

    static {
        aofc aofcVar = new aofc();
        a = aofcVar;
        aopi.registerDefaultInstance(aofc.class, aofcVar);
    }

    private aofc() {
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
                return newMessageInfo(a, "\u0000\u0000", null);
            case 3:
                return new aofc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aofc.class) {
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
