package defpackage;
/* compiled from: PG */
/* renamed from: awus  reason: default package */
/* loaded from: classes2.dex */
public final class awus extends aopi implements aoqv {
    public static final awus a;
    private static volatile aorb k;
    public int b;
    public aoqp c = aoqp.a;
    public aoqp d = aoqp.a;
    public aoqp e = aoqp.a;
    public aoqp f = aoqp.a;
    public aoqp g = aoqp.a;
    public aoqp h = aoqp.a;
    public aoqp i = aoqp.a;
    public int j;

    static {
        awus awusVar = new awus();
        a = awusVar;
        aopi.registerDefaultInstance(awus.class, awusVar);
    }

    private awus() {
        emptyProtobufList();
    }

    public final aoqp a() {
        aoqp aoqpVar = this.g;
        if (!aoqpVar.b) {
            this.g = aoqpVar.a();
        }
        return this.g;
    }

    public final aoqp b() {
        aoqp aoqpVar = this.i;
        if (!aoqpVar.b) {
            this.i = aoqpVar.a();
        }
        return this.i;
    }

    public final aoqp c() {
        aoqp aoqpVar = this.c;
        if (!aoqpVar.b) {
            this.c = aoqpVar.a();
        }
        return this.c;
    }

    public final aoqp d() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0006\r\b\u0007\u0000\u0000\u00062\u00072\b2\t2\n2\u000b2\f2\rင\u0000", new Object[]{"b", "c", awun.a, "d", awuq.a, "e", awuo.a, "f", awur.a, "g", awul.a, "h", awup.a, "i", awum.a, "j"});
            case 3:
                return new awus();
            case 4:
                return new aopa((int[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (awus.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final aoqp e() {
        aoqp aoqpVar = this.h;
        if (!aoqpVar.b) {
            this.h = aoqpVar.a();
        }
        return this.h;
    }

    public final aoqp f() {
        aoqp aoqpVar = this.d;
        if (!aoqpVar.b) {
            this.d = aoqpVar.a();
        }
        return this.d;
    }

    public final aoqp g() {
        aoqp aoqpVar = this.f;
        if (!aoqpVar.b) {
            this.f = aoqpVar.a();
        }
        return this.f;
    }
}
