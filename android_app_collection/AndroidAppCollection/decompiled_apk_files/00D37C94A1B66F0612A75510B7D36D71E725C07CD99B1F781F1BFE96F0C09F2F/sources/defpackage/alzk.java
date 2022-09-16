package defpackage;
/* compiled from: PG */
/* renamed from: alzk  reason: default package */
/* loaded from: classes.dex */
public final class alzk extends aopi implements aoqv {
    public static final alzk a;
    private static volatile aorb d;
    public int b;
    public alzl c;

    static {
        alzk alzkVar = new alzk();
        a = alzkVar;
        aopi.registerDefaultInstance(alzk.class, alzkVar);
    }

    private alzk() {
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\t", new Object[]{"b", "c"});
            case 3:
                return new alzk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (alzk.class) {
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
