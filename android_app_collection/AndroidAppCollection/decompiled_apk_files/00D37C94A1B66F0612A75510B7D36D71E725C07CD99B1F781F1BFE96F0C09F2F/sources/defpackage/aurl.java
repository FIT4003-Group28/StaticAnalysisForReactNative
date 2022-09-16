package defpackage;
/* compiled from: PG */
/* renamed from: aurl  reason: default package */
/* loaded from: classes2.dex */
public final class aurl extends aopi implements aoqv {
    public static final aurl a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aurl aurlVar = new aurl();
        a = aurlVar;
        aopi.registerDefaultInstance(aurl.class, aurlVar);
    }

    private aurl() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\uf321Ẑ\uee20䐄\u0004\u0000\u0000\u0004\uf321Ẑᐼ\u0000ￌ䉥ᐼ\u0000\ue39b䐄ᐼ\u0000\uee20䐄ᐼ\u0000", new Object[]{"c", "b", aqft.class, aush.class, avpr.class, avpt.class});
            case 3:
                return new aurl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aurl.class) {
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
