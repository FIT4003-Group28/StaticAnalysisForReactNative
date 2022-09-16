package defpackage;
/* compiled from: PG */
/* renamed from: avab  reason: default package */
/* loaded from: classes2.dex */
public final class avab extends aopi implements aoqv {
    public static final avab a;
    private static volatile aorb f;
    public int b;
    public arag c;
    public arag d;
    public aunb e;
    private avaa g;
    private byte h = 2;

    static {
        avab avabVar = new avab();
        a = avabVar;
        aopi.registerDefaultInstance(avab.class, avabVar);
    }

    private avab() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001ᐉ\u0001\u0002ᐉ\u0002\u0004ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "g", "e"});
            case 3:
                return new avab();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (avab.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
