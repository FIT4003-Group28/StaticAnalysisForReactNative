package defpackage;
/* compiled from: PG */
/* renamed from: awtq  reason: default package */
/* loaded from: classes2.dex */
public final class awtq extends aopi implements aoqv {
    public static final awtq a;
    private static volatile aorb l;
    public int b;
    public int g;
    public long h;
    public awtu i;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String j = "";
    public String k = "";

    static {
        awtq awtqVar = new awtq();
        a = awtqVar;
        aopi.registerDefaultInstance(awtq.class, awtqVar);
    }

    private awtq() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0006ဃ\u0005\u0007ဉ\u0006\bဈ\u0007\tဈ\b", new Object[]{"b", "c", "d", "e", "f", "g", awsi.e, "h", "i", "j", "k"});
            case 3:
                return new awtq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (awtq.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
