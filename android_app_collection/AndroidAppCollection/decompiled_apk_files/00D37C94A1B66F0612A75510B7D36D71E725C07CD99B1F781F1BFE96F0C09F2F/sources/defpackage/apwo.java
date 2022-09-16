package defpackage;
/* compiled from: PG */
/* renamed from: apwo  reason: default package */
/* loaded from: classes2.dex */
public final class apwo extends aopi implements aoqv {
    public static final apwo a;
    private static volatile aorb d;
    public int b;
    private apzg e;
    private arag f;
    private aoux g;
    private byte h = 2;
    public aoob c = aoob.b;

    static {
        apwo apwoVar = new apwo();
        a = apwoVar;
        aopi.registerDefaultInstance(apwo.class, apwoVar);
    }

    private apwo() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ည\u0003", new Object[]{"b", "e", "f", "g", "c"});
            case 3:
                return new apwo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apwo.class) {
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
