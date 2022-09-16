package defpackage;
/* compiled from: PG */
/* renamed from: atpe  reason: default package */
/* loaded from: classes2.dex */
public final class atpe extends aopi implements aoqv {
    public static final atpe a;
    private static volatile aorb h;
    public int b;
    public boolean d;
    public boolean e;
    public aoob c = aoob.b;
    public String f = "";
    public aopu g = emptyProtobufList();

    static {
        atpe atpeVar = new atpe();
        a = atpeVar;
        aopi.registerDefaultInstance(atpe.class, atpeVar);
    }

    private atpe() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", "g", atpd.class});
            case 3:
                return new atpe();
            case 4:
                return new aopa((short[][][]) null, (boolean[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (atpe.class) {
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
