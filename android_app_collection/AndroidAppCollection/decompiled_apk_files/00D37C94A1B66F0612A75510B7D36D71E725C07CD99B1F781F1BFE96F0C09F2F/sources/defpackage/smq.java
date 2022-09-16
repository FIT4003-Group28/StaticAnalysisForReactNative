package defpackage;
/* compiled from: PG */
/* renamed from: smq  reason: default package */
/* loaded from: classes4.dex */
public final class smq extends aopi implements aoqv {
    public static final smq a;
    private static volatile aorb i;
    public int b;
    public int c;
    public smp e;
    public int g;
    public smo h;
    public String d = "";
    public String f = "";

    static {
        smq smqVar = new smq();
        a = smqVar;
        aopi.registerDefaultInstance(smq.class, smqVar);
    }

    private smq() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\n\u0006\u0000\u0000\u0000\u0003ဌ\u0000\u0004ဈ\u0001\u0005ဉ\u0002\bဈ\u0004\tင\u0005\nဉ\u0006", new Object[]{"b", "c", sml.c, "d", "e", "f", "g", "h"});
            case 3:
                return new smq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (smq.class) {
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
