package defpackage;
/* compiled from: PG */
/* renamed from: aqvz  reason: default package */
/* loaded from: classes2.dex */
public final class aqvz extends aopi implements aoqv {
    public static final aqvz a;
    private static volatile aorb f;
    public int b;
    public long c;
    public int d;
    public aoob e = aoob.b;

    static {
        aqvz aqvzVar = new aqvz();
        a = aqvzVar;
        aopi.registerDefaultInstance(aqvz.class, aqvzVar);
    }

    private aqvz() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ည\u0002\u0004ဂ\u0000\u0005ဌ\u0001", new Object[]{"b", "e", "c", "d", aqvj.g});
            case 3:
                return new aqvz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqvz.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
