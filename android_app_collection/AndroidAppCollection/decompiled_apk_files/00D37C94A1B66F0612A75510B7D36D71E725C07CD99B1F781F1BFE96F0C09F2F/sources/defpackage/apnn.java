package defpackage;
/* compiled from: PG */
/* renamed from: apnn  reason: default package */
/* loaded from: classes.dex */
public final class apnn extends aopi implements aoqv {
    public static final apnn a;
    private static volatile aorb i;
    public int b;
    public arag c;
    public boolean d;
    public apzg e;
    public apzg f;
    public apzg g;
    public apzg h;
    private arag j;
    private byte k = 2;

    static {
        apnn apnnVar = new apnn();
        a = apnnVar;
        aopi.registerDefaultInstance(apnn.class, apnnVar);
    }

    private apnn() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0006\u0001ᐉ\u0000\u0003ဇ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b", new Object[]{"b", "c", "d", "j", "e", "f", "g", "h"});
            case 3:
                return new apnn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (apnn.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
