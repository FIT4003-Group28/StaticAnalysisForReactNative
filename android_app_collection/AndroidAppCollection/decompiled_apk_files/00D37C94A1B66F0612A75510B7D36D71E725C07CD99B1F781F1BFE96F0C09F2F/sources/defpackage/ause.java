package defpackage;
/* compiled from: PG */
/* renamed from: ause  reason: default package */
/* loaded from: classes2.dex */
public final class ause extends aopi implements aoqv {
    public static final ause a;
    private static volatile aorb b;
    private int c;
    private avqx d;
    private byte e = 2;

    static {
        ause auseVar = new ause();
        a = auseVar;
        aopi.registerDefaultInstance(ause.class, auseVar);
    }

    private ause() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue03e䂧\ue03e䂧\u0001\u0000\u0000\u0001\ue03e䂧ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new ause();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ause.class) {
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
