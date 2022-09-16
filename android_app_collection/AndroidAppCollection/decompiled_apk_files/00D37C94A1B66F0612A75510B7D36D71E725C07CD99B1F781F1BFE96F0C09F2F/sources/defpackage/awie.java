package defpackage;
/* compiled from: PG */
/* renamed from: awie  reason: default package */
/* loaded from: classes2.dex */
public final class awie extends aopi implements aoqv {
    public static final awie a;
    private static volatile aorb d;
    public int b;
    public awhy c;
    private awib e;
    private byte f = 2;

    static {
        awie awieVar = new awie();
        a = awieVar;
        aopi.registerDefaultInstance(awie.class, awieVar);
    }

    private awie() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001連ᬜ\uf8f0ᶅ\u0002\u0000\u0000\u0002連ᬜᐉ\u0000\uf8f0ᶅᐉ\u0001", new Object[]{"b", "e", "c"});
            case 3:
                return new awie();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awie.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
