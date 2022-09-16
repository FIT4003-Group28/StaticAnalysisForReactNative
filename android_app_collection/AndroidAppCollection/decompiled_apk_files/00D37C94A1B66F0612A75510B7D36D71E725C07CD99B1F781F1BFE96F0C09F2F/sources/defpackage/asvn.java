package defpackage;
/* compiled from: PG */
/* renamed from: asvn  reason: default package */
/* loaded from: classes2.dex */
public final class asvn extends aopi implements aoqv {
    public static final asvn a;
    private static volatile aorb e;
    public int b;
    public arag c;
    public arag d;
    private arag f;
    private arag g;
    private arag h;
    private byte i = 2;

    static {
        asvn asvnVar = new asvn();
        a = asvnVar;
        aopi.registerDefaultInstance(asvn.class, asvnVar);
    }

    private asvn() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0010\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0004ᐉ\u0002\u0007ᐉ\u0005\nᐉ\u0003\u0010ᐉ\u0007", new Object[]{"b", "c", "f", "g", "d", "h"});
            case 3:
                return new asvn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (asvn.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
