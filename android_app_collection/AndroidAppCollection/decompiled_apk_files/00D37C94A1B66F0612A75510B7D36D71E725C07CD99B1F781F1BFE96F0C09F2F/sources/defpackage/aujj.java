package defpackage;
/* compiled from: PG */
/* renamed from: aujj  reason: default package */
/* loaded from: classes2.dex */
public final class aujj extends aopi implements aoqv {
    public static final aujj a;
    private static volatile aorb h;
    public int b;
    public aunb c;
    public aozy e;
    private aoux i;
    private byte j = 2;
    public aopu d = emptyProtobufList();
    public aoob f = aoob.b;
    public String g = "";

    static {
        aujj aujjVar = new aujj();
        a = aujjVar;
        aopi.registerDefaultInstance(aujj.class, aujjVar);
    }

    private aujj() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0002\u0004ည\u0003\u0005ᐉ\u0001\u0006ဈ\u0004", new Object[]{"b", "c", "d", apzg.class, "i", "f", "e", "g"});
            case 3:
                return new aujj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aujj.class) {
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
