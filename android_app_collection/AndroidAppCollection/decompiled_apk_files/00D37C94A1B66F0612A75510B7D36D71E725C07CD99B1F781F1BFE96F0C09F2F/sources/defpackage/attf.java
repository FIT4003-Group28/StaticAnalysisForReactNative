package defpackage;
/* compiled from: PG */
/* renamed from: attf  reason: default package */
/* loaded from: classes2.dex */
public final class attf extends aopi implements aoqv {
    public static final attf a;
    private static volatile aorb i;
    public int b;
    public int e;
    public float g;
    public boolean h;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        attf attfVar = new attf();
        a = attfVar;
        aopi.registerDefaultInstance(attf.class, attfVar);
    }

    private attf() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0005ဈ\u0003\u0007ခ\u0004\bဇ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new attf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (attf.class) {
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
