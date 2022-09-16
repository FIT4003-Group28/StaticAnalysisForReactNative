package defpackage;
/* compiled from: PG */
/* renamed from: arvw  reason: default package */
/* loaded from: classes2.dex */
public final class arvw extends aopi implements aoqv {
    public static final arvw a;
    private static volatile aorb d;
    public arpa b;
    private int e;
    private arbf f;
    private byte g = 2;
    public aopu c = emptyProtobufList();

    static {
        arvw arvwVar = new arvw();
        a = arvwVar;
        aopi.registerDefaultInstance(arvw.class, arvwVar);
    }

    private arvw() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001̉\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0002Л̉ᐉ\u0001", new Object[]{"e", "b", "c", apzg.class, "f"});
            case 3:
                return new arvw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arvw.class) {
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
