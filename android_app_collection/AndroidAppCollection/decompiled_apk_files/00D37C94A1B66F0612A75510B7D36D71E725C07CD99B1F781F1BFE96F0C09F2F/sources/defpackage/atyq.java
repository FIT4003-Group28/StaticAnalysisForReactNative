package defpackage;
/* compiled from: PG */
/* renamed from: atyq  reason: default package */
/* loaded from: classes2.dex */
public final class atyq extends aopi implements aoqv {
    public static final atyq a;
    public static final aopg b;
    private static volatile aorb m;
    public int c;
    public long g;
    public long h;
    public String d = "";
    public aoob e = aoob.b;
    public String f = "";
    public String i = "";
    public aopu j = aopi.emptyProtobufList();
    public String k = "";
    public String l = "";

    static {
        atyq atyqVar = new atyq();
        a = atyqVar;
        aopi.registerDefaultInstance(atyq.class, atyqVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, atyqVar, atyqVar, null, 119, aosj.MESSAGE, atyq.class);
    }

    private atyq() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဂ\u0003\u0004ဈ\u0005\u0005\u001a\u0006ဈ\u0006\u0007ဈ\u0007\bဈ\u0002\tဂ\u0004", new Object[]{"c", "d", "e", "g", "i", "j", "k", "l", "f", "h"});
            case 3:
                return new atyq();
            case 4:
                return new aopa((int[][][]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (atyq.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
