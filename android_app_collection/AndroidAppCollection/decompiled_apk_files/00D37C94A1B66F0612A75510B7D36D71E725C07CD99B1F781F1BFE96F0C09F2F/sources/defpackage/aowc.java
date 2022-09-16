package defpackage;
/* compiled from: PG */
/* renamed from: aowc  reason: default package */
/* loaded from: classes.dex */
public final class aowc extends aopi implements aoqv {
    public static final aowc a;
    private static volatile aorb g;
    public int b;
    public avhn c;
    public arag d;
    public aunb e;
    private arag h;
    private aoux i;
    private byte j = 2;
    public aoob f = aoob.b;

    static {
        aowc aowcVar = new aowc();
        a = aowcVar;
        aopi.registerDefaultInstance(aowc.class, aowcVar);
    }

    private aowc() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001ᐉ\u0004\u0002ည\u0005\u0003ᐉ\u0000\u0004ᐉ\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003", new Object[]{"b", "i", "f", "c", "d", "h", "e"});
            case 3:
                return new aowc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aowc.class) {
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
