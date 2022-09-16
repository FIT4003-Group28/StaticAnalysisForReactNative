package defpackage;
/* compiled from: PG */
/* renamed from: awna  reason: default package */
/* loaded from: classes2.dex */
public final class awna extends aopi implements aoqv {
    public static final awna a;
    public static final aopg b;
    private static volatile aorb e;
    public aopu c = emptyProtobufList();
    public int d;
    private int f;

    static {
        awna awnaVar = new awna();
        a = awnaVar;
        aopi.registerDefaultInstance(awna.class, awnaVar);
        b = aopi.newSingularGeneratedExtension(awmy.a, awnaVar, awnaVar, null, 188490103, aosj.MESSAGE, awna.class);
    }

    private awna() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"f", "c", awnb.class, "d"});
            case 3:
                return new awna();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awna.class) {
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
