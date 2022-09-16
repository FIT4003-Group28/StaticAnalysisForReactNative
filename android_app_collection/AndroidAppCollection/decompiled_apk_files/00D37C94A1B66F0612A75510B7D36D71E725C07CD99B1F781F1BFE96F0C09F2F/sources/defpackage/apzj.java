package defpackage;
/* compiled from: PG */
/* renamed from: apzj  reason: default package */
/* loaded from: classes2.dex */
public final class apzj extends aopi implements aoqv {
    public static final apzj a;
    private static volatile aorb h;
    public int b;
    public apzg c;
    public apzg d;
    public aweu e;
    private aoux i;
    private byte j = 2;
    public aoob f = aoob.b;
    public aopu g = emptyProtobufList();

    static {
        apzj apzjVar = new apzj();
        a = apzjVar;
        aopi.registerDefaultInstance(apzj.class, apzjVar);
    }

    private apzj() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ဉ\u0003\u0005ᐉ\u0004\u0006ည\u0005\u0007\u001b", new Object[]{"b", "c", "d", "e", "i", "f", "g", apwb.class});
            case 3:
                return new apzj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (apzj.class) {
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
