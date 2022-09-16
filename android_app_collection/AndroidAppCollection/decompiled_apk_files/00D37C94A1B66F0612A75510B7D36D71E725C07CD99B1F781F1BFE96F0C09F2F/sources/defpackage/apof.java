package defpackage;
/* compiled from: PG */
/* renamed from: apof  reason: default package */
/* loaded from: classes.dex */
public final class apof extends aopi implements aoqv {
    public static final apof a;
    private static volatile aorb m;
    public int b;
    public arag c;
    public arag d;
    public apzg g;
    public aunb h;
    public int j;
    public avhn k;
    private aoux n;
    private byte o = 2;
    public aopu e = emptyProtobufList();
    public aopu f = emptyProtobufList();
    public String i = "";
    public aoob l = aoob.b;

    static {
        apof apofVar = new apof();
        a = apofVar;
        aopi.registerDefaultInstance(apof.class, apofVar);
    }

    private apof() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004Л\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ဈ\u0004\bᐉ\b\tည\u0007\nဌ\u0005\u000bᐉ\u0006", new Object[]{"b", "c", "d", "e", arag.class, "f", avhn.class, "g", "h", "i", "n", "l", "j", apog.a, "k"});
            case 3:
                return new apof();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (apof.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
