package defpackage;
/* compiled from: PG */
/* renamed from: aoju  reason: default package */
/* loaded from: classes.dex */
public final class aoju extends aopi implements aoqv {
    public static final aoju a;
    private static volatile aorb e;
    public int b;
    public int c;
    public aoja d;

    static {
        aoju aojuVar = new aoju();
        a = aojuVar;
        aopi.registerDefaultInstance(aoju.class, aojuVar);
    }

    private aoju() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", anfo.p, "d"});
            case 3:
                return new aoju();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aoju.class) {
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
