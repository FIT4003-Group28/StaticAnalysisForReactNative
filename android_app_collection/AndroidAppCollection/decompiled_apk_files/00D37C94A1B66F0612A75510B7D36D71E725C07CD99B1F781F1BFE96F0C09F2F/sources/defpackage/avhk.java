package defpackage;
/* compiled from: PG */
/* renamed from: avhk  reason: default package */
/* loaded from: classes2.dex */
public final class avhk extends aopi implements aoqv {
    public static final avhk a;
    private static volatile aorb c;
    public asws b;
    private int d;

    static {
        avhk avhkVar = new avhk();
        a = avhkVar;
        aopi.registerDefaultInstance(avhk.class, avhkVar);
    }

    private avhk() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0001", new Object[]{"d", "b"});
            case 3:
                return new avhk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (avhk.class) {
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
