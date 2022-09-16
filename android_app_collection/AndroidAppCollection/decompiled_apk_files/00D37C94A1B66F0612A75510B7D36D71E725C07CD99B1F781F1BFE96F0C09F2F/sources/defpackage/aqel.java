package defpackage;
/* compiled from: PG */
/* renamed from: aqel  reason: default package */
/* loaded from: classes2.dex */
public final class aqel extends aopd implements aope {
    public static final aqel a;
    private static volatile aorb o;
    public int b;
    public Object d;
    public arag e;
    public arag f;
    public apzg g;
    public apzg h;
    public apok i;
    public apok j;
    public apzg k;
    public boolean m;
    public aoob n;
    private aunb p;
    private aoux q;
    public int c = 0;
    private byte r = 2;

    static {
        aqel aqelVar = new aqel();
        a = aqelVar;
        aopi.registerDefaultInstance(aqel.class, aqelVar);
    }

    private aqel() {
        emptyProtobufList();
        this.n = aoob.b;
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
                return newMessageInfo(a, "\u0001\r\u0001\u0001\u0001\u000f\r\u0000\u0000\u000b\u0001ᐼ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\b\bᐉ\r\tည\u000e\fᐉ\u0007\rᐼ\u0000\u000eဇ\n\u000fᐉ\u000b", new Object[]{"d", "c", "b", avhn.class, "e", "f", "g", "h", "i", "k", "q", "n", "j", arhs.class, "m", "p"});
            case 3:
                return new aqel();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (aqel.class) {
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
