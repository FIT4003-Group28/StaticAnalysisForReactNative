package defpackage;
/* compiled from: PG */
/* renamed from: awrl */
/* loaded from: classes2.dex */
public final class awrl extends aopi implements aoqv {
    private static final awrl a;
    private static volatile aorb b;
    private int c;
    private awrg d;
    private awqm e;
    private byte f = 2;

    static {
        awrl awrlVar = new awrl();
        a = awrlVar;
        aopi.registerDefaultInstance(awrl.class, awrlVar);
    }

    private awrl() {
    }

    public static awrk a() {
        return (awrk) a.createBuilder();
    }

    public static /* synthetic */ awrl b() {
        return a;
    }

    public void e(awrg awrgVar) {
        this.d = awrgVar;
        this.c |= 1;
    }

    public void f(awqm awqmVar) {
        this.e = awqmVar;
        this.c |= 2;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new awrl();
            case 4:
                return new awrk();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awrl.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
