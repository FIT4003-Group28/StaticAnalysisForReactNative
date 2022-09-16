package defpackage;
/* compiled from: PG */
/* renamed from: avoz  reason: default package */
/* loaded from: classes2.dex */
public final class avoz extends aopi implements aoqv {
    public static final avoz a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private aplw f;
    private apzg g;
    private ates h;
    private aoux i;
    private byte j = 2;

    static {
        avoz avozVar = new avoz();
        a = avozVar;
        aopi.registerDefaultInstance(avoz.class, avozVar);
    }

    private avoz() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.j = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0006\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0007\bᐉ\u0005", new Object[]{"c", "d", "e", "f", "g", "i", "h"});
            case 3:
                return new avoz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avoz.class) {
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
