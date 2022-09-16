package defpackage;
/* compiled from: PG */
/* renamed from: azzl  reason: default package */
/* loaded from: classes2.dex */
public final class azzl extends aopi implements aoqv {
    public static final azzl a;
    private static volatile aorb j;
    public int b;
    public long c;
    public int d;
    public int f;
    public int g;
    public int h;
    public aopu e = aopi.emptyProtobufList();
    public aopu i = aopi.emptyProtobufList();

    static {
        azzl azzlVar = new azzl();
        a = azzlVar;
        aopi.registerDefaultInstance(azzl.class, azzlVar);
    }

    private azzl() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဋ\u0001\u0003\u001a\u0004ဋ\u0002\u0005ဌ\u0003\u0006င\u0004\u0007\u001a", new Object[]{"b", "c", "d", "e", "f", "g", axce.k, "h", "i"});
            case 3:
                return new azzl();
            case 4:
                return new aopa((float[][]) null, (float[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (azzl.class) {
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
