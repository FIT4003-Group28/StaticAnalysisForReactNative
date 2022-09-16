package defpackage;
/* compiled from: PG */
/* renamed from: aulp  reason: default package */
/* loaded from: classes2.dex */
public final class aulp extends aopi implements aoqv {
    public static final aulp a;
    private static volatile aorb i;
    public int b;
    public arag c;
    public arag d;
    public apzg e;
    public arag f;
    public avhn g;
    private aoux j;
    private byte k = 2;
    public aoob h = aoob.b;

    static {
        aulp aulpVar = new aulp();
        a = aulpVar;
        aopi.registerDefaultInstance(aulp.class, aulpVar);
    }

    private aulp() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ည\u0006\u0007ᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j"});
            case 3:
                return new aulp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aulp.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
