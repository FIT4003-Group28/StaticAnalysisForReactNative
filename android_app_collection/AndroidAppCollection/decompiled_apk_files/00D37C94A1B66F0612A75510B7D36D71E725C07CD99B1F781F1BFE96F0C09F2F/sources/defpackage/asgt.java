package defpackage;
/* compiled from: PG */
/* renamed from: asgt  reason: default package */
/* loaded from: classes2.dex */
public final class asgt extends aopd implements aope {
    public static final asgt a;
    private static volatile aorb z;
    private aoux A;
    private aunb B;
    private aunb C;
    private aunb D;
    private aunb E;
    private aunb F;
    private byte G = 2;
    public int b;
    public arpa c;
    public asgu d;
    public auna e;
    public asgf f;
    public aqfd g;
    public aqfd h;
    public aunb i;
    public asgr j;
    public asgn k;
    public asgv m;
    public apzg n;
    public avhn o;
    public asgq p;
    public aopu q;
    public aopu r;
    public aunb s;
    public aoob t;
    public aopu u;
    public apzg v;
    public apzg w;
    public arbf x;
    public arja y;

    static {
        asgt asgtVar = new asgt();
        a = asgtVar;
        aopi.registerDefaultInstance(asgt.class, asgtVar);
    }

    private asgt() {
        emptyProtobufList();
        this.q = emptyProtobufList();
        this.r = emptyProtobufList();
        this.t = aoob.b;
        this.u = emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.G);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.G = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001c\u0000\u0001\u0001̉\u001c\u0000\u0003\u001b\u0001ᐉ\u0000\u0007ᐉ\u0001\bᐉ\u0002\tᐉ\f\rည\u0011\u000eᐉ\u0005\u000fᐉ\u0006\u0010ᐉ\n\u0011ᐉ\u000b\u0012ᐉ\u0010\u0014ᐉ\t\u0015Л\u0018ᐉ\u000e\u0019Л\u001aᐉ\u0012\u001dᐉ\r\u001eЛ ᐉ\u0013!ᐉ\u0018\"ᐉ\u001a#ᐉ\u001b$ᐉ\u001c%ᐉ\b'ᐉ\u001d(ᐉ\u0007)ᐉ\u001e*ᐉ\u000f̉ᐉ\u0019", new Object[]{"b", "c", "d", "e", "n", "t", "f", "g", "k", "m", "A", "j", "u", apzg.class, "p", "q", aqvm.class, "v", "o", "r", aqvm.class, "w", "B", "C", "D", "E", "i", "F", "h", "y", "s", "x"});
            case 3:
                return new asgt();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = z;
                if (aorbVar == null) {
                    synchronized (asgt.class) {
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
