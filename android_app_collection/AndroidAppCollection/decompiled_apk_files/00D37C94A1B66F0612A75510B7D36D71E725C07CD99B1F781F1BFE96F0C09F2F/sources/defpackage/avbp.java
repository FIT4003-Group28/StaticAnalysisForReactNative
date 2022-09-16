package defpackage;
/* compiled from: PG */
/* renamed from: avbp  reason: default package */
/* loaded from: classes2.dex */
public final class avbp extends aopi implements aoqv {
    public static final avbp a;
    private static volatile aorb j;
    public int b;
    public arag c;
    public arhs d;
    public apzg e;
    public boolean f;
    public boolean g;
    public aovs i;
    private aoux k;
    private byte l = 2;
    public aoob h = aoob.b;

    static {
        avbp avbpVar = new avbp();
        a = avbpVar;
        aopi.registerDefaultInstance(avbp.class, avbpVar);
    }

    private avbp() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0005\u0006ည\u0006\u0007ဇ\u0003\bဇ\u0004\tဉ\u0007", new Object[]{"b", "c", "d", "e", "k", "h", "f", "g", "i"});
            case 3:
                return new avbp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (avbp.class) {
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
