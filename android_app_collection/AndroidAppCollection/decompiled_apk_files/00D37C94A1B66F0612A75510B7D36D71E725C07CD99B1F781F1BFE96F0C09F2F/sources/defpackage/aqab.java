package defpackage;
/* compiled from: PG */
/* renamed from: aqab  reason: default package */
/* loaded from: classes2.dex */
public final class aqab extends aopi implements aoqv {
    public static final aqab a;
    private static volatile aorb s;
    public int b;
    public boolean h;
    public apzg i;
    public apzg j;
    public boolean l;
    public apzg n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    private byte t = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public aopu f = emptyProtobufList();
    public String g = "";
    public String k = "";
    public String m = "";

    static {
        aqab aqabVar = new aqab();
        a = aqabVar;
        aopi.registerDefaultInstance(aqab.class, aqabVar);
    }

    private aqab() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.t = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0001\u0003\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005ဈ\u0003\u0006ဇ\u0004\u0007ဈ\u0007\bဇ\b\tဈ\t\nᐉ\u0005\u000bᐉ\u0006\fᐉ\n\rဇ\u000b\u000eဇ\f\u000fဇ\r\u0011ဇ\u000e", new Object[]{"b", "c", "d", "e", "f", awsp.class, "g", "h", "k", "l", "m", "i", "j", "n", "o", "p", "q", "r"});
            case 3:
                return new aqab();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = s;
                if (aorbVar == null) {
                    synchronized (aqab.class) {
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
