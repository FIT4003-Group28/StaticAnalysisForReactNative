package defpackage;
/* compiled from: PG */
/* renamed from: arof  reason: default package */
/* loaded from: classes2.dex */
public final class arof extends aopi implements aoqv {
    public static final arof a;
    private static volatile aorb g;
    public int b;
    public aroy c;
    public long f;
    private byte h = 2;
    public String d = "";
    public String e = "";

    static {
        arof arofVar = new arof();
        a = arofVar;
        aopi.registerDefaultInstance(arof.class, arofVar);
    }

    private arof() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new arof();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arof.class) {
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
