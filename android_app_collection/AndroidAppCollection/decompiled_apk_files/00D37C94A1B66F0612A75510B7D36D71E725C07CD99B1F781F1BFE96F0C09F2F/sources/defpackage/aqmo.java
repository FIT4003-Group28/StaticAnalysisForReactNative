package defpackage;
/* compiled from: PG */
/* renamed from: aqmo  reason: default package */
/* loaded from: classes2.dex */
public final class aqmo extends aopi implements aoqv {
    public static final aqmo a;
    public static final aopg b;
    private static volatile aorb c;

    static {
        aqmo aqmoVar = new aqmo();
        a = aqmoVar;
        aopi.registerDefaultInstance(aqmo.class, aqmoVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, aqmoVar, aqmoVar, null, 234870342, aosj.MESSAGE, aqmo.class);
    }

    private aqmo() {
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
                return new aqmo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aqmo.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
