package defpackage;
/* compiled from: PG */
/* renamed from: auvl  reason: default package */
/* loaded from: classes2.dex */
public final class auvl extends aopi implements aoqv {
    public static final auvl a;
    public static final aopg b;
    private static volatile aorb d;
    public boolean c;
    private int e;

    static {
        auvl auvlVar = new auvl();
        a = auvlVar;
        aopi.registerDefaultInstance(auvl.class, auvlVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, auvlVar, auvlVar, null, 365619327, aosj.MESSAGE, auvl.class);
    }

    private auvl() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"e", "c"});
            case 3:
                return new auvl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (auvl.class) {
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
