package defpackage;
/* compiled from: PG */
/* renamed from: awrh  reason: default package */
/* loaded from: classes2.dex */
public final class awrh extends aopi implements aoqv {
    private static final awrh a;
    private static volatile aorb b;
    private String c = "";
    private aoob d = aoob.b;

    static {
        awrh awrhVar = new awrh();
        a = awrhVar;
        aopi.registerDefaultInstance(awrh.class, awrhVar);
    }

    private awrh() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new awrh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awrh.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
