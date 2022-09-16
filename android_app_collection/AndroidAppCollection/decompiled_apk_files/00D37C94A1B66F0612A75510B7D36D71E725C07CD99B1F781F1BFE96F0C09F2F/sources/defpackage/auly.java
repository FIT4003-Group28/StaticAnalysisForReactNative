package defpackage;
/* compiled from: PG */
/* renamed from: auly  reason: default package */
/* loaded from: classes2.dex */
public final class auly extends aopi implements aoqv {
    public static final auly a;
    private static volatile aorb h;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;

    static {
        auly aulyVar = new auly();
        a = aulyVar;
        aopi.registerDefaultInstance(auly.class, aulyVar);
    }

    private auly() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new auly();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (auly.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
