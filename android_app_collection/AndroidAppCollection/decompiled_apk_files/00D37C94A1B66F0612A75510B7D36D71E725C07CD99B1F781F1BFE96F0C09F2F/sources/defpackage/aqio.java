package defpackage;
/* compiled from: PG */
/* renamed from: aqio  reason: default package */
/* loaded from: classes2.dex */
public final class aqio extends aopd implements aope {
    public static final aqio a;
    private static volatile aorb d;
    private int e;
    private aoux f;
    private byte g = 2;
    public aoob b = aoob.b;
    public aopu c = emptyProtobufList();

    static {
        aqio aqioVar = new aqio();
        a = aqioVar;
        aopi.registerDefaultInstance(aqio.class, aqioVar);
    }

    private aqio() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ည\u0001\u0003Л", new Object[]{"e", "f", "b", "c", apzg.class});
            case 3:
                return new aqio();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqio.class) {
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
