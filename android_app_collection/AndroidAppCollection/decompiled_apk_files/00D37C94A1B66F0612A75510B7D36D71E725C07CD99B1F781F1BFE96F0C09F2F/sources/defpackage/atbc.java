package defpackage;
/* compiled from: PG */
/* renamed from: atbc  reason: default package */
/* loaded from: classes2.dex */
public final class atbc extends aopi implements aoqv {
    public static final atbc a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private aunb g;
    private aunb h;
    private byte i = 2;

    static {
        atbc atbcVar = new atbc();
        a = atbcVar;
        aopi.registerDefaultInstance(atbc.class, atbcVar);
    }

    private atbc() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.i = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\bᐉ\u0006", new Object[]{"c", "d", "e", "f", "g", "h"});
            case 3:
                return new atbc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atbc.class) {
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
