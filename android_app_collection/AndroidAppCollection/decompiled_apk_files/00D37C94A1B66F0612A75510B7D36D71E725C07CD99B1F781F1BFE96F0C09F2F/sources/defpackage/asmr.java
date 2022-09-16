package defpackage;
/* compiled from: PG */
/* renamed from: asmr  reason: default package */
/* loaded from: classes2.dex */
public final class asmr extends aopi implements aoqv {
    public static final asmr a;
    private static volatile aorb b;
    private int c;
    private asmt d;
    private asms e;
    private byte f = 2;

    static {
        asmr asmrVar = new asmr();
        a = asmrVar;
        aopi.registerDefaultInstance(asmr.class, asmrVar);
    }

    private asmr() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001%\uef62鵖\u0002\u0000\u0000\u0002%ᐉ\u0013\uef62鵖ᐉ\u0014", new Object[]{"c", "d", "e"});
            case 3:
                return new asmr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (asmr.class) {
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
