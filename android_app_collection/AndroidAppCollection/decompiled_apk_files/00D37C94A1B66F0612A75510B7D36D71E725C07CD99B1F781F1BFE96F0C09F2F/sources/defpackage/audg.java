package defpackage;
/* compiled from: PG */
/* renamed from: audg  reason: default package */
/* loaded from: classes2.dex */
public final class audg extends aopd implements aope {
    private static volatile aorb C;
    public static final audg a;
    public static final aopg b;
    public apon A;
    public arhs B;
    private apzg D;
    private arag E;
    private aoux F;
    private apja G;
    private arag H;
    private audc I;

    /* renamed from: J  reason: collision with root package name */
    private audi f117J;
    private apzg K;
    public int c;
    public int d;
    public Object f;
    public arag h;
    public int j;
    public int m;
    public arag n;
    public arag o;
    public arag p;
    public arag q;
    public boolean r;
    public asow u;
    public int w;
    public aopu x;
    public aude y;
    public ates z;
    public int e = 0;
    private byte L = 2;
    public String g = "";
    public aopu i = emptyProtobufList();
    public String k = "";
    public String s = "";
    public aoob t = aoob.b;
    public aopu v = emptyProtobufList();

    static {
        audg audgVar = new audg();
        a = audgVar;
        aopi.registerDefaultInstance(audg.class, audgVar);
        b = aopi.newSingularGeneratedExtension(auna.a, audgVar, audgVar, null, 50631000, aosj.MESSAGE, audg.class);
    }

    private audg() {
        emptyProtobufList();
        this.x = emptyProtobufList();
    }

    public final void a() {
        aopu aopuVar = this.i;
        if (!aopuVar.c()) {
            this.i = aopi.mutableCopy(aopuVar);
        }
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.L);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.L = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001e\u0001\u0002\u0001'\u001e\u0000\u0003\u0016\u0001ဈ\u0000\u0002Л\u0003င\u0003\u0005ဈ\u0005\u0006င\u0006\u0007ᐉ\t\bဇ\f\nᐉ\u0011\rဈ\u0010\u000eᐉ\u0013\u000fЛ\u0010ᐉ\n\u0011ᐉ\u000b\u0012ᐉ\u0007\u0013ဌ\u0014\u0014ည\u0012\u0016ᐉ\u0001\u0018ᐉ\u0002\u0019ᐉ\u0015\u001aᐉ\u0016\u001cᐉ\u0017\u001dᐉ\u0018\u001eᐉ\u0019\u001fᐉ\u001a ᐉ\u001b\"ᐼ\u0000#Л$ᐉ\b%ᐉ\u001e'ᐉ ", new Object[]{"f", "e", "c", "d", "g", "i", audf.class, "j", "k", "m", "o", "r", "F", "s", "u", "v", audl.class, "p", "q", "n", "w", auca.g, "t", "h", "D", "y", "z", "G", "H", "I", "A", "J", aunb.class, "x", aplw.class, "E", "K", "B"});
            case 3:
                return new audg();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = C;
                if (aorbVar == null) {
                    synchronized (audg.class) {
                        aorbVar = C;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            C = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
