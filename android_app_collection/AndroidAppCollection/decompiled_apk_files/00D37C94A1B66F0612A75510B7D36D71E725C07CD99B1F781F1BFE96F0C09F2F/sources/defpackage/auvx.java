package defpackage;
/* compiled from: PG */
/* renamed from: auvx  reason: default package */
/* loaded from: classes2.dex */
public final class auvx extends aopi implements aoqv {
    public static final auvx a;
    private static volatile aorb g;
    public int b;
    public apzg c;
    public apwe e;
    public avvv f;
    private byte h = 2;
    public String d = "";

    static {
        auvx auvxVar = new auvx();
        a = auvxVar;
        aopi.registerDefaultInstance(auvx.class, auvxVar);
    }

    private auvx() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\t\u0004\u0000\u0000\u0002\u0002ᐉ\u0001\u0006ဈ\u0005\u0007ဉ\u0006\tᐉ\u0007", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new auvx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (auvx.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
