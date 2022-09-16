package defpackage;
/* compiled from: PG */
/* renamed from: awqw  reason: default package */
/* loaded from: classes2.dex */
public final class awqw extends aopi implements aoqv {
    public static final awqw a;
    private static volatile aorb c;
    public aopu b = emptyProtobufList();

    static {
        awqw awqwVar = new awqw();
        a = awqwVar;
        aopi.registerDefaultInstance(awqw.class, awqwVar);
    }

    private awqw() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", awqk.class});
            case 3:
                return new awqw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (awqw.class) {
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
