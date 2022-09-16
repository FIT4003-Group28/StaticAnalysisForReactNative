package defpackage;
/* compiled from: PG */
/* renamed from: asjn  reason: default package */
/* loaded from: classes2.dex */
public final class asjn extends aopi implements aoqv {
    public static final asjn a;
    private static volatile aorb i;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public String g = "";
    public int h;

    static {
        asjn asjnVar = new asjn();
        a = asjnVar;
        aopi.registerDefaultInstance(asjn.class, asjnVar);
    }

    private asjn() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဌ\u0005", new Object[]{"b", "c", attl.a(), "d", "e", atqy.d, "f", atqy.e, "g", "h", atpx.a()});
            case 3:
                return new asjn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (asjn.class) {
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
