package defpackage;
/* compiled from: PG */
/* renamed from: arcl  reason: default package */
/* loaded from: classes2.dex */
public final class arcl extends aopi implements aoqv {
    public static final arcl a;
    private static volatile aorb b;
    private int c;
    private aoux d;
    private arag e;
    private apok f;
    private apok g;
    private arcm h;
    private byte i = 2;

    static {
        arcl arclVar = new arcl();
        a = arclVar;
        aopi.registerDefaultInstance(arcl.class, arclVar);
    }

    private arcl() {
        aoob aoobVar = aoob.b;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\t\u0005\u0000\u0000\u0005\u0002ᐉ\u0001\u0004ᐉ\u0003\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0007", new Object[]{"c", "d", "e", "f", "g", "h"});
            case 3:
                return new arcl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arcl.class) {
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
