package defpackage;
/* compiled from: PG */
/* renamed from: avhx  reason: default package */
/* loaded from: classes2.dex */
public final class avhx extends aopi implements aoqv {
    public static final avhx a;
    private static volatile aorb i;
    public int b;
    public apzg f;
    public apzg g;
    private aoux j;
    private byte k = 2;
    public aopu c = emptyProtobufList();
    public String d = "";
    public String e = "";
    public aoob h = aoob.b;

    static {
        avhx avhxVar = new avhx();
        a = avhxVar;
        aopi.registerDefaultInstance(avhx.class, avhxVar);
    }

    private avhx() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\u000b\u0007\u0000\u0001\u0004\u0002Л\u0003ဈ\u0002\u0004ᐉ\n\u0005ᐉ\u000b\u0006ည\f\nᐉ\t\u000bဈ\u0005", new Object[]{"b", "c", avhw.class, "d", "g", "j", "h", "f", "e"});
            case 3:
                return new avhx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (avhx.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
