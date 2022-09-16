package defpackage;
/* compiled from: PG */
/* renamed from: aozw  reason: default package */
/* loaded from: classes.dex */
public final class aozw extends aopi implements aoqv {
    public static final aozw a;
    private static volatile aorb h;
    public int b;
    public aozx c;
    public aozv d;
    public aoyu e;
    public apaq f;
    private apaq i;
    private aoux j;
    private aozz k;
    private byte l = 2;
    public aoob g = aoob.b;

    static {
        aozw aozwVar = new aozw();
        a = aozwVar;
        aopi.registerDefaultInstance(aozw.class, aozwVar);
    }

    private aozw() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0006\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0005ᐉ\u0007\u0006ည\b\u0007ᐉ\u0002\bᐉ\u0004\nᐉ\t", new Object[]{"b", "c", "i", "e", "j", "g", "d", "f", "k"});
            case 3:
                return new aozw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aozw.class) {
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
