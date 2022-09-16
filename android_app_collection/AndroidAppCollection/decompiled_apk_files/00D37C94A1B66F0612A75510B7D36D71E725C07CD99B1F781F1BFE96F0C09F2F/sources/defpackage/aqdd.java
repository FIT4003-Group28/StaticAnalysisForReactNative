package defpackage;
/* compiled from: PG */
/* renamed from: aqdd  reason: default package */
/* loaded from: classes2.dex */
public final class aqdd extends aopi implements aoqv {
    public static final aqdd a;
    private static volatile aorb i;
    public int b;
    public arag c;
    public aunb d;
    public aunb e;
    private aoux j;
    private byte k = 2;
    public int f = 12;
    public int g = 3;
    public aoob h = aoob.b;

    static {
        aqdd aqddVar = new aqdd();
        a = aqddVar;
        aopi.registerDefaultInstance(aqdd.class, aqddVar);
    }

    private aqdd() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0005\u0005ည\u0006\u0006င\u0003\u0007င\u0004", new Object[]{"b", "c", "d", "e", "j", "h", "f", "g"});
            case 3:
                return new aqdd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aqdd.class) {
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
