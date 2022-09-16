package defpackage;
/* compiled from: PG */
/* renamed from: aurr  reason: default package */
/* loaded from: classes2.dex */
public final class aurr extends aopi implements aoqv {
    public static final aurr a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apzg f;
    private apzg g;
    private arag h;
    private arag i;
    private arag j;
    private byte k = 2;

    static {
        aurr aurrVar = new aurr();
        a = aurrVar;
        aopi.registerDefaultInstance(aurr.class, aurrVar);
    }

    private aurr() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\t\u0007\u0000\u0000\u0007\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\u0003\tᐉ\u0006", new Object[]{"c", "d", "e", "f", "h", "i", "g", "j"});
            case 3:
                return new aurr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aurr.class) {
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
