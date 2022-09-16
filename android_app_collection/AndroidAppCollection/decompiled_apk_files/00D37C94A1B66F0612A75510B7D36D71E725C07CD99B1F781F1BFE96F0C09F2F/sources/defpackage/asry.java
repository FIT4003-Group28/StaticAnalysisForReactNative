package defpackage;
/* compiled from: PG */
/* renamed from: asry  reason: default package */
/* loaded from: classes2.dex */
public final class asry extends aopi implements aoqv {
    public static final asry a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private auez e;
    private aunb f;
    private aunb g;
    private byte h = 2;

    static {
        asry asryVar = new asry();
        a = asryVar;
        aopi.registerDefaultInstance(asry.class, asryVar);
    }

    private asry() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0004\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new asry();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (asry.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
