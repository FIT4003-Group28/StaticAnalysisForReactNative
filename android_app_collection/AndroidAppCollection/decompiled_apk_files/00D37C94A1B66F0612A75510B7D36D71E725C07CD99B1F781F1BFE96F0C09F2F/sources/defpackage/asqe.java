package defpackage;
/* compiled from: PG */
/* renamed from: asqe  reason: default package */
/* loaded from: classes2.dex */
public final class asqe extends aopi implements aoqv {
    public static final asqe a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asqe asqeVar = new asqe();
        a = asqeVar;
        aopi.registerDefaultInstance(asqe.class, asqeVar);
    }

    private asqe() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\uf751㵊\uf751㵊\u0001\u0000\u0000\u0001\uf751㵊ᐼ\u0000", new Object[]{"c", "b", asqd.class});
            case 3:
                return new asqe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asqe.class) {
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
