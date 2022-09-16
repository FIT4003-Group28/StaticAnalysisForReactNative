package defpackage;
/* compiled from: PG */
/* renamed from: aujf  reason: default package */
/* loaded from: classes2.dex */
public final class aujf extends aopi implements aoqv {
    public static final aujf a;
    private static volatile aorb j;
    public int b;
    public auik c;
    public aunb e;
    public boolean f;
    public aozy g;
    private aoux k;
    private aunb l;
    private byte m = 2;
    public aopu d = emptyProtobufList();
    public aoob h = aoob.b;
    public String i = "";

    static {
        aujf aujfVar = new aujf();
        a = aujfVar;
        aopi.registerDefaultInstance(aujf.class, aujfVar);
    }

    private aujf() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0005\u0001ᐉ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004ᐉ\u0004\u0005ည\u0005\u0006ဇ\u0002\u0007ᐉ\u0003\bᐉ\u0006\tဈ\u0007", new Object[]{"b", "c", "d", auif.class, "e", "k", "h", "f", "g", "l", "i"});
            case 3:
                return new aujf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aujf.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
