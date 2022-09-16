package defpackage;
/* compiled from: PG */
/* renamed from: aufd  reason: default package */
/* loaded from: classes2.dex */
public final class aufd extends aopi implements aoqv {
    public static final aufd a;
    private static volatile aorb i;
    public int b;
    public arag c;
    public avhn d;
    public avhn e;
    public arag f;
    public arag g;
    public aunb h;
    private byte j = 2;

    static {
        aufd aufdVar = new aufd();
        a = aufdVar;
        aopi.registerDefaultInstance(aufd.class, aufdVar);
    }

    private aufd() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0003", new Object[]{"b", "c", "d", "f", "g", "h", "e"});
            case 3:
                return new aufd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aufd.class) {
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
