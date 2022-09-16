package defpackage;
/* compiled from: PG */
/* renamed from: avvd  reason: default package */
/* loaded from: classes2.dex */
public final class avvd extends aopi implements aoqv {
    public static final avvd a;
    private static volatile aorb g;
    public int b;
    public int c;
    public arag d;
    public arag e;
    public apzg f;
    private apzg h;
    private arag i;
    private atwp j;
    private atwp k;
    private byte l = 2;

    static {
        avvd avvdVar = new avvd();
        a = avvdVar;
        aopi.registerDefaultInstance(avvd.class, avvdVar);
    }

    private avvd() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0007\u0001ဌ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0007\u0007ᐉ\b\bᐉ\u0006", new Object[]{"b", "c", avuh.m, "d", "e", "f", "h", "j", "k", "i"});
            case 3:
                return new avvd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avvd.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
