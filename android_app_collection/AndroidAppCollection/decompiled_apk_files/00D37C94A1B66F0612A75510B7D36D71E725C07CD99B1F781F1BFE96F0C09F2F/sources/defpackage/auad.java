package defpackage;
/* compiled from: PG */
/* renamed from: auad  reason: default package */
/* loaded from: classes2.dex */
public final class auad extends aopi implements aoqv {
    public static final auad a;
    private static volatile aorb f;
    public int b;
    public arag c;
    public arag d;
    public apok e;
    private arag g;
    private apok h;
    private byte i = 2;

    static {
        auad auadVar = new auad();
        a = auadVar;
        aopi.registerDefaultInstance(auad.class, auadVar);
    }

    private auad() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0005\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0000\u0004ᐉ\u0003\u0007ᐉ\u0004", new Object[]{"b", "d", "g", "c", "e", "h"});
            case 3:
                return new auad();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (auad.class) {
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
