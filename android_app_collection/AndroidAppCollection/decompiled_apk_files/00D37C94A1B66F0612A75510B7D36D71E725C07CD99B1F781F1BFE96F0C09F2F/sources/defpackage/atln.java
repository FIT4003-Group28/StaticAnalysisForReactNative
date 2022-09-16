package defpackage;
/* compiled from: PG */
/* renamed from: atln  reason: default package */
/* loaded from: classes2.dex */
public final class atln extends aopi implements aoqv {
    public static final atln a;
    private static volatile aorb b;
    private int c;
    private aunb d;
    private aunb e;
    private aunb f;
    private byte g = 2;

    static {
        atln atlnVar = new atln();
        a = atlnVar;
        aopi.registerDefaultInstance(atln.class, atlnVar);
    }

    private atln() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0006\b\u0003\u0000\u0000\u0003\u0006ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0002", new Object[]{"c", "e", "f", "d"});
            case 3:
                return new atln();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atln.class) {
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
