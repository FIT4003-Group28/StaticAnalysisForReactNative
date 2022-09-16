package defpackage;
/* compiled from: PG */
/* renamed from: aqzv  reason: default package */
/* loaded from: classes2.dex */
public final class aqzv extends aopi implements aoqv {
    public static final aqzv a;
    private static volatile aorb d;
    private byte e = 2;
    public aopu b = emptyProtobufList();
    public aopu c = emptyProtobufList();

    static {
        aqzv aqzvVar = new aqzv();
        a = aqzvVar;
        aopi.registerDefaultInstance(aqzv.class, aqzvVar);
    }

    private aqzv() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"b", aqzu.class, "c", aqzu.class});
            case 3:
                return new aqzv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqzv.class) {
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
