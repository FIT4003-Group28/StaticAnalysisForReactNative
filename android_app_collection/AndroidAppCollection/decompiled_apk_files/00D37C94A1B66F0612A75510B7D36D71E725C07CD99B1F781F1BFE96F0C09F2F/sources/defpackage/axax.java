package defpackage;
/* compiled from: PG */
/* renamed from: axax  reason: default package */
/* loaded from: classes2.dex */
public final class axax extends aopi implements aoqv {
    public static final axax a;
    private static volatile aorb g;
    public int b;
    public Object d;
    public int e;
    public int c = 0;
    public aopu f = emptyProtobufList();

    static {
        axax axaxVar = new axax();
        a = axaxVar;
        aopi.registerDefaultInstance(axax.class, axaxVar);
    }

    private axax() {
    }

    public final void a() {
        aopu aopuVar = this.f;
        if (!aopuVar.c()) {
            this.f = aopi.mutableCopy(aopuVar);
        }
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ြ\u0000\u0003\u001b\u0004ြ\u0000", new Object[]{"d", "c", "b", "e", awsi.s, axau.class, "f", axav.class, axaw.class});
            case 3:
                return new axax();
            case 4:
                return new aopa((byte[]) null, (float[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (axax.class) {
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
