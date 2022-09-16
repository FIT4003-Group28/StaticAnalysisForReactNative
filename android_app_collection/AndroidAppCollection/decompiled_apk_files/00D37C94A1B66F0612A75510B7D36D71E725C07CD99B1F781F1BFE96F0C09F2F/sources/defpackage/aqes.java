package defpackage;
/* compiled from: PG */
/* renamed from: aqes  reason: default package */
/* loaded from: classes2.dex */
public final class aqes extends aopi implements aoqv {
    public static final aqes a;
    private static volatile aorb f;
    public int b;
    public aqet c;
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();

    static {
        aqes aqesVar = new aqes();
        a = aqesVar;
        aopi.registerDefaultInstance(aqes.class, aqesVar);
    }

    private aqes() {
    }

    public final void a() {
        aopu aopuVar = this.e;
        if (!aopuVar.c()) {
            this.e = aopi.mutableCopy(aopuVar);
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"b", "c", "d", aqet.class, "e", aqer.class});
            case 3:
                return new aqes();
            case 4:
                return new aopa((float[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqes.class) {
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
