package defpackage;
/* compiled from: PG */
/* renamed from: apgp  reason: default package */
/* loaded from: classes.dex */
public final class apgp extends aopi implements aoqv {
    public static final apgp a;
    private static volatile aorb j;
    public int b;
    public arhs c;
    public arag d;
    public apzg e;
    public apzg f;
    public apzg g;
    public apzg h;
    public asvv i;
    private arag k;
    private byte l = 2;

    static {
        apgp apgpVar = new apgp();
        a = apgpVar;
        aopi.registerDefaultInstance(apgp.class, apgpVar);
    }

    private apgp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001ϧ\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\tᐉ\u0005ϧᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "k", "h", "i"});
            case 3:
                return new apgp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (apgp.class) {
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
