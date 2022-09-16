package defpackage;
/* compiled from: PG */
/* renamed from: aojy  reason: default package */
/* loaded from: classes.dex */
public final class aojy extends aopi implements aoqv {
    public static final aojy a;
    private static volatile aorb m;
    public int b;
    public int c;
    public int e;
    public int g;
    public aoit h;
    public aois i;
    public aojp j;
    public int k;
    public int l;
    public String d = "";
    public aopu f = emptyProtobufList();

    static {
        aojy aojyVar = new aojy();
        a = aojyVar;
        aopi.registerDefaultInstance(aojy.class, aojyVar);
    }

    private aojy() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\"\n\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0005ဉ\u0005\u0006ဉ\u0006\tဌ\u0002\nဌ\n\f\u001b\rဌ\u000b\u000eဉ\t\"ဌ\u0004", new Object[]{"b", "c", aojw.b(), "d", "h", "i", "e", aoix.n, "k", aoix.o, "f", aojx.class, "l", aojl.b(), "j", "g", aoix.b});
            case 3:
                return new aojy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (aojy.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
