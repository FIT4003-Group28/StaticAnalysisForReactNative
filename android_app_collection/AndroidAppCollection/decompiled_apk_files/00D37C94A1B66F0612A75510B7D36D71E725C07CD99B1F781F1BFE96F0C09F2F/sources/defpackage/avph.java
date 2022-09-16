package defpackage;
/* compiled from: PG */
/* renamed from: avph  reason: default package */
/* loaded from: classes2.dex */
public final class avph extends aopi implements aoqv {
    public static final avph a;
    private static volatile aorb b;
    private int c;
    private avpb d;
    private avrn e;
    private byte f = 2;

    static {
        avph avphVar = new avph();
        a = avphVar;
        aopi.registerDefaultInstance(avph.class, avphVar);
    }

    private avph() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ue82a㢛\ue5f1㢩\u0002\u0000\u0000\u0002\ue82a㢛ᐉ\u0000\ue5f1㢩ᐉ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new avph();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avph.class) {
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
