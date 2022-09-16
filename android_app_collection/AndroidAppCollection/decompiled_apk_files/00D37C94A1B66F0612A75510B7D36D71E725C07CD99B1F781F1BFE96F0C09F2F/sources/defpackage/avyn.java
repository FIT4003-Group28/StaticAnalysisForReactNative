package defpackage;
/* compiled from: PG */
/* renamed from: avyn  reason: default package */
/* loaded from: classes2.dex */
public final class avyn extends aopi implements aoqv {
    public static final avyn a;
    private static volatile aorb f;
    public arag d;
    private int g;
    private byte h = 2;
    public String b = "";
    public String c = "";
    public aopu e = aopi.emptyProtobufList();

    static {
        avyn avynVar = new avyn();
        a = avynVar;
        aopi.registerDefaultInstance(avyn.class, avynVar);
    }

    private avyn() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ᐉ\u0002\u0003\u001a\u0004ဈ\u0001", new Object[]{"g", "b", "d", "e", "c"});
            case 3:
                return new avyn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (avyn.class) {
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
