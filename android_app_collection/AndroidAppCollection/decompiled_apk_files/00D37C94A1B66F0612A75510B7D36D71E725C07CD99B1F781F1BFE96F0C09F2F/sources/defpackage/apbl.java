package defpackage;
/* compiled from: PG */
/* renamed from: apbl  reason: default package */
/* loaded from: classes.dex */
public final class apbl extends aopi implements aoqv {
    public static final apbl a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private arag i;
    private arag j;
    private apzg k;
    private apok l;
    private aoux m;
    private byte n = 2;

    static {
        apbl apblVar = new apbl();
        a = apblVar;
        aopi.registerDefaultInstance(apbl.class, apblVar);
    }

    private apbl() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.n = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0005\u0004ᐉ\u0006\u0005ᐉ\u0007\bᐉ\t\tᐉ\u0002\nᐉ\u0003\fᐉ\u000b\rᐉ\u0004", new Object[]{"c", "d", "e", "i", "j", "k", "l", "f", "g", "m", "h"});
            case 3:
                return new apbl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apbl.class) {
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
