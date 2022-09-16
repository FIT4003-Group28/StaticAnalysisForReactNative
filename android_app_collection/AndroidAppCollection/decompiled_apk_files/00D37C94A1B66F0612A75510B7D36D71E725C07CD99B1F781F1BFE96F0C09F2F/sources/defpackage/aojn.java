package defpackage;
/* compiled from: PG */
/* renamed from: aojn  reason: default package */
/* loaded from: classes.dex */
public final class aojn extends aopi implements aoqv {
    public static final aojn a;
    private static volatile aorb r;
    public int b;
    public float c;
    public int d;
    public int j;
    public int n;
    public aojm p;
    public int q;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String k = "";
    public aopu l = emptyProtobufList();
    public aopu m = emptyProtobufList();
    public String o = "";

    static {
        aojn aojnVar = new aojn();
        a = aojnVar;
        aopi.registerDefaultInstance(aojn.class, aojnVar);
    }

    private aojn() {
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0011\u000f\u0000\u0002\u0000\u0002ခ\u0000\u0003ဌ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\tင\u0007\nဈ\b\f\u001b\r\u001b\u000eဌ\n\u000fဈ\u000b\u0010ဉ\f\u0011ဌ\r", new Object[]{"b", "c", "d", anfo.r, "e", "f", "g", "h", "i", "j", "k", "l", aoit.class, "m", aois.class, "n", aoix.i, "o", "p", "q", aoix.k});
            case 3:
                return new aojn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = r;
                if (aorbVar == null) {
                    synchronized (aojn.class) {
                        aorbVar = r;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            r = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
