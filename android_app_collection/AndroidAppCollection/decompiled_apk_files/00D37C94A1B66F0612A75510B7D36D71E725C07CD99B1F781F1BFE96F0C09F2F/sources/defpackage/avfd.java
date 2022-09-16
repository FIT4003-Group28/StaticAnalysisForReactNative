package defpackage;
/* compiled from: PG */
/* renamed from: avfd  reason: default package */
/* loaded from: classes2.dex */
public final class avfd extends aopi implements aoqv {
    public static final avfd a;
    private static volatile aorb s;
    public boolean b;
    public boolean c;
    public float d = 1.0f;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public boolean r;
    private int t;

    static {
        avfd avfdVar = new avfd();
        a = avfdVar;
        aopi.registerDefaultInstance(avfd.class, avfdVar);
    }

    private avfd() {
        aopi.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001\u0016\u0011\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0005\u0003ဇ\u0006\u0004င\u0007\u0005ဇ\u0001\u0006ဇ\u0003\u0007ခ\u0002\bဇ\b\nဇ\t\u000bဇ\u000b\fဇ\u000e\rဇ\u000f\u0010ဇ\n\u0011ဇ\u0011\u0012င\u0012\u0013ဇ\f\u0016ဇ\u0014", new Object[]{"t", "b", "f", "g", "h", "c", "e", "d", "i", "j", "l", "n", "o", "k", "p", "q", "m", "r"});
            case 3:
                return new avfd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = s;
                if (aorbVar == null) {
                    synchronized (avfd.class) {
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
