package defpackage;
/* compiled from: PG */
/* renamed from: ashm  reason: default package */
/* loaded from: classes2.dex */
public final class ashm extends aopi implements aoqv {
    public static final ashm a;
    private static volatile aorb o;
    public int b;
    public aroy c;
    public arny j;
    public apwg n;
    private byte p = 2;
    public String d = "";
    public aoob e = aoob.b;
    public String f = "";
    public String g = "";
    public aoob h = aoob.b;
    public String i = "";
    public aoob k = aoob.b;
    public aoob l = aoob.b;
    public String m = "";

    static {
        ashm ashmVar = new ashm();
        a = ashmVar;
        aopi.registerDefaultInstance(ashm.class, ashmVar);
    }

    private ashm() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0005ᐉ\u0007\u0006ည\b\u0007ည\t\bည\u0002\tဈ\n\nည\u0005\u000bဈ\u0006\fဉ\u000b", new Object[]{"b", "c", "d", "f", "g", "j", "k", "l", "e", "m", "h", "i", "n"});
            case 3:
                return new ashm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (ashm.class) {
                        aorbVar = o;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            o = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
