package defpackage;
/* compiled from: PG */
/* renamed from: asbd  reason: default package */
/* loaded from: classes2.dex */
public final class asbd extends aopi implements aoqv {
    public static final asbd a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asbd asbdVar = new asbd();
        a = asbdVar;
        aopi.registerDefaultInstance(asbd.class, asbdVar);
    }

    private asbd() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue592᯦\uf492䤳\u0003\u0000\u0000\u0003\ue592᯦ᐼ\u0000\uf254⩭ᐼ\u0000\uf492䤳ᐼ\u0000", new Object[]{"c", "b", atfa.class, apbw.class, aqtb.class});
            case 3:
                return new asbd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asbd.class) {
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
