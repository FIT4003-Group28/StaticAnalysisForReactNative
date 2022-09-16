package defpackage;
/* compiled from: PG */
/* renamed from: arys  reason: default package */
/* loaded from: classes2.dex */
public final class arys extends aopi implements aoqv {
    public static final arys a;
    private static volatile aorb e;
    public arpa b;
    private int f;
    private byte g = 2;
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();

    static {
        arys arysVar = new arys();
        a = arysVar;
        aopi.registerDefaultInstance(arys.class, arysVar);
    }

    private arys() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0003\u0001ᐉ\u0000\u0002Л\u0003Л", new Object[]{"f", "b", "c", atsm.class, "d", atrq.class});
            case 3:
                return new arys();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arys.class) {
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
