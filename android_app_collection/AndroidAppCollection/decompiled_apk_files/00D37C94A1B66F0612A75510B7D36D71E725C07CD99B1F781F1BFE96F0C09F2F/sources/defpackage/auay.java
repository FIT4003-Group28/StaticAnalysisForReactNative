package defpackage;
/* compiled from: PG */
/* renamed from: auay  reason: default package */
/* loaded from: classes2.dex */
public final class auay extends aopi implements aoqv {
    public static final auay a;
    private static volatile aorb d;
    public int b;
    public int c;
    private int e;
    private arag f;
    private aoux g;
    private byte h = 2;

    static {
        auay auayVar = new auay();
        a = auayVar;
        aopi.registerDefaultInstance(auay.class, auayVar);
    }

    private auay() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002င\u0001\u0003ᐉ\u0003\u0005င\u0002", new Object[]{"e", "f", "b", "g", "c"});
            case 3:
                return new auay();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (auay.class) {
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
