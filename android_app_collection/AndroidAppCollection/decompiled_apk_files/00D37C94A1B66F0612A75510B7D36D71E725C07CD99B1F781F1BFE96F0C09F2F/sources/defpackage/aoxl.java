package defpackage;
/* compiled from: PG */
/* renamed from: aoxl  reason: default package */
/* loaded from: classes.dex */
public final class aoxl extends aopi implements aoqv {
    public static final aoxl a;
    private static volatile aorb b;
    private int c;
    private apaq d;
    private aoyu e;
    private aunb f;
    private apzg g;
    private aoux h;
    private byte i = 2;

    static {
        aoxl aoxlVar = new aoxl();
        a = aoxlVar;
        aopi.registerDefaultInstance(aoxl.class, aoxlVar);
    }

    private aoxl() {
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0007ᐉ\u0004", new Object[]{"c", "d", "e", "f", "g", "h"});
            case 3:
                return new aoxl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aoxl.class) {
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
