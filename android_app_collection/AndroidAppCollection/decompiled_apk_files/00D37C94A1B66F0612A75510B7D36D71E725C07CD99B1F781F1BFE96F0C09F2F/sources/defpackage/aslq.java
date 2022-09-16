package defpackage;
/* compiled from: PG */
/* renamed from: aslq  reason: default package */
/* loaded from: classes2.dex */
public final class aslq extends aopd implements aope {
    public static final aslq a;
    public static final aopg b;
    private static volatile aorb n;
    public int c;
    public aslo d;
    public aslm g;
    public boolean i;
    public aqtd j;
    public int k;
    private aoux o;
    private byte p = 2;
    public aopu e = emptyProtobufList();
    public aopu f = emptyProtobufList();
    public String h = "";
    public aoob m = aoob.b;

    static {
        aslq aslqVar = new aslq();
        a = aslqVar;
        aopi.registerDefaultInstance(aslq.class, aslqVar);
        b = aopi.newSingularGeneratedExtension(auna.a, aslqVar, aslqVar, null, 50195462, aosj.MESSAGE, aslq.class);
    }

    private aslq() {
    }

    public final void a() {
        aopu aopuVar = this.e;
        if (!aopuVar.c()) {
            this.e = aopi.mutableCopy(aopuVar);
        }
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.p = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0004\u0001Л\u0002Л\u0003ᐉ\t\u0004ည\n\u0005ᐉ\u0000\u0006ဉ\u0002\u0007ဈ\u0003\bဇ\u0004\tဋ\u0006\nဉ\u0005", new Object[]{"c", "e", aslt.class, "f", asls.class, "o", "m", "d", "g", "h", "i", "k", "j"});
            case 3:
                return new aslq();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (aslq.class) {
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

    public final void e() {
        aopu aopuVar = this.f;
        if (!aopuVar.c()) {
            this.f = aopi.mutableCopy(aopuVar);
        }
    }
}
