package defpackage;
/* compiled from: PG */
/* renamed from: asaw  reason: default package */
/* loaded from: classes2.dex */
public final class asaw extends aopi implements aoqv {
    public static final asaw a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asaw asawVar = new asaw();
        a = asawVar;
        aopi.registerDefaultInstance(asaw.class, asawVar);
    }

    private asaw() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ufde4ᨒ\uf514厽\u0002\u0000\u0000\u0002\ufde4ᨒᐼ\u0000\uf514厽ᐼ\u0000", new Object[]{"c", "b", aueq.class, atlx.class});
            case 3:
                return new asaw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asaw.class) {
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
