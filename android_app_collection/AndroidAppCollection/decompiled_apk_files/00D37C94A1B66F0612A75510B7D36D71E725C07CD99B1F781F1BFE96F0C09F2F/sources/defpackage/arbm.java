package defpackage;
/* compiled from: PG */
/* renamed from: arbm  reason: default package */
/* loaded from: classes2.dex */
public final class arbm extends aopi implements aoqv {
    public static final arbm a;
    private static volatile aorb g;
    public int b;
    public arag c;
    public aunb f;
    private aunb h;
    private aoux i;
    private byte j = 2;
    public aoob d = aoob.b;
    public aopu e = emptyProtobufList();

    static {
        arbm arbmVar = new arbm();
        a = arbmVar;
        aopi.registerDefaultInstance(arbm.class, arbmVar);
    }

    private arbm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ည\u0003\u0005Л\u0006ᐉ\u0004", new Object[]{"b", "c", "h", "i", "d", "e", aunb.class, "f"});
            case 3:
                return new arbm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arbm.class) {
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
