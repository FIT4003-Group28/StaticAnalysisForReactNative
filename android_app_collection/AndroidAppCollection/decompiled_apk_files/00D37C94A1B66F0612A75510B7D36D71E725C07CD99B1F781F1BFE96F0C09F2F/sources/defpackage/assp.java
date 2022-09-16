package defpackage;
/* compiled from: PG */
/* renamed from: assp  reason: default package */
/* loaded from: classes2.dex */
public final class assp extends aopi implements aoqv {
    public static final assp a;
    private static volatile aorb h;
    public int b;
    public aumx c;
    public avia d;
    public askw e;
    public assq f;
    public aubu g;
    private byte i = 2;

    static {
        assp asspVar = new assp();
        a = asspVar;
        aopi.registerDefaultInstance(assp.class, asspVar);
    }

    private assp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\uf697᳗\uf07f䚮\u0005\u0000\u0000\u0001\uf697᳗ᐉ\u0000\uec98\u218aဉ\u0001\uf488┤ဉ\u0002\ue75e䔴ဉ\u0003\uf07f䚮ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new assp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (assp.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
