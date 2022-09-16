package defpackage;
/* compiled from: PG */
/* renamed from: auqu  reason: default package */
/* loaded from: classes2.dex */
public final class auqu extends aopi implements aoqv {
    public static final auqu a;
    private static volatile aorb e;
    public int b = 0;
    public Object c;
    public ausj d;
    private int f;

    static {
        auqu auquVar = new auqu();
        a = auquVar;
        aopi.registerDefaultInstance(auqu.class, auquVar);
    }

    private auqu() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ျ\u0000\u0003်\u0000\u0004ဵ\u0000", new Object[]{"c", "b", "f", "d"});
            case 3:
                return new auqu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (auqu.class) {
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
