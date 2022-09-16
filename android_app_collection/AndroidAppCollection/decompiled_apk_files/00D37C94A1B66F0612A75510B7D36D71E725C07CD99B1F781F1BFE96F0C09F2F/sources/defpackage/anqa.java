package defpackage;
/* compiled from: PG */
/* renamed from: anqa  reason: default package */
/* loaded from: classes.dex */
public final class anqa extends aopi implements aoqv {
    public static final anqa a;
    private static volatile aorb d;
    public anqb b;
    public int c;

    static {
        anqa anqaVar = new anqa();
        a = anqaVar;
        aopi.registerDefaultInstance(anqa.class, anqaVar);
    }

    private anqa() {
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"b", "c"});
            case 3:
                return new anqa();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (anqa.class) {
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
