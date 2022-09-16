package defpackage;
/* compiled from: PG */
/* renamed from: anfl  reason: default package */
/* loaded from: classes.dex */
public final class anfl extends aopi implements aoqv {
    public static final anfl a;
    private static volatile aorb f;
    public int b;
    public aopu c = emptyProtobufList();
    public anft d;
    public float e;

    static {
        anfl anflVar = new anfl();
        a = anflVar;
        aopi.registerDefaultInstance(anfl.class, anflVar);
    }

    private anfl() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ခ\u0001", new Object[]{"b", "c", anft.class, "d", "e"});
            case 3:
                return new anfl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (anfl.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
