package defpackage;
/* compiled from: PG */
/* renamed from: aqtf  reason: default package */
/* loaded from: classes2.dex */
public final class aqtf extends aopi implements aoqv {
    public static final aqtf a;
    private static volatile aorb d;
    public aunb b;
    private int e;
    private aoux f;
    private byte g = 2;
    public aoob c = aoob.b;

    static {
        aqtf aqtfVar = new aqtf();
        a = aqtfVar;
        aopi.registerDefaultInstance(aqtf.class, aqtfVar);
    }

    private aqtf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ည\u0002", new Object[]{"e", "b", "f", "c"});
            case 3:
                return new aqtf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqtf.class) {
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
