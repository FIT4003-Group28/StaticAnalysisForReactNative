package defpackage;
/* compiled from: PG */
/* renamed from: aufe  reason: default package */
/* loaded from: classes2.dex */
public final class aufe extends aopi implements aoqv {
    public static final aufe a;
    private static volatile aorb n;
    public int b;
    public Object d;
    public aunb e;
    public arag h;
    public arag i;
    public aufb j;
    public long k;
    public boolean l;
    public String m;
    private arag o;
    private aoux p;
    private aunb q;
    public int c = 0;
    private byte r = 2;
    public aopu f = emptyProtobufList();
    public aoob g = aoob.b;

    static {
        aufe aufeVar = new aufe();
        a = aufeVar;
        aopi.registerDefaultInstance(aufe.class, aufeVar);
    }

    private aufe() {
        emptyProtobufList();
        this.m = "";
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
                return newMessageInfo(a, "\u0001\r\u0001\u0001\u0001\u0012\r\u0000\u0001\b\u0001ᐉ\u0002\u0002Л\u0003ᐉ\u0003\u0005ည\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\tᐉ\u0007\nဂ\b\rျ\u0000\u000eᐉ\u0001\u000fဇ\u000b\u0010ᐉ\f\u0012ဈ\u000e", new Object[]{"d", "c", "b", "o", "f", aufc.class, "p", "g", "h", "i", "j", "k", "e", "l", "q", "m"});
            case 3:
                return new aufe();
            case 4:
                return new aopa((short[][]) null, (byte[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (aufe.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
