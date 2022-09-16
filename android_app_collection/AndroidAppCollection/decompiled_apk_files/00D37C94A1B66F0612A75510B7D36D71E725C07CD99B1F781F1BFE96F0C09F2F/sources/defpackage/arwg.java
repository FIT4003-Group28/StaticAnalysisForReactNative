package defpackage;
/* compiled from: PG */
/* renamed from: arwg  reason: default package */
/* loaded from: classes2.dex */
public final class arwg extends aopi implements aoqv {
    public static final arwg a;
    private static volatile aorb c;
    public arpa b;
    private int d;
    private asuc e;
    private arwh f;
    private byte g = 2;

    static {
        arwg arwgVar = new arwg();
        a = arwgVar;
        aopi.registerDefaultInstance(arwg.class, arwgVar);
    }

    private arwg() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0004ᐉ\u0002\u0005ᐉ\u0003", new Object[]{"d", "b", "e", "f"});
            case 3:
                return new arwg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (arwg.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
