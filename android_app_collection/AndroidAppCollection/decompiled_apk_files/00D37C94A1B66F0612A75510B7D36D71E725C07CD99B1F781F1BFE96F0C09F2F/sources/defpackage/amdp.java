package defpackage;
/* compiled from: PG */
/* renamed from: amdp  reason: default package */
/* loaded from: classes.dex */
public final class amdp extends aopi implements aoqv {
    public static final amdp a;
    private static volatile aorb e;
    public int b;
    public aoqp d = aoqp.a;
    private byte f = 2;
    public int c = 1;

    static {
        amdp amdpVar = new amdp();
        a = amdpVar;
        aopi.registerDefaultInstance(amdp.class, amdpVar);
    }

    private amdp() {
    }

    public final aoqp a() {
        aoqp aoqpVar = this.d;
        if (!aoqpVar.b) {
            this.d = aoqpVar.a();
        }
        return this.d;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u0001င\u0000\u0002в", new Object[]{"b", "c", "d", amdo.a});
            case 3:
                return new amdp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (amdp.class) {
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
