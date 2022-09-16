package defpackage;
/* compiled from: PG */
/* renamed from: awcz  reason: default package */
/* loaded from: classes2.dex */
public final class awcz extends aopi implements aoqv {
    public static final awcz a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        awcz awczVar = new awcz();
        a = awczVar;
        aopi.registerDefaultInstance(awcz.class, awczVar);
    }

    private awcz() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue113㪐\uf492䤳\u0003\u0000\u0000\u0003\ue113㪐ᐼ\u0000ￛ㸼ᐼ\u0000\uf492䤳ᐼ\u0000", new Object[]{"c", "b", awdi.class, auyz.class, aqtb.class});
            case 3:
                return new awcz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awcz.class) {
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
