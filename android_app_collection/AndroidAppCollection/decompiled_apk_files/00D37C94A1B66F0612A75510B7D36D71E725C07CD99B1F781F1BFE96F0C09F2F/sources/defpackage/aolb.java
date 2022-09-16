package defpackage;
/* compiled from: PG */
/* renamed from: aolb  reason: default package */
/* loaded from: classes.dex */
public final class aolb extends aopi implements aoqv {
    public static final aolb a;
    private static volatile aorb i;
    public int b;
    public int c;
    public String d = "";
    public aolo e;
    public aolm f;
    public aolh g;
    public aomk h;

    static {
        aolb aolbVar = new aolb();
        a = aolbVar;
        aopi.registerDefaultInstance(aolb.class, aolbVar);
    }

    private aolb() {
        aopi.emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\f\u0006\u0000\u0000\u0000\u0001ဈ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\nဌ\u0000\fဉ\u0005", new Object[]{"b", "d", "e", "f", "g", "c", aomi.b(), "h"});
            case 3:
                return new aolb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aolb.class) {
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
