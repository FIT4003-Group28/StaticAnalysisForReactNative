package defpackage;
/* compiled from: PG */
/* renamed from: avhy  reason: default package */
/* loaded from: classes2.dex */
public final class avhy extends aopi implements aoqv {
    public static final avhy a;
    private static volatile aorb k;
    public int b;
    public Object d;
    public arag e;
    public arag f;
    public arag g;
    public arhs h;
    public int i;
    private aoux l;
    public int c = 0;
    private byte m = 2;
    public aoob j = aoob.b;

    static {
        avhy avhyVar = new avhy();
        a = avhyVar;
        aopi.registerDefaultInstance(avhy.class, avhyVar);
    }

    private avhy() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐼ\u0000\u0006ᐼ\u0000\u0007ဌ\u0006\bᐉ\u0007\tည\b", new Object[]{"d", "c", "b", "e", "f", "g", "h", apzg.class, apzg.class, "i", avge.g, "l", "j"});
            case 3:
                return new avhy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (avhy.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
