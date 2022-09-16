package defpackage;
/* compiled from: PG */
/* renamed from: apbq  reason: default package */
/* loaded from: classes.dex */
public final class apbq extends aopi implements aoqv {
    public static final apbq a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        apbq apbqVar = new apbq();
        a = apbqVar;
        aopi.registerDefaultInstance(apbq.class, apbqVar);
    }

    private apbq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ued6a▻\uf829䦵\u0003\u0000\u0000\u0003\ued6a▻ᐼ\u0000\ueb3f㉼ᐼ\u0000\uf829䦵ᐼ\u0000", new Object[]{"c", "b", aqdr.class, apbn.class, apbm.class});
            case 3:
                return new apbq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apbq.class) {
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
