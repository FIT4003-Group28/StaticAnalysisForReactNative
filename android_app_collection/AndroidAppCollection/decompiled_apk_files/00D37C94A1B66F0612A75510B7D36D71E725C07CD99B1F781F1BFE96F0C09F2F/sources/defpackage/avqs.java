package defpackage;
/* compiled from: PG */
/* renamed from: avqs  reason: default package */
/* loaded from: classes2.dex */
public final class avqs extends aopi implements aoqv {
    public static final avqs a;
    private static volatile aorb h;
    public int b;
    public Object d;
    public arag e;
    public apzg f;
    private arag i;
    private arag j;
    private aoux k;
    public int c = 0;
    private byte l = 2;
    public aoob g = aoob.b;

    static {
        avqs avqsVar = new avqs();
        a = avqsVar;
        aopi.registerDefaultInstance(avqs.class, avqsVar);
    }

    private avqs() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\n\t\u0000\u0000\b\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ᐉ\u0003\u0004ᐉ\u0006\u0005ည\u0007\u0006ᐉ\b\u0007ᐉ\u0004\tᐉ\u0005\nᐼ\u0000", new Object[]{"d", "c", "b", avhn.class, arhs.class, "e", "f", "g", "k", "i", "j", avsa.class});
            case 3:
                return new avqs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (avqs.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
