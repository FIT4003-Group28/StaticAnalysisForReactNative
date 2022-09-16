package defpackage;
/* compiled from: PG */
/* renamed from: awim  reason: default package */
/* loaded from: classes2.dex */
public final class awim extends aopi implements aoqv {
    public static final awim a;
    private static volatile aorb f;
    public int b;
    public arag c;
    public apzg e;
    private aoux g;
    private byte h = 2;
    public String d = "";

    static {
        awim awimVar = new awim();
        a = awimVar;
        aopi.registerDefaultInstance(awim.class, awimVar);
    }

    private awim() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0003\u0004ဈ\u0001\u0005ᐉ\u0002", new Object[]{"b", "c", "g", "d", "e"});
            case 3:
                return new awim();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awim.class) {
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
