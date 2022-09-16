package defpackage;
/* compiled from: PG */
/* renamed from: aoiv  reason: default package */
/* loaded from: classes.dex */
public final class aoiv extends aopi implements aoqv {
    public static final aoiv a;
    private static volatile aorb l;
    public int b;
    public aopu c = emptyProtobufList();
    public String d = "";
    public String e = "";
    public aojo f;
    public aojv g;
    public aojb h;
    public long i;
    public long j;
    public aoji k;

    static {
        aoiv aoivVar = new aoiv();
        a = aoivVar;
        aopi.registerDefaultInstance(aoiv.class, aoivVar);
    }

    private aoiv() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဈ\u0001\u0007ဉ\u0004\tဂ\u0006\nဂ\u0007\u000bဉ\b", new Object[]{"b", "c", aoiu.class, "d", "f", "g", "e", "h", "i", "j", "k"});
            case 3:
                return new aoiv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (aoiv.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
