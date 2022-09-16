package defpackage;
/* compiled from: PG */
/* renamed from: auds  reason: default package */
/* loaded from: classes2.dex */
public final class auds extends aopi implements aoqv {
    public static final auds a;
    private static volatile aorb e;
    public int b;
    public arag d;
    private arag f;
    private byte g = 2;
    public aopu c = emptyProtobufList();

    static {
        auds audsVar = new auds();
        a = audsVar;
        aopi.registerDefaultInstance(auds.class, audsVar);
    }

    private auds() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0002Л\u0006ᐉ\u0001", new Object[]{"b", "f", "c", audp.class, "d"});
            case 3:
                return new auds();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (auds.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
