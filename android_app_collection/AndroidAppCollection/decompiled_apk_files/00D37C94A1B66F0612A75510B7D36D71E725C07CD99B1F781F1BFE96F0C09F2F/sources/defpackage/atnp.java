package defpackage;
/* compiled from: PG */
/* renamed from: atnp  reason: default package */
/* loaded from: classes2.dex */
public final class atnp extends aopi implements aoqv {
    public static final atnp a;
    private static volatile aorb i;
    public int b;
    public int d;
    public int e;
    public boolean g;
    public awbs h;
    public String c = "";
    public String f = "";

    static {
        atnp atnpVar = new atnp();
        a = atnpVar;
        aopi.registerDefaultInstance(atnp.class, atnpVar);
    }

    private atnp() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0004င\u0001\u0005င\u0002\u0007ဈ\u0005\tဇ\t\u000bဉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new atnp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (atnp.class) {
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
