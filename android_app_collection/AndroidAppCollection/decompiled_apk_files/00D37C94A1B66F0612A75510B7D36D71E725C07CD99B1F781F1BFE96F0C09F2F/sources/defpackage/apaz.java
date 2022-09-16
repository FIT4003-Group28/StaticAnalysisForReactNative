package defpackage;
/* compiled from: PG */
/* renamed from: apaz  reason: default package */
/* loaded from: classes.dex */
public final class apaz extends aopi implements aoqv {
    public static final apaz a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        apaz apazVar = new apaz();
        a = apazVar;
        aopi.registerDefaultInstance(apaz.class, apazVar);
    }

    private apaz() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ueec5⬡\uf492䤳\u0003\u0000\u0000\u0003\ueec5⬡ᐼ\u0000\uef92㩰ᐼ\u0000\uf492䤳ᐼ\u0000", new Object[]{"c", "b", apba.class, apbb.class, aqtb.class});
            case 3:
                return new apaz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apaz.class) {
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
