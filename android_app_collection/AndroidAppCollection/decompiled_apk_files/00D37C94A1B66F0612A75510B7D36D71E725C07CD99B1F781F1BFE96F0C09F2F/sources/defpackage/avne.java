package defpackage;
/* compiled from: PG */
/* renamed from: avne  reason: default package */
/* loaded from: classes2.dex */
public final class avne extends aopi implements aoqv {
    public static final avne a;
    private static volatile aorb d;
    public int b;
    public avnd c;
    private byte e = 2;

    static {
        avne avneVar = new avne();
        a = avneVar;
        aopi.registerDefaultInstance(avne.class, avneVar);
    }

    private avne() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue4f7ⰻ\ue4f7ⰻ\u0001\u0000\u0000\u0001\ue4f7ⰻᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new avne();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avne.class) {
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
