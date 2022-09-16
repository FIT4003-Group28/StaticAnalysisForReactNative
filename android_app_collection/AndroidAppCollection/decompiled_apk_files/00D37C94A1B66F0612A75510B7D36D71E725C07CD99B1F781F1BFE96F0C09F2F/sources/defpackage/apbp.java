package defpackage;
/* compiled from: PG */
/* renamed from: apbp  reason: default package */
/* loaded from: classes.dex */
public final class apbp extends aopi implements aoqv {
    public static final apbp a;
    private static volatile aorb c;
    private int d;
    private aunb e;
    private aoux f;
    private byte g = 2;
    public aopu b = emptyProtobufList();

    static {
        apbp apbpVar = new apbp();
        a = apbpVar;
        aopi.registerDefaultInstance(apbp.class, apbpVar);
    }

    private apbp() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0001\u0003\u0003Л\u0005ᐉ\u0002\u0006ᐉ\u0000", new Object[]{"d", "b", apbq.class, "f", "e"});
            case 3:
                return new apbp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (apbp.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
