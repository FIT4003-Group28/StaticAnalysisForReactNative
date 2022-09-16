package defpackage;
/* compiled from: PG */
/* renamed from: apzn  reason: default package */
/* loaded from: classes2.dex */
public final class apzn extends aopi implements aoqv {
    public static final apzn a;
    private static volatile aorb f;
    public int b;
    public arhs c;
    public apzo d;
    public arag e;
    private apzg g;
    private boolean h;
    private byte i = 2;

    static {
        apzn apznVar = new apzn();
        a = apznVar;
        aopi.registerDefaultInstance(apzn.class, apznVar);
    }

    private apzn() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ဉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0006ဇ\u0005", new Object[]{"b", "c", "d", "e", "g", "h"});
            case 3:
                return new apzn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apzn.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
