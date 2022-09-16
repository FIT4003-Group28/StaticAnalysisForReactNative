package defpackage;
/* compiled from: PG */
/* renamed from: asrf  reason: default package */
/* loaded from: classes2.dex */
public final class asrf extends aopi implements aoqv {
    public static final asrf a;
    private static volatile aorb n;
    public int b;
    public long d;
    public arag e;
    public arag g;
    public arag h;
    public avhn i;
    public arag k;
    public arag l;
    public apzg m;
    private byte o = 2;
    public String c = "";
    public String f = "";
    public aopu j = emptyProtobufList();

    static {
        asrf asrfVar = new asrf();
        a = asrfVar;
        aopi.registerDefaultInstance(asrf.class, asrfVar);
    }

    private asrf() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\b\u0001ᐉ\u0004\u0002ᐉ\u0005\u0003ᐉ\u0006\u0004ᐉ\t\u0005ဈ\u0000\u0006ဃ\u0001\u0007Л\bဈ\u0003\tᐉ\u0007\nᐉ\b\rᐉ\u0002", new Object[]{"b", "g", "h", "i", "m", "c", "d", "j", asqe.class, "f", "k", "l", "e"});
            case 3:
                return new asrf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (asrf.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
