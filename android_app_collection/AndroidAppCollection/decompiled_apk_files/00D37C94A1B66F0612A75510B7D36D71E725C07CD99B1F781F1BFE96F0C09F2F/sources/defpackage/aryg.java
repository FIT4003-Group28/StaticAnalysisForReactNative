package defpackage;
/* compiled from: PG */
/* renamed from: aryg  reason: default package */
/* loaded from: classes2.dex */
public final class aryg extends aopi implements aoqv {
    public static final aryg a;
    private static volatile aorb f;
    public int b;
    public aroy c;
    private byte g = 2;
    public aoob d = aoob.b;
    public aoob e = aoob.b;

    static {
        aryg arygVar = new aryg();
        a = arygVar;
        aopi.registerDefaultInstance(aryg.class, arygVar);
    }

    private aryg() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ည\u0002\u0005ည\u0005", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aryg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aryg.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
