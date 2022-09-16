package defpackage;
/* compiled from: PG */
/* renamed from: awtp  reason: default package */
/* loaded from: classes2.dex */
public final class awtp extends aopi implements aoqv {
    public static final awtp a;
    private static volatile aorb f;
    public int b;
    public awtq d;
    public aoqp e = aoqp.a;
    public String c = "";

    static {
        awtp awtpVar = new awtp();
        a = awtpVar;
        aopi.registerDefaultInstance(awtp.class, awtpVar);
    }

    private awtp() {
    }

    public final aoqp a() {
        aoqp aoqpVar = this.e;
        if (!aoqpVar.b) {
            this.e = aoqpVar.a();
        }
        return this.e;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u00032", new Object[]{"b", "c", "d", "e", awto.a});
            case 3:
                return new awtp();
            case 4:
                return new aopa((boolean[]) null, (short[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awtp.class) {
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
