package defpackage;
/* compiled from: PG */
/* renamed from: apdx  reason: default package */
/* loaded from: classes.dex */
public final class apdx extends aopi implements aoqv {
    public static final apdx a;
    private static volatile aorb e;
    public int b;
    public int c;
    public arag d;
    private apzg f;
    private byte g = 2;

    static {
        apdx apdxVar = new apdx();
        a = apdxVar;
        aopi.registerDefaultInstance(apdx.class, apdxVar);
    }

    private apdx() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", aoxm.r, "d", "f"});
            case 3:
                return new apdx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (apdx.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
