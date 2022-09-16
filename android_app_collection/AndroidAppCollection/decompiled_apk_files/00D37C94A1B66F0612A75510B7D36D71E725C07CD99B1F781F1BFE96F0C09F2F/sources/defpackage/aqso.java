package defpackage;
/* compiled from: PG */
/* renamed from: aqso  reason: default package */
/* loaded from: classes2.dex */
public final class aqso extends aopi implements aoqv {
    public static final aqso a;
    private static volatile aorb h;
    public int b;
    public String c = "";
    public aqsn d;
    public aqsn e;
    public int f;
    public int g;

    static {
        aqso aqsoVar = new aqso();
        a = aqsoVar;
        aopi.registerDefaultInstance(aqso.class, aqsoVar);
    }

    private aqso() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", awbc.a(), "g", awbd.a()});
            case 3:
                return new aqso();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqso.class) {
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
