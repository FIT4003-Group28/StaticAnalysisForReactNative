package defpackage;
/* compiled from: PG */
/* renamed from: aoty  reason: default package */
/* loaded from: classes.dex */
public final class aoty extends aopi implements aoqv {
    public static final aoty a;
    private static volatile aorb i;
    public int b;
    public int c;
    public int d;
    public String e;
    public int f;
    public String g;
    public String h;

    static {
        aoty aotyVar = new aoty();
        a = aotyVar;
        aopi.registerDefaultInstance(aoty.class, aotyVar);
    }

    private aoty() {
        emptyIntList();
        this.e = "";
        this.g = "";
        this.h = "";
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0001\u0005ဈ\u0003\u0006ဌ\u0004\u0007ဈ\u0005\bဈ\u0006", new Object[]{"b", "c", aots.a(), "d", aots.a(), "e", "f", aotp.a(), "g", "h"});
            case 3:
                return new aoty();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aoty.class) {
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
