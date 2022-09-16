package defpackage;
/* compiled from: PG */
/* renamed from: aujq  reason: default package */
/* loaded from: classes2.dex */
public final class aujq extends aopi implements aoqv {
    public static final aujq a;
    private static volatile aorb i;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    private int j;
    private int k;

    static {
        aujq aujqVar = new aujq();
        a = aujqVar;
        aopi.registerDefaultInstance(aujq.class, aujqVar);
    }

    private aujq() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0002\u0003)\u0007\u0000\u0000\u0000\u0003ဇ\u001b\u001bဇ\u0016\u001fဇ\u001e$ဇ\u0004%ဇ\u0005(ဇ )ဇ!", new Object[]{"j", "k", "e", "d", "f", "b", "c", "g", "h"});
            case 3:
                return new aujq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aujq.class) {
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
