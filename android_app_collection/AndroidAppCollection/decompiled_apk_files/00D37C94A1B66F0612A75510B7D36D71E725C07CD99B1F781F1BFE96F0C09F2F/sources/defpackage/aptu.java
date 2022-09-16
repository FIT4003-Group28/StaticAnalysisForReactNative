package defpackage;
/* compiled from: PG */
/* renamed from: aptu  reason: default package */
/* loaded from: classes2.dex */
public final class aptu extends aopi implements aoqv {
    public static final aptu a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aptu aptuVar = new aptu();
        a = aptuVar;
        aopi.registerDefaultInstance(aptu.class, aptuVar);
    }

    private aptu() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue4f9㊁\ue4f1놢\u0003\u0000\u0000\u0003\ue4f9㊁ᐼ\u0000\ue580㊁ᐼ\u0000\ue4f1놢ᐼ\u0000", new Object[]{"c", "b", aptw.class, apts.class, aptv.class});
            case 3:
                return new aptu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aptu.class) {
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
