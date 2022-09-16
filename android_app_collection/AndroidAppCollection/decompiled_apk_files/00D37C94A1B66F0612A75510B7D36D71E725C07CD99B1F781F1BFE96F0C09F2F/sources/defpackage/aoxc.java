package defpackage;
/* compiled from: PG */
/* renamed from: aoxc  reason: default package */
/* loaded from: classes.dex */
public final class aoxc extends aopi implements aoqv {
    public static final aoxc a;
    private static volatile aorb d;
    public aoxa c;
    private int e;
    private aoux f;
    private arag g;
    private byte h = 2;
    public aopu b = emptyProtobufList();

    static {
        aoxc aoxcVar = new aoxc();
        a = aoxcVar;
        aopi.registerDefaultInstance(aoxc.class, aoxcVar);
    }

    private aoxc() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0004\u0001Л\u0004ᐉ\u0000\u0005ᐉ\u0003\u0007ᐉ\u0002", new Object[]{"e", "b", aoxb.class, "f", "g", "c"});
            case 3:
                return new aoxc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aoxc.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
