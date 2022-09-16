package defpackage;
/* compiled from: PG */
/* renamed from: apiq  reason: default package */
/* loaded from: classes.dex */
public final class apiq extends aopi implements aoqv {
    public static final apiq a;
    private static volatile aorb j;
    public int b;
    public arag c;
    public arag d;
    public int e;
    public avhn f;
    public avvk g;
    public arag h;
    public arag i;
    private byte k = 2;

    static {
        apiq apiqVar = new apiq();
        a = apiqVar;
        aopi.registerDefaultInstance(apiq.class, apiqVar);
    }

    private apiq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003င\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new apiq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (apiq.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
