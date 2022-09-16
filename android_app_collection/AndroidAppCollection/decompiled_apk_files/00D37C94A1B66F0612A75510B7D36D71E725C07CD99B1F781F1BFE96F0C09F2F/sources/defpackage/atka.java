package defpackage;
/* compiled from: PG */
/* renamed from: atka  reason: default package */
/* loaded from: classes2.dex */
public final class atka extends aopi implements aoqv {
    public static final atka a;
    private static volatile aorb b;
    private int c;
    private atjy d;
    private byte e = 2;

    static {
        atka atkaVar = new atka();
        a = atkaVar;
        aopi.registerDefaultInstance(atka.class, atkaVar);
    }

    private atka() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uef1f䄘\uef1f䄘\u0001\u0000\u0000\u0001\uef1f䄘ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new atka();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atka.class) {
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
