package defpackage;
/* compiled from: PG */
/* renamed from: asaf  reason: default package */
/* loaded from: classes2.dex */
public final class asaf extends aopi implements aoqv {
    public static final asaf a;
    private static volatile aorb g;
    public int b;
    public atds c;
    public awgx d;
    public avjf e;
    public apzj f;
    private byte h = 2;

    static {
        asaf asafVar = new asaf();
        a = asafVar;
        aopi.registerDefaultInstance(asaf.class, asafVar);
    }

    private asaf() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\uefcf⸵\ue60b囤\u0004\u0000\u0000\u0004\uefcf⸵ᐉ\u0000\uf23f㤑ᐉ\u0001\ueb41䣥ᐉ\u0002\ue60b囤ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new asaf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asaf.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
