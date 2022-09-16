package defpackage;
/* compiled from: PG */
/* renamed from: anga  reason: default package */
/* loaded from: classes.dex */
public final class anga extends aopi implements aoqv {
    public static final anga a;
    private static volatile aorb i;
    public int b;
    public angd c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public int h;

    static {
        anga angaVar = new anga();
        a = angaVar;
        aopi.registerDefaultInstance(anga.class, angaVar);
    }

    private anga() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0007င\u0006\bင\u0007\u000bင\n", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new anga();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (anga.class) {
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
