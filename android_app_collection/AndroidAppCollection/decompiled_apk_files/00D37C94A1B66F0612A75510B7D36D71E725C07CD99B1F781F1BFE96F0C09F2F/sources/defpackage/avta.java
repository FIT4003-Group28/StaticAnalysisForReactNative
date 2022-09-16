package defpackage;
/* compiled from: PG */
/* renamed from: avta  reason: default package */
/* loaded from: classes2.dex */
public final class avta extends aopi implements aoqv {
    public static final avta a;
    private static volatile aorb e;
    public int b;
    public arpa c;
    public apzg d;
    private arbf f;
    private byte g = 2;

    static {
        avta avtaVar = new avta();
        a = avtaVar;
        aopi.registerDefaultInstance(avta.class, avtaVar);
    }

    private avta() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001̉\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001̉ᐉ\u0002", new Object[]{"b", "c", "d", "f"});
            case 3:
                return new avta();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avta.class) {
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
