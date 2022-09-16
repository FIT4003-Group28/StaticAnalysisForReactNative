package defpackage;
/* compiled from: PG */
/* renamed from: awky  reason: default package */
/* loaded from: classes2.dex */
public final class awky extends aopi implements aoqv {
    public static final awky a;
    public static final aopg b;
    private static volatile aorb s;
    public int c;
    public String e;
    public String f;
    public String g;
    public long h;
    public int i;
    public avhn j;
    public awma k;
    public arag l;
    public long m;
    public long n;
    public long o;
    public String p;
    public awku q;
    public String r;
    private byte t = 2;
    public String d = "";

    static {
        awky awkyVar = new awky();
        a = awkyVar;
        aopi.registerDefaultInstance(awky.class, awkyVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, awkyVar, awkyVar, null, 151, aosj.MESSAGE, awky.class);
    }

    private awky() {
        aoob aoobVar = aoob.b;
        this.e = "";
        this.f = "";
        this.g = "";
        this.p = "";
        this.r = "";
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.t = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0000\u0003\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဃ\u0005\u0007င\u0006\bᐉ\u0007\tᐉ\b\nဃ\n\u000bဃ\u000b\fဃ\f\rဈ\r\u000eဈ\u000f\u000fဉ\u000e\u0010ᐉ\t", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "r", "q", "l"});
            case 3:
                return new awky();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = s;
                if (aorbVar == null) {
                    synchronized (awky.class) {
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
