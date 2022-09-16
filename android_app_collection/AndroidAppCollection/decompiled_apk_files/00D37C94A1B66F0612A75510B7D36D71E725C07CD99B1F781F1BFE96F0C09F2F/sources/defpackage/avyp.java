package defpackage;
/* compiled from: PG */
/* renamed from: avyp  reason: default package */
/* loaded from: classes2.dex */
public final class avyp extends aopi implements aoqv {
    public static final avyp a;
    private static volatile aorb i;
    public int b;
    public avyo g;
    public aopu h;
    private byte j = 2;
    public aopu c = emptyProtobufList();
    public aoob d = aoob.b;
    public aopu e = aopi.emptyProtobufList();
    public aopu f = aopi.emptyProtobufList();

    static {
        avyp avypVar = new avyp();
        a = avypVar;
        aopi.registerDefaultInstance(avyp.class, avypVar);
    }

    private avyp() {
        aopi.emptyProtobufList();
        this.h = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0004\u0001\u0001Л\u0002ည\u0000\u0003\u001a\u0004\u001a\u0006ဉ\u0001\b\u001b", new Object[]{"b", "c", avyn.class, "d", "e", "f", "g", "h", avym.class});
            case 3:
                return new avyp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (avyp.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
