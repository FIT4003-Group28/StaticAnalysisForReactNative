package defpackage;
/* compiled from: PG */
/* renamed from: awiz  reason: default package */
/* loaded from: classes2.dex */
public final class awiz extends aopd implements aope {
    public static final awiz a;
    private static volatile aorb d;
    public arag c;
    private int e;
    private aoux f;
    private byte g = 2;
    public aoob b = aoob.b;

    static {
        awiz awizVar = new awiz();
        a = awizVar;
        aopi.registerDefaultInstance(awiz.class, awizVar);
    }

    private awiz() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0002\u0001ည\u0000\u0004ᐉ\u0004\u0005ᐉ\u0006", new Object[]{"e", "b", "c", "f"});
            case 3:
                return new awiz();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awiz.class) {
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
