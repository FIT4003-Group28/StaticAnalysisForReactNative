package defpackage;
/* compiled from: PG */
/* renamed from: arwe  reason: default package */
/* loaded from: classes2.dex */
public final class arwe extends aopi implements aoqv {
    public static final arwe a;
    private static volatile aorb d;
    public int b;
    public assn c;
    private atfa e;
    private byte f = 2;

    static {
        arwe arweVar = new arwe();
        a = arweVar;
        aopi.registerDefaultInstance(arwe.class, arweVar);
    }

    private arwe() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ue592᯦\ue55b㟮\u0002\u0000\u0000\u0002\ue592᯦ᐉ\u0001\ue55b㟮ᐉ\u0000", new Object[]{"b", "e", "c"});
            case 3:
                return new arwe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arwe.class) {
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
