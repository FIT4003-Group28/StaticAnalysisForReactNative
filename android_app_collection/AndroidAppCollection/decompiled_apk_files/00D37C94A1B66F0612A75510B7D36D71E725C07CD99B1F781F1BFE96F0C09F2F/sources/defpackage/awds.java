package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: awds  reason: default package */
/* loaded from: classes2.dex */
public final class awds extends aopi implements aoqv {
    public static final awds a;
    private static volatile aorb l;
    public int b;
    public arag c;
    public apzg d;
    public awdg f;
    public awdq g;
    public awdn h;
    public boolean i;
    public arag j;
    private ates m;
    private aoux n;
    private byte o = 2;
    public aopu e = emptyProtobufList();
    public aoob k = aoob.b;

    static {
        awds awdsVar = new awds();
        a = awdsVar;
        aopi.registerDefaultInstance(awds.class, awdsVar);
    }

    private awds() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\t\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003Л\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ဇ\u0006\bᐉ\u0007\tᐉ\t\nည\n\u000bᐉ\b", new Object[]{"b", "c", "d", "e", arag.class, "f", "g", "h", "i", "j", "n", "k", "m"});
            case 3:
                return new awds();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (awds.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
