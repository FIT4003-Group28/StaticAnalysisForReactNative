package defpackage;
/* compiled from: PG */
/* renamed from: atsl  reason: default package */
/* loaded from: classes2.dex */
public final class atsl extends aopi implements aoqv {
    public static final atsl a;
    private static volatile aorb q;
    public int b;
    public avhn d;
    public atqf e;
    public long h;
    public long i;
    public arag k;
    public long o;
    public atsk p;
    private byte r = 2;
    public String c = "";
    public String f = "";
    public String g = "";
    public String j = "";
    public String l = "";
    public String m = "";
    public String n = "";

    static {
        atsl atslVar = new atsl();
        a = atslVar;
        aopi.registerDefaultInstance(atsl.class, atslVar);
    }

    private atsl() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u0011\u000e\u0000\u0000\u0004\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\b\tᐉ\t\nဈ\n\fဈ\u000b\rဈ\f\u0010ဂ\r\u0011ᐉ\u000e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
            case 3:
                return new atsl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = q;
                if (aorbVar == null) {
                    synchronized (atsl.class) {
                        aorbVar = q;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            q = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
