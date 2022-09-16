package defpackage;
/* compiled from: PG */
/* renamed from: awsw  reason: default package */
/* loaded from: classes2.dex */
public final class awsw extends aopi implements aoqv {
    public static final awsw a;
    public static final aopg b;
    private static volatile aorb w;
    public int c;
    public awma d;
    public awma e;
    public awmt f;
    public awmt g;
    public awmt h;
    public boolean i;
    public boolean j;
    public boolean l;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    private awmt x;
    private byte y = 2;
    public boolean k = true;
    public aopu m = emptyProtobufList();
    public aopu n = aopi.emptyProtobufList();
    public aopu o = emptyProtobufList();
    public aopu p = emptyProtobufList();

    static {
        awsw awswVar = new awsw();
        a = awswVar;
        aopi.registerDefaultInstance(awsw.class, awswVar);
        b = aopi.newSingularGeneratedExtension(awow.a, awswVar, awswVar, null, 220721894, aosj.MESSAGE, awsw.class);
    }

    private awsw() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.y);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.y = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001\u0016\u0014\u0000\u0004\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\n\u001b\u000bဇ\b\fᐉ\n\r\u001a\u000fЛ\u0010ဇ\f\u0011ဇ\r\u0012ဇ\u000e\u0013\u001b\u0014ဇ\u000f\u0015ဇ\u0010\u0016ဇ\u0011", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "m", awsp.class, "l", "x", "n", "p", awsu.class, "q", "r", "s", "o", awsx.class, "t", "u", "v"});
            case 3:
                return new awsw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = w;
                if (aorbVar == null) {
                    synchronized (awsw.class) {
                        aorbVar = w;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            w = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
