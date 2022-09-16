package defpackage;
/* compiled from: PG */
/* renamed from: tpp  reason: default package */
/* loaded from: classes4.dex */
public final class tpp extends aopi implements aoqv {
    public static final tpp a;
    private static volatile aorb n;
    public int b;
    public int f;
    public int g;
    public long i;
    public aono l;
    public aono m;
    public String c = "";
    public String d = "";
    public String e = "";
    public aopu h = emptyProtobufList();
    public String j = "";
    public aopu k = aopi.emptyProtobufList();

    static {
        tpp tppVar = new tpp();
        a = tppVar;
        aopi.registerDefaultInstance(tpp.class, tppVar);
    }

    private tpp() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001\u0004င\u0003\u0005ဌ\u0004\u0006ဈ\u0002\bဂ\u0005\n\u001a\u000bဉ\u0007\fဈ\u0006\rဉ\b", new Object[]{"b", "c", "h", tpo.class, "d", "f", "g", sml.g, "e", "i", "k", "l", "j", "m"});
            case 3:
                return new tpp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (tpp.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
