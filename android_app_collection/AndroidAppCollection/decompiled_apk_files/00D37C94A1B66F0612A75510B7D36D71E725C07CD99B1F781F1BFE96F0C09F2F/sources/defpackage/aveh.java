package defpackage;
/* compiled from: PG */
/* renamed from: aveh  reason: default package */
/* loaded from: classes2.dex */
public final class aveh extends aopi implements aoqv {
    public static final aveh a;
    private static volatile aorb h;
    public int b;
    public float c;
    public float d;
    public int e;
    public float f;
    public float g;

    static {
        aveh avehVar = new aveh();
        a = avehVar;
        aopi.registerDefaultInstance(aveh.class, avehVar);
    }

    private aveh() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဌ\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"b", "c", "d", "e", avcd.o, "f", "g"});
            case 3:
                return new aveh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aveh.class) {
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
