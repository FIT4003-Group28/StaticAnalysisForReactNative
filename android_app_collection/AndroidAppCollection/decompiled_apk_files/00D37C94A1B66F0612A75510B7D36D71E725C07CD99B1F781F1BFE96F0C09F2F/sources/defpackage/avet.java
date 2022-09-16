package defpackage;
/* compiled from: PG */
/* renamed from: avet  reason: default package */
/* loaded from: classes2.dex */
public final class avet extends aopi implements aoqv {
    public static final avet a;
    private static volatile aorb g;
    public int b;
    public boolean c;
    public float d;
    public aves e;
    public float f;

    static {
        avet avetVar = new avet();
        a = avetVar;
        aopi.registerDefaultInstance(avet.class, avetVar);
    }

    private avet() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004ခ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new avet();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avet.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
