package defpackage;
/* compiled from: PG */
/* renamed from: arhs  reason: default package */
/* loaded from: classes2.dex */
public final class arhs extends aopd implements aope {
    public static final arhs a;
    private static volatile aorb d;
    public int b;
    public int c;
    private byte e = 2;

    static {
        arhs arhsVar = new arhs();
        a = arhsVar;
        aopi.registerDefaultInstance(arhs.class, arhsVar);
    }

    private arhs() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c", arhr.a()});
            case 3:
                return new arhs();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arhs.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
