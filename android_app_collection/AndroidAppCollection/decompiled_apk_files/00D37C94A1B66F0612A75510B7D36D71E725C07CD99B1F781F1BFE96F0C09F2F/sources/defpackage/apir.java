package defpackage;
/* compiled from: PG */
/* renamed from: apir  reason: default package */
/* loaded from: classes.dex */
public final class apir extends aopi implements aoqv {
    public static final apir a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private avvk g;
    private byte h = 2;

    static {
        apir apirVar = new apir();
        a = apirVar;
        aopi.registerDefaultInstance(apir.class, apirVar);
    }

    private apir() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0004\u0006ᐉ\u0002", new Object[]{"c", "d", "e", "g", "f"});
            case 3:
                return new apir();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apir.class) {
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
