package defpackage;
/* compiled from: PG */
/* renamed from: aqjp  reason: default package */
/* loaded from: classes2.dex */
public final class aqjp extends aopi implements aoqv {
    public static final aqjp a;
    private static volatile aorb b;
    private int c;
    private aqjo d;
    private aqjo e;
    private aqjo f;
    private byte g = 2;

    static {
        aqjp aqjpVar = new aqjp();
        a = aqjpVar;
        aopi.registerDefaultInstance(aqjp.class, aqjpVar);
    }

    private aqjp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0007\t\u0003\u0000\u0000\u0003\u0007ᐉ\u0000\bᐉ\u0001\tᐉ\u0002", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new aqjp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqjp.class) {
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
