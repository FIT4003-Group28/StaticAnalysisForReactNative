package defpackage;
/* compiled from: PG */
/* renamed from: rqi  reason: default package */
/* loaded from: classes4.dex */
public final class rqi extends aopi implements aoqv {
    public static final rqi a;
    private static volatile aorb i;
    public int b;
    public long e;
    public float f;
    public double g;
    public String c = "";
    public String d = "";
    public aopu h = emptyProtobufList();

    static {
        rqi rqiVar = new rqi();
        a = rqiVar;
        aopi.registerDefaultInstance(rqi.class, rqiVar);
    }

    private rqi() {
    }

    public final void a() {
        aopu aopuVar = this.h;
        if (!aopuVar.c()) {
            this.h = aopi.mutableCopy(aopuVar);
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", rqi.class});
            case 3:
                return new rqi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (rqi.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
