package defpackage;
/* compiled from: PG */
/* renamed from: audn  reason: default package */
/* loaded from: classes2.dex */
public final class audn extends aopi implements aoqv {
    public static final audn a;
    private static volatile aorb n;
    public int b;
    public arag d;
    public aueo e;
    public long h;
    public arag i;
    public apzg j;
    public arag k;
    public ates l;
    public aoob m;
    private arag o;
    private arag p;
    private arag q;
    private apdy r;
    private arag s;
    private aoux t;
    private asow u;
    private arag v;
    private apuq w;
    private byte x = 2;
    public String c = "";
    public aopu f = emptyProtobufList();
    public aopu g = emptyProtobufList();

    static {
        audn audnVar = new audn();
        a = audnVar;
        aopi.registerDefaultInstance(audn.class, audnVar);
    }

    private audn() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.m = aoob.b;
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.x);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.x = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001\u0019\u0014\u0000\u0002\u0011\u0001ဈ\u0000\u0002ᐉ\u0001\u0003Л\u0004ဂ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\t\nᐉ\n\fᐉ\u000e\rᐉ\u0004\u000eᐉ\u0010\u000fည\u000f\u0010ᐉ\u0011\u0011ᐉ\b\u0013ᐉ\u000b\u0014ᐉ\u0002\u0017Л\u0018ᐉ\u0012\u0019ᐉ\f", new Object[]{"b", "c", "d", "f", avhn.class, "h", "j", "o", "k", "q", "r", "t", "i", "u", "m", "v", "p", "l", "e", "g", avhc.class, "w", "s"});
            case 3:
                return new audn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (audn.class) {
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
