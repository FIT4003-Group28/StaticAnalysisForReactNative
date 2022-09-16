package defpackage;
/* compiled from: PG */
/* renamed from: arfu  reason: default package */
/* loaded from: classes2.dex */
public final class arfu extends aopi implements aoqv {
    public static final arfu a;
    private static volatile aorb g;
    public int b;
    public Object d;
    public arhs e;
    public aovr f;
    private aoux h;
    public int c = 0;
    private byte i = 2;

    static {
        arfu arfuVar = new arfu();
        a = arfuVar;
        aopi.registerDefaultInstance(arfu.class, arfuVar);
    }

    private arfu() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ဉ\u0003\u0005ᐉ\u0004", new Object[]{"d", "c", "b", "e", apzg.class, apzg.class, "f", "h"});
            case 3:
                return new arfu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arfu.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
