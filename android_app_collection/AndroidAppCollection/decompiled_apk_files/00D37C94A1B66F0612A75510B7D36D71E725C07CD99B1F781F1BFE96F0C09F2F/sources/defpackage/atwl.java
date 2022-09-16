package defpackage;
/* compiled from: PG */
/* renamed from: atwl  reason: default package */
/* loaded from: classes2.dex */
public final class atwl extends aopi implements aoqv {
    public static final atwl a;
    public static final aopg b;
    private static volatile aorb h;
    public int c;
    public int d;
    public apzg e;
    public apzg f;
    public apzg g;
    private apzg i;
    private byte j = 2;

    static {
        atwl atwlVar = new atwl();
        a = atwlVar;
        aopi.registerDefaultInstance(atwl.class, atwlVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, atwlVar, atwlVar, null, 155595733, aosj.MESSAGE, atwl.class);
    }

    private atwl() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.j = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0004\u0002ᐉ\u0001\u0003ဌ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"c", "i", "d", arpt.i, "e", "f", "g"});
            case 3:
                return new atwl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (atwl.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
