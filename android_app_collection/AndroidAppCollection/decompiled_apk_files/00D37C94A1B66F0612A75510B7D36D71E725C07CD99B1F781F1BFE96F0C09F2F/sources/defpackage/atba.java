package defpackage;
/* compiled from: PG */
/* renamed from: atba  reason: default package */
/* loaded from: classes2.dex */
public final class atba extends aopi implements aoqv {
    public static final atba a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private arag i;
    private arag j;
    private arag k;
    private byte l = 2;

    static {
        atba atbaVar = new atba();
        a = atbaVar;
        aopi.registerDefaultInstance(atba.class, atbaVar);
    }

    private atba() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.l = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u000b\b\u0000\u0000\b\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\u000bᐉ\b", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new atba();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atba.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
