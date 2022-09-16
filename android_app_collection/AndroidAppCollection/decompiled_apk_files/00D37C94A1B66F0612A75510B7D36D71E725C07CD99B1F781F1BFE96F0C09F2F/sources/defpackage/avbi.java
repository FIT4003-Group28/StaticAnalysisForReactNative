package defpackage;
/* compiled from: PG */
/* renamed from: avbi  reason: default package */
/* loaded from: classes2.dex */
public final class avbi extends aopi implements aoqv {
    public static final avbi a;
    private static volatile aorb g;
    public int b;
    public int c;
    public int d;
    public avbj e;
    public aunb f;
    private arag h;
    private byte i = 2;

    static {
        avbi avbiVar = new avbi();
        a = avbiVar;
        aopi.registerDefaultInstance(avbi.class, avbiVar);
    }

    private avbi() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e", "h", "f"});
            case 3:
                return new avbi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avbi.class) {
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
