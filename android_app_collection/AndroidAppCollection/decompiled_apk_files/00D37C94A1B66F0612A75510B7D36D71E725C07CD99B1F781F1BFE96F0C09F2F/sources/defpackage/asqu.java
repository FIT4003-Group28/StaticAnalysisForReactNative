package defpackage;
/* compiled from: PG */
/* renamed from: asqu  reason: default package */
/* loaded from: classes2.dex */
public final class asqu extends aopi implements aoqv {
    public static final asqu a;
    private static volatile aorb i;
    public int b;
    public arhs d;
    public aovs f;
    public boolean g;
    private aoux j;
    private byte k = 2;
    public String c = "";
    public String e = "";
    public aoob h = aoob.b;

    static {
        asqu asquVar = new asqu();
        a = asquVar;
        aopi.registerDefaultInstance(asqu.class, asquVar);
    }

    private asqu() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဇ\u0004\u0007ᐉ\u0006\bည\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "j", "h"});
            case 3:
                return new asqu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (asqu.class) {
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
