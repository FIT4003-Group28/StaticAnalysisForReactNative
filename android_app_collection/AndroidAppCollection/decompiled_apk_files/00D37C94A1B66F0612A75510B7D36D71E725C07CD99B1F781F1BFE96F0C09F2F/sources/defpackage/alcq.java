package defpackage;
/* compiled from: PG */
/* renamed from: alcq  reason: default package */
/* loaded from: classes.dex */
public final class alcq extends aopi implements aoqv {
    public static final alcq a;
    private static volatile aorb i;
    public int b;
    public int c;
    public String d = "";
    public long e;
    public long f;
    public long g;
    public long h;

    static {
        alcq alcqVar = new alcq();
        a = alcqVar;
        aopi.registerDefaultInstance(alcq.class, alcqVar);
    }

    private alcq() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004\u0006ဃ\u0005", new Object[]{"b", "c", adzd.d, "d", "e", "f", "g", "h"});
            case 3:
                return new alcq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (alcq.class) {
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
