package defpackage;
/* compiled from: PG */
/* renamed from: asww  reason: default package */
/* loaded from: classes2.dex */
public final class asww extends aopi implements aoqv {
    public static final asww a;
    private static volatile aorb j;
    public int b;
    public arag c;
    public long d;
    public long e;
    public avhn f;
    public awmt g;
    public awmt h;
    public awmt i;
    private byte k = 2;

    static {
        asww aswwVar = new asww();
        a = aswwVar;
        aopi.registerDefaultInstance(asww.class, aswwVar);
    }

    private asww() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\t\u0007\u0000\u0000\u0005\u0002ᐉ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new asww();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (asww.class) {
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
