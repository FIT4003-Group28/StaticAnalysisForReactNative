package defpackage;
/* compiled from: PG */
/* renamed from: atrn  reason: default package */
/* loaded from: classes2.dex */
public final class atrn extends aopi implements aoqv {
    public static final atrn a;
    private static volatile aorb i;
    public int b;
    public String c = "";
    public int d;
    public awbs e;
    public int f;
    public int g;
    public boolean h;

    static {
        atrn atrnVar = new atrn();
        a = atrnVar;
        aopi.registerDefaultInstance(atrn.class, atrnVar);
    }

    private atrn() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0005ဉ\u0003\u0006င\u0005\u0007င\u0006\tဇ\b", new Object[]{"b", "c", "d", atqy.d, "e", "f", "g", "h"});
            case 3:
                return new atrn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (atrn.class) {
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
