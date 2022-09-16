package defpackage;
/* compiled from: PG */
/* renamed from: aqzi  reason: default package */
/* loaded from: classes2.dex */
public final class aqzi extends aopi implements aoqv {
    public static final aqzi a;
    private static volatile aorb f;
    public int b;
    public arag c;
    public aunb d;
    private arag g;
    private byte h = 2;
    public aopu e = emptyProtobufList();

    static {
        aqzi aqziVar = new aqzi();
        a = aqziVar;
        aopi.registerDefaultInstance(aqzi.class, aqziVar);
    }

    private aqzi() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л", new Object[]{"b", "c", "g", "d", "e", aunb.class});
            case 3:
                return new aqzi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqzi.class) {
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
