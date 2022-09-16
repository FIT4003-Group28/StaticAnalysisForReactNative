package defpackage;
/* compiled from: PG */
/* renamed from: aovy  reason: default package */
/* loaded from: classes.dex */
public final class aovy extends aopi implements aoqv {
    public static final aovy a;
    private static volatile aorb g;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public int f;

    static {
        aovy aovyVar = new aovy();
        a = aovyVar;
        aopi.registerDefaultInstance(aovy.class, aovyVar);
    }

    private aovy() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0006\f\u0004\u0000\u0000\u0000\u0006င\u0004\nဇ\u0007\u000bဇ\b\fင\t", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aovy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aovy.class) {
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
