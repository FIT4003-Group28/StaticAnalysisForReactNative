package defpackage;
/* compiled from: PG */
/* renamed from: arwc  reason: default package */
/* loaded from: classes2.dex */
public final class arwc extends aopi implements aoqv {
    public static final arwc a;
    private static volatile aorb j;
    public int b;
    public aroy c;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    private byte k = 2;
    public aoob d = aoob.b;
    public String e = "";

    static {
        arwc arwcVar = new arwc();
        a = arwcVar;
        aopi.registerDefaultInstance(arwc.class, arwcVar);
    }

    private arwc() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0015\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ည\u0001\u0004ဈ\u0002\u0006ဇ\f\u000eဇ\u0004\u0012ဇ\u0005\u0015ဇ\u0006", new Object[]{"b", "c", "d", "e", "i", "f", "g", "h"});
            case 3:
                return new arwc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (arwc.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
