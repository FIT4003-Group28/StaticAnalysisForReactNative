package defpackage;
/* compiled from: PG */
/* renamed from: augp  reason: default package */
/* loaded from: classes2.dex */
public final class augp extends aopi implements aoqv {
    public static final augp a;
    private static volatile aorb e;
    public aunb b;
    private int f;
    private aoux g;
    private byte h = 2;
    public aopu c = emptyProtobufList();
    public aoob d = aoob.b;

    static {
        augp augpVar = new augp();
        a = augpVar;
        aopi.registerDefaultInstance(augp.class, augpVar);
    }

    private augp() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0003\u0001ᐉ\u0000\u0002Л\u0004ည\u0001\u0005ᐉ\u0002", new Object[]{"f", "b", "c", aunb.class, "d", "g"});
            case 3:
                return new augp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (augp.class) {
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
