package defpackage;
/* compiled from: PG */
/* renamed from: angf  reason: default package */
/* loaded from: classes.dex */
public final class angf extends aopi implements aoqv {
    public static final angf a;
    private static volatile aorb f;
    public int b;
    public int d;
    public angg e;
    private byte g = 2;
    public int c = -1;

    static {
        angf angfVar = new angf();
        a = angfVar;
        aopi.registerDefaultInstance(angf.class, angfVar);
    }

    private angf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\r\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0003\rᐉ\u000b", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new angf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (angf.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
