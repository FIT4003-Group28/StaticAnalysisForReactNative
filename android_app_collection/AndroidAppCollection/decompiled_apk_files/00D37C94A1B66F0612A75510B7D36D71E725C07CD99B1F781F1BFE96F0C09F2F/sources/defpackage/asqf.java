package defpackage;
/* compiled from: PG */
/* renamed from: asqf  reason: default package */
/* loaded from: classes2.dex */
public final class asqf extends aopi implements aoqv {
    public static final asqf a;
    private static volatile aorb e;
    public int b;
    public arag c;
    public aunb d;
    private aunb f;
    private byte g = 2;

    static {
        asqf asqfVar = new asqf();
        a = asqfVar;
        aopi.registerDefaultInstance(asqf.class, asqfVar);
    }

    private asqf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0003\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "f"});
            case 3:
                return new asqf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (asqf.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
