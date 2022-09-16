package defpackage;
/* compiled from: PG */
/* renamed from: asqo  reason: default package */
/* loaded from: classes2.dex */
public final class asqo extends aopi implements aoqv {
    public static final asqo a;
    private static volatile aorb d;
    public int b;
    public arag c;
    private arag e;
    private apok f;
    private byte g = 2;

    static {
        asqo asqoVar = new asqo();
        a = asqoVar;
        aopi.registerDefaultInstance(asqo.class, asqoVar);
    }

    private asqo() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0004", new Object[]{"b", "c", "e", "f"});
            case 3:
                return new asqo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asqo.class) {
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
