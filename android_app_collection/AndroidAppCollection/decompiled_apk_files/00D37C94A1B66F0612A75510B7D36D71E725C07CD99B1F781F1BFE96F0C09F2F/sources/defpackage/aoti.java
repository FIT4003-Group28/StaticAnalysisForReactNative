package defpackage;
/* compiled from: PG */
/* renamed from: aoti  reason: default package */
/* loaded from: classes.dex */
public final class aoti extends aopi implements aoqv {
    public static final aoti a;
    private static volatile aorb g;
    public int b;
    public int d;
    public long e;
    public int f;
    private byte h = 2;
    public String c = "";

    static {
        aoti aotiVar = new aoti();
        a = aotiVar;
        aopi.registerDefaultInstance(aoti.class, aotiVar);
    }

    private aoti() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔋ\u0001\u0003ᔃ\u0002\u0006ဋ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aoti();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aoti.class) {
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
