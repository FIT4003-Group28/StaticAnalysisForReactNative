package defpackage;
/* compiled from: PG */
/* renamed from: argg  reason: default package */
/* loaded from: classes2.dex */
public final class argg extends aopi implements aoqv {
    public static final argg a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        argg arggVar = new argg();
        a = arggVar;
        aopi.registerDefaultInstance(argg.class, arggVar);
    }

    private argg() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\ue9d4㋊\ue9d4㋊\u0001\u0000\u0000\u0001\ue9d4㋊ᐼ\u0000", new Object[]{"c", "b", argc.class});
            case 3:
                return new argg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (argg.class) {
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
