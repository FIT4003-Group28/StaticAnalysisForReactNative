package defpackage;
/* compiled from: PG */
/* renamed from: auwf  reason: default package */
/* loaded from: classes2.dex */
public final class auwf extends aopi implements aoqv {
    public static final auwf a;
    private static volatile aorb f;
    public int b;
    public arag c;
    public int d;
    private byte g = 2;
    public String e = "";

    static {
        auwf auwfVar = new auwf();
        a = auwfVar;
        aopi.registerDefaultInstance(auwf.class, auwfVar);
    }

    private auwf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", auwh.b, "e"});
            case 3:
                return new auwf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (auwf.class) {
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
