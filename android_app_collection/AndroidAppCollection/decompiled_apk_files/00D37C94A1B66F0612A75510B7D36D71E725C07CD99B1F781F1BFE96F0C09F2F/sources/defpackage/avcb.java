package defpackage;
/* compiled from: PG */
/* renamed from: avcb  reason: default package */
/* loaded from: classes2.dex */
public final class avcb extends aopi implements aoqv {
    public static final avcb a;
    public static final aopg b;
    private static volatile aorb j;
    public int c;
    public Object e;
    public int g;
    public boolean h;
    public boolean i;
    public int d = 0;
    private byte k = 2;
    public String f = "";

    static {
        avcb avcbVar = new avcb();
        a = avcbVar;
        aopi.registerDefaultInstance(avcb.class, avcbVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, avcbVar, avcbVar, null, 256, aosj.MESSAGE, avcb.class);
    }

    private avcb() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ျ\u0000\u0003ᐼ\u0000\u0004ဌ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"e", "d", "c", "f", aqup.class, "g", avcc.a(), "h", "i"});
            case 3:
                return new avcb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (avcb.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
