package defpackage;
/* compiled from: PG */
/* renamed from: awey  reason: default package */
/* loaded from: classes2.dex */
public final class awey extends aopi implements aoqv {
    public static final awey a;
    private static volatile aorb u;
    public int b;
    public float e;
    public float f;
    public double g;
    public awex h;
    public int k;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public long s;
    public String c = "";
    public String d = "";
    public aoob i = aoob.b;
    public aoob j = aoob.b;
    public float l = 1.0f;
    public String t = "";

    static {
        awey aweyVar = new awey();
        a = aweyVar;
        aopi.registerDefaultInstance(awey.class, aweyVar);
    }

    private awey() {
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
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0001\u001a\u0012\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဉ\u0005\u0006ခ\t\u0007ဌ\n\bဌ\u000b\tင\f\nဇ\r\u000bဇ\u000e\fဇ\u000f\rဂ\u0010\u000eဌ\b\u000fဈ\u0011\u0011က\u0004\u0013ည\u0006\u001aည\u0007", new Object[]{"b", "c", "d", "e", "f", "h", "l", "m", apwf.a(), "n", awbk.j, "o", "p", "q", "r", "s", "k", awbk.k, "t", "g", "i", "j"});
            case 3:
                return new awey();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = u;
                if (aorbVar == null) {
                    synchronized (awey.class) {
                        aorbVar = u;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            u = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
