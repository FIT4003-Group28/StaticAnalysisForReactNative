package defpackage;
/* compiled from: PG */
/* renamed from: arul  reason: default package */
/* loaded from: classes2.dex */
public final class arul extends aopi implements aoqv {
    public static final arul a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arul arulVar = new arul();
        a = arulVar;
        aopi.registerDefaultInstance(arul.class, arulVar);
    }

    private arul() {
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
                return newMessageInfo(a, "\u0001\u0007\u0001\u0000\uf264ᙛ\ue84d㫇\u0007\u0000\u0000\u0007\uf264ᙛᐼ\u0000金ᚆᐼ\u0000\uf8c1ᛍᐼ\u0000\uf67aᤚᐼ\u0000\uffc9ᦿᐼ\u0000\ue0a5㠴ᐼ\u0000\ue84d㫇ᐼ\u0000", new Object[]{"c", "b", arfj.class, arfl.class, arfh.class, arfk.class, arfi.class, atxm.class, atia.class});
            case 3:
                return new arul();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arul.class) {
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
