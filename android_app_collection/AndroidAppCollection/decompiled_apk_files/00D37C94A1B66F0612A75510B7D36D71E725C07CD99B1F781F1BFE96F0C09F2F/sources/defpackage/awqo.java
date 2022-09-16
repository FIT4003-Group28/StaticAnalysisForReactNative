package defpackage;
/* compiled from: PG */
/* renamed from: awqo  reason: default package */
/* loaded from: classes2.dex */
public final class awqo extends aopi implements aoqv {
    public static final awqo a;
    private static volatile aorb g;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;

    static {
        awqo awqoVar = new awqo();
        a = awqoVar;
        aopi.registerDefaultInstance(awqo.class, awqoVar);
    }

    private awqo() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new awqo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (awqo.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
