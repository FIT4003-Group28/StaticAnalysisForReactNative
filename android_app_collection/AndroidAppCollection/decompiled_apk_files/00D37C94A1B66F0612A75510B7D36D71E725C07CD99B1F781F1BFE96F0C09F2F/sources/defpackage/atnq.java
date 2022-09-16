package defpackage;
/* compiled from: PG */
/* renamed from: atnq  reason: default package */
/* loaded from: classes2.dex */
public final class atnq extends aopi implements aoqv {
    public static final atnq a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apzg f;
    private aunb g;
    private aunb h;
    private aoux i;
    private byte j = 2;

    static {
        atnq atnqVar = new atnq();
        a = atnqVar;
        aopi.registerDefaultInstance(atnq.class, atnqVar);
    }

    private atnq() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0005\u0005ᐉ\u0007\u0007ᐉ\u0006", new Object[]{"c", "d", "e", "f", "g", "i", "h"});
            case 3:
                return new atnq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atnq.class) {
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
