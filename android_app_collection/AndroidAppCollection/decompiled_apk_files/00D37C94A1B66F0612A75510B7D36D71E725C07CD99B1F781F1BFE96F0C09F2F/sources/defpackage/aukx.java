package defpackage;
/* compiled from: PG */
/* renamed from: aukx  reason: default package */
/* loaded from: classes2.dex */
public final class aukx extends aopi implements aoqv {
    public static final aukx a;
    private static volatile aorb b;
    private int c;
    private aunb d;
    private aunb e;
    private arag f;
    private aunb g;
    private aoux h;
    private byte i = 2;

    static {
        aukx aukxVar = new aukx();
        a = aukxVar;
        aopi.registerDefaultInstance(aukx.class, aukxVar);
    }

    private aukx() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0006ᐉ\u0006", new Object[]{"c", "d", "e", "f", "g", "h"});
            case 3:
                return new aukx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aukx.class) {
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
