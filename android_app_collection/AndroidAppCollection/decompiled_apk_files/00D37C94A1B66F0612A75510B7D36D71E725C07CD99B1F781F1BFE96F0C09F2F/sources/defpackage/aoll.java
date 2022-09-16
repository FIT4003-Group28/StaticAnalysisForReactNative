package defpackage;
/* compiled from: PG */
/* renamed from: aoll  reason: default package */
/* loaded from: classes.dex */
public final class aoll extends aopi implements aoqv {
    public static final aoll a;
    private static volatile aorb s;
    public int b;
    public float c;
    public int d;
    public int j;
    public int o;
    public aomg q;
    public aomm r;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String k = "";
    public String l = "";
    public aopu m = emptyProtobufList();
    public aopu n = emptyProtobufList();
    public String p = "";

    static {
        aoll aollVar = new aoll();
        a = aollVar;
        aopi.registerDefaultInstance(aoll.class, aollVar);
    }

    private aoll() {
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
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0002\u0011\u0010\u0000\u0002\u0000\u0002ခ\u0000\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0006\u0007င\u0007\bဈ\b\tဌ\u0001\nဈ\u0002\u000bဈ\t\f\u001b\r\u001b\u000eဌ\n\u000fဈ\u000b\u0010ဉ\f\u0011ဉ\r", new Object[]{"b", "c", "f", "g", "h", "i", "j", "k", "d", aoli.e, "e", "l", "m", aolj.class, "n", aolk.class, "o", aoli.a, "p", "q", "r"});
            case 3:
                return new aoll();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = s;
                if (aorbVar == null) {
                    synchronized (aoll.class) {
                        aorbVar = s;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            s = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
