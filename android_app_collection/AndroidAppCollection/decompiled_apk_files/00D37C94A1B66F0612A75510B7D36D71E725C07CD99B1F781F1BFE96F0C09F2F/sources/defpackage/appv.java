package defpackage;
/* compiled from: PG */
/* renamed from: appv  reason: default package */
/* loaded from: classes2.dex */
public final class appv extends aopi implements aoqv {
    public static final appv a;
    private static volatile aorb b;
    private int c;
    private aunb d;
    private appx e;
    private aunb f;
    private aoux g;
    private apzg h;
    private byte i = 2;

    static {
        appv appvVar = new appv();
        a = appvVar;
        aopi.registerDefaultInstance(appv.class, appvVar);
    }

    private appv() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0003ᐉ\u0004\u0005ᐉ\u0001\u0007ᐉ\u0002\tᐉ\u0006", new Object[]{"c", "d", "g", "e", "f", "h"});
            case 3:
                return new appv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (appv.class) {
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
