package defpackage;
/* compiled from: PG */
/* renamed from: aujs  reason: default package */
/* loaded from: classes2.dex */
public final class aujs extends aopi implements aoqv {
    public static final aujs a;
    private static volatile aorb j;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public apzg f;
    public arag g;
    public ates h;
    private arag k;
    private aoux l;
    private byte m = 2;
    public aoob i = aoob.b;

    static {
        aujs aujsVar = new aujs();
        a = aujsVar;
        aopi.registerDefaultInstance(aujs.class, aujsVar);
    }

    private aujs() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0007\u0005ည\b\u0006ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0005\tᐉ\u0006", new Object[]{"b", "c", "d", "e", "l", "i", "f", "k", "g", "h"});
            case 3:
                return new aujs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aujs.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
