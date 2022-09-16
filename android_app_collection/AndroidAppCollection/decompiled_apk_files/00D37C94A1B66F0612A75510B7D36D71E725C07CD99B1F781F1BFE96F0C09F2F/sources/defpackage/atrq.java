package defpackage;
/* compiled from: PG */
/* renamed from: atrq  reason: default package */
/* loaded from: classes2.dex */
public final class atrq extends aopi implements aoqv {
    public static final atrq a;
    private static volatile aorb c;
    public atrp b;
    private int d;
    private byte e = 2;

    static {
        atrq atrqVar = new atrq();
        a = atrqVar;
        aopi.registerDefaultInstance(atrq.class, atrqVar);
    }

    private atrq() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue4f2⏕\ue4f2⏕\u0001\u0000\u0000\u0001\ue4f2⏕ᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new atrq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (atrq.class) {
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
