package defpackage;
/* compiled from: PG */
/* renamed from: aqdl  reason: default package */
/* loaded from: classes2.dex */
public final class aqdl extends aopi implements aoqv {
    public static final aqdl a;
    private static volatile aorb p;
    public int b;
    public avhn c;
    public aqdk d;
    public aqdk e;
    public aunb f;
    public aunb g;
    public int h;
    public aunb i;
    public apzg j;
    public aunb k;
    public apzg m;
    public aqgw n;
    private aoux q;
    private byte r = 2;
    public aopu l = emptyProtobufList();
    public aoob o = aoob.b;

    static {
        aqdl aqdlVar = new aqdl();
        a = aqdlVar;
        aopi.registerDefaultInstance(aqdl.class, aqdlVar);
    }

    private aqdl() {
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0001\u000b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဋ\u0005\u0006ᐉ\u0007\u0007ᐉ\b\bᐉ\f\tည\r\nЛ\u000bᐉ\u0006\rဉ\u000b\u000eᐉ\u0004\u000fᐉ\t", new Object[]{"b", "c", "d", "e", "f", "h", "j", "k", "q", "o", "l", apzg.class, "i", "n", "g", "m"});
            case 3:
                return new aqdl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (aqdl.class) {
                        aorbVar = p;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            p = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
