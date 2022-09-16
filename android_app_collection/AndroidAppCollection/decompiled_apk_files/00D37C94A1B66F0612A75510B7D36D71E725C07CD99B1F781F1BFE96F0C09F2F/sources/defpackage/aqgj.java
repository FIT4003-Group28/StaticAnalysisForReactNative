package defpackage;
/* compiled from: PG */
/* renamed from: aqgj  reason: default package */
/* loaded from: classes2.dex */
public final class aqgj extends aopi implements aoqv {
    public static final aqgj a;
    private static volatile aorb b;

    static {
        aqgj aqgjVar = new aqgj();
        a = aqgjVar;
        aopi.registerDefaultInstance(aqgj.class, aqgjVar);
    }

    private aqgj() {
        aoob aoobVar = aoob.b;
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
                return new aqgj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqgj.class) {
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
