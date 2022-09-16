package defpackage;
/* compiled from: PG */
/* renamed from: ors  reason: default package */
/* loaded from: classes4.dex */
public final class ors extends aopi implements aoqv {
    public static final ors a;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public aopq d = emptyIntList();

    static {
        ors orsVar = new ors();
        a = orsVar;
        aopi.registerDefaultInstance(ors.class, orsVar);
    }

    private ors() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u0016", new Object[]{"b", "c", "d"});
            case 3:
                return new ors();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (ors.class) {
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
