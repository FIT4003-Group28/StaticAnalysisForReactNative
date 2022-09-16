package defpackage;
/* compiled from: PG */
/* renamed from: audk  reason: default package */
/* loaded from: classes2.dex */
public final class audk extends aopd implements aope {
    public static final audk a;
    private static volatile aorb z;
    private arag A;
    private arag B;
    private apmg C;
    private aoux D;
    private aunb E;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public avhn f;
    public arag g;
    public avhn i;
    public arag j;
    public boolean k;
    public apzg m;
    public arag n;
    public apmg p;
    public ates q;
    public aoob r;
    public audj s;
    public asxl t;
    public avxe u;
    public arag v;
    public aopu w;
    public asos x;
    public asos y;
    private byte F = 2;
    public aopu h = emptyProtobufList();
    public String o = "";

    static {
        audk audkVar = new audk();
        a = audkVar;
        aopi.registerDefaultInstance(audk.class, audkVar);
    }

    private audk() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.r = aoob.b;
        this.w = emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.F);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.F = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001b\u0000\u0001\u0001#\u001b\u0000\u0002\u0014\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ဇ\u0007\u0007ᐉ\b\bᐉ\t\tᐉ\u000b\nဈ\f\u000bᐉ\u0011\fᐉ\u0002\u000eᐉ\u0013\u000fည\u0012\u0012ᐉ\n\u0013ᐉ\u000f\u0014ᐉ\r\u0015ᐉ\u000e\u0018Л\u001bဉ\u0015\u001cဉ\u0016\u001eᐉ\u0018\u001fᐉ\u0019 Л!ᐉ\u0005\"ဉ\u001a#ဉ\u001b", new Object[]{"b", "c", "d", "f", "g", "j", "k", "m", "A", "n", "o", "D", "e", "s", "r", "B", "q", "p", "C", "h", avhc.class, "t", "u", "E", "v", "w", aunb.class, "i", "x", "y"});
            case 3:
                return new audk();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = z;
                if (aorbVar == null) {
                    synchronized (audk.class) {
                        aorbVar = z;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            z = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
