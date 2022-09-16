package defpackage;
/* compiled from: PG */
/* renamed from: gft  reason: default package */
/* loaded from: classes3.dex */
public final class gft extends aopi implements aoqv {
    public static final gft a;
    private static volatile aorb i;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public String f = "APPEARANCE_SYSTEM";
    public boolean g;
    public boolean h;

    static {
        gft gftVar = new gft();
        a = gftVar;
        aopi.registerDefaultInstance(gft.class, gftVar);
    }

    private gft() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new gft();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (gft.class) {
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
