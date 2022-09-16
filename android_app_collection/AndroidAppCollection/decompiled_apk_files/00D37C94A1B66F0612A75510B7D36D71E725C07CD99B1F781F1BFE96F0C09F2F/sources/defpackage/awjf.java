package defpackage;
/* compiled from: PG */
/* renamed from: awjf  reason: default package */
/* loaded from: classes2.dex */
public final class awjf extends aopi implements aoqv {
    public static final awjf a;
    private static volatile aorb k;
    public int b;
    public awje c;
    public arag e;
    public aunb f;
    public aunb g;
    private aoux l;
    private byte m = 2;
    public aopu d = emptyProtobufList();
    public aopu h = emptyProtobufList();
    public aopu i = emptyProtobufList();
    public aoob j = aoob.b;

    static {
        awjf awjfVar = new awjf();
        a = awjfVar;
        aopi.registerDefaultInstance(awjf.class, awjfVar);
    }

    private awjf() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\b\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006Л\u0007Л\bᐉ\u0004\tည\u0005", new Object[]{"b", "c", "d", awjd.class, "e", "f", "g", "h", apzg.class, "i", apzg.class, "l", "j"});
            case 3:
                return new awjf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (awjf.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
