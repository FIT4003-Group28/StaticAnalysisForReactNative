package defpackage;
/* compiled from: PG */
/* renamed from: auvy  reason: default package */
/* loaded from: classes2.dex */
public final class auvy extends aopi implements aoqv {
    public static final auvy a;
    private static volatile aorb d;
    public apzg b;
    private int e;
    private aoux f;
    private arag g;
    private arag h;
    private byte i = 2;
    public aoob c = aoob.b;

    static {
        auvy auvyVar = new auvy();
        a = auvyVar;
        aopi.registerDefaultInstance(auvy.class, auvyVar);
    }

    private auvy() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0004ᐉ\u0001\u0005ည\u0002\u0006ᐉ\u0003\u0007ᐉ\u0004", new Object[]{"e", "b", "f", "c", "g", "h"});
            case 3:
                return new auvy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (auvy.class) {
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
