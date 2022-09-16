package defpackage;
/* compiled from: PG */
/* renamed from: arxp  reason: default package */
/* loaded from: classes2.dex */
public final class arxp extends aopi implements aoqv {
    public static final arxp a;
    private static volatile aorb g;
    public int b;
    public int c;
    public arag d;
    public arag e;
    public apzg f;
    private byte h = 2;

    static {
        arxp arxpVar = new arxp();
        a = arxpVar;
        aopi.registerDefaultInstance(arxp.class, arxpVar);
    }

    private arxp() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", arpt.h, "d", "e", "f"});
            case 3:
                return new arxp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arxp.class) {
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
