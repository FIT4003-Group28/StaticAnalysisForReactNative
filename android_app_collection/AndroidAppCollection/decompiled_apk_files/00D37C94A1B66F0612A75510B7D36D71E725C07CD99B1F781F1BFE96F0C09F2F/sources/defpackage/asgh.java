package defpackage;
/* compiled from: PG */
/* renamed from: asgh  reason: default package */
/* loaded from: classes2.dex */
public final class asgh extends aopi implements aoqv {
    public static final asgh a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asgh asghVar = new asgh();
        a = asghVar;
        aopi.registerDefaultInstance(asgh.class, asghVar);
    }

    private asgh() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\uf61aᘿ\uf61aᘿ\u0001\u0000\u0000\u0001\uf61aᘿᐼ\u0000", new Object[]{"c", "b", apjj.class});
            case 3:
                return new asgh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asgh.class) {
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
