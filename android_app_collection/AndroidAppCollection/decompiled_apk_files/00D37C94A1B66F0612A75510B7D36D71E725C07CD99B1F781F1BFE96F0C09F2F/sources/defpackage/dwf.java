package defpackage;
/* compiled from: PG */
/* renamed from: dwf  reason: default package */
/* loaded from: classes3.dex */
public final class dwf extends aopd implements aope {
    public static final dwf a;
    private static volatile aorb c;
    private int d;
    private byte e = 2;
    public int b = 1;

    static {
        dwf dwfVar = new dwf();
        a = dwfVar;
        aopi.registerDefaultInstance(dwf.class, dwfVar);
    }

    private dwf() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "b", dnn.g});
            case 3:
                return new dwf();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (dwf.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
