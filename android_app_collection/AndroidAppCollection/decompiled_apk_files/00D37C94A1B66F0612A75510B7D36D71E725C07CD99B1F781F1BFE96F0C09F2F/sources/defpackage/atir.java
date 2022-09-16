package defpackage;
/* compiled from: PG */
/* renamed from: atir  reason: default package */
/* loaded from: classes2.dex */
public final class atir extends aopi implements aoqv {
    public static final atir a;
    private static volatile aorb q;
    public int b;
    public apzg d;
    public apzg f;
    public apzg g;
    public arag h;
    public boolean i;
    public aunb j;
    public int k;
    public int l;
    public ates m;
    public aunb n;
    public aqgw o;
    private aunb r;
    private aoux s;
    private byte t = 2;
    public aopu c = emptyProtobufList();
    public aopu e = emptyProtobufList();
    public aoob p = aoob.b;

    static {
        atir atirVar = new atir();
        a = atirVar;
        aopi.registerDefaultInstance(atir.class, atirVar);
    }

    private atir() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.t = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0002\u000b\u0001Л\u0002ᐉ\u0000\u0003Л\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ᐉ\n\u0007ᐉ\r\bည\u000e\tᐉ\u0005\nဋ\u0007\u000bဋ\b\fᐉ\t\u000eဉ\f\u000fᐉ\u0001\u0010ᐉ\u0006\u0011ᐉ\u0002", new Object[]{"b", "c", atiq.class, "d", "e", apzg.class, "h", "i", "n", "s", "p", "j", "k", "l", "m", "o", "f", "r", "g"});
            case 3:
                return new atir();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = q;
                if (aorbVar == null) {
                    synchronized (atir.class) {
                        aorbVar = q;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            q = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
