package defpackage;
/* compiled from: PG */
/* renamed from: arcd  reason: default package */
/* loaded from: classes2.dex */
public final class arcd extends aopi implements aoqv {
    public static final arcd a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private apzg e;
    private apok f;
    private apok g;
    private aoux h;
    private byte i = 2;

    static {
        arcd arcdVar = new arcd();
        a = arcdVar;
        aopi.registerDefaultInstance(arcd.class, arcdVar);
    }

    private arcd() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.i = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0003ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\u0007", new Object[]{"c", "d", "e", "f", "g", "h"});
            case 3:
                return new arcd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arcd.class) {
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
