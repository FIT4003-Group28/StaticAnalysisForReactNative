package defpackage;
/* compiled from: PG */
/* renamed from: aqkr  reason: default package */
/* loaded from: classes2.dex */
public final class aqkr extends aopi implements aoqv {
    public static final aqkr a;
    private static volatile aorb h;
    public int b;
    public aunb e;
    public apzg f;
    public apzg g;
    private aoux i;
    private byte j = 2;
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();

    static {
        aqkr aqkrVar = new aqkr();
        a = aqkrVar;
        aopi.registerDefaultInstance(aqkr.class, aqkrVar);
    }

    private aqkr() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0002\u0006\u0001Л\u0002Л\u0004ᐉ\u0004\u0006ᐉ\u0001\u0007ᐉ\u0002\bᐉ\u0000", new Object[]{"b", "c", aunb.class, "d", aunb.class, "i", "f", "g", "e"});
            case 3:
                return new aqkr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqkr.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
