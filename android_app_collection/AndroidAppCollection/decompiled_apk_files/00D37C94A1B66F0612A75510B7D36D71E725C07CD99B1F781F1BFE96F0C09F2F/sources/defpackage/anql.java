package defpackage;
/* compiled from: PG */
/* renamed from: anql  reason: default package */
/* loaded from: classes.dex */
public final class anql extends aopi implements aoqv {
    public static final anql a;
    private static volatile aorb e;
    public int b;
    public int c;
    public int d;

    static {
        anql anqlVar = new anql();
        a = anqlVar;
        aopi.registerDefaultInstance(anql.class, anqlVar);
    }

    private anql() {
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"b", "c", "d"});
            case 3:
                return new anql();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (anql.class) {
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
