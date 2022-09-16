package defpackage;
/* compiled from: PG */
/* renamed from: aowi  reason: default package */
/* loaded from: classes.dex */
public final class aowi extends aopi implements aoqv {
    public static final aowi a;
    private static volatile aorb g;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public arag f;
    private aoux h;
    private byte i = 2;

    static {
        aowi aowiVar = new aowi();
        a = aowiVar;
        aopi.registerDefaultInstance(aowi.class, aowiVar);
    }

    private aowi() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0004\t\u0005\u0000\u0000\u0005\u0004ᐉ\u0000\u0005ᐉ\u0001\u0006ᐉ\u0002\u0007ᐉ\u0003\tᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "h"});
            case 3:
                return new aowi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aowi.class) {
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
