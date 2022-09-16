package defpackage;
/* compiled from: PG */
/* renamed from: aulo  reason: default package */
/* loaded from: classes2.dex */
public final class aulo extends aopi implements aoqv {
    public static final aulo a;
    private static volatile aorb h;
    public int b;
    public arhs c;
    public arag d;
    public aunb e;
    public aunb f;
    private aoux i;
    private byte j = 2;
    public aoob g = aoob.b;

    static {
        aulo auloVar = new aulo();
        a = auloVar;
        aopi.registerDefaultInstance(aulo.class, auloVar);
    }

    private aulo() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0004\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "i"});
            case 3:
                return new aulo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aulo.class) {
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
