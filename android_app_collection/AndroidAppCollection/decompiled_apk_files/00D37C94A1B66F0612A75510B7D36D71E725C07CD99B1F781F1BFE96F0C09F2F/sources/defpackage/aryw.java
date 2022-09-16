package defpackage;
/* compiled from: PG */
/* renamed from: aryw  reason: default package */
/* loaded from: classes2.dex */
public final class aryw extends aopi implements aoqv {
    public static final aryw a;
    private static volatile aorb f;
    public Object c;
    public arpa d;
    public boolean e;
    private int g;
    private apzg h;
    public int b = 0;
    private byte i = 2;

    static {
        aryw arywVar = new aryw();
        a = arywVar;
        aopi.registerDefaultInstance(aryw.class, arywVar);
    }

    private aryw() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0007\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐼ\u0000\u0004ဇ\u0003\u0005ᐼ\u0000\u0007ᐉ\u0005", new Object[]{"c", "b", "g", "d", aunb.class, "e", aunb.class, "h"});
            case 3:
                return new aryw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aryw.class) {
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
