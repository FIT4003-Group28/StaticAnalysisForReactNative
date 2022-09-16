package defpackage;
/* compiled from: PG */
/* renamed from: asfd  reason: default package */
/* loaded from: classes2.dex */
public final class asfd extends aopi implements aoqv {
    public static final asfd a;
    private static volatile aorb i;
    public int b;
    public aroy c;
    public avzc f;
    public boolean g;
    public atjn h;
    private byte j = 2;
    public String d = "";
    public int e = 1;

    static {
        asfd asfdVar = new asfd();
        a = asfdVar;
        aopi.registerDefaultInstance(asfd.class, asfdVar);
    }

    private asfd() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဉ\u0006", new Object[]{"b", "c", "d", "e", asev.a, "f", "g", "h"});
            case 3:
                return new asfd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (asfd.class) {
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
