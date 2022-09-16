package defpackage;
/* compiled from: PG */
/* renamed from: aqei  reason: default package */
/* loaded from: classes2.dex */
public final class aqei extends aopd implements aope {
    public static final aqei a;
    private static volatile aorb q;
    public int b;
    public aueo d;
    public avhn f;
    public arag g;
    public arag h;
    public arag i;
    public arag j;
    public apzg k;
    public aoob m;
    public ates n;
    public aqeh o;
    public aucf p;
    private arag r;
    private arag s;
    private aoux t;
    private asow u;
    private arag v;
    private arcq w;
    private aquz x;
    private byte y = 2;
    public String c = "";
    public aopu e = emptyProtobufList();

    static {
        aqei aqeiVar = new aqei();
        a = aqeiVar;
        aopi.registerDefaultInstance(aqei.class, aqeiVar);
    }

    private aqei() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.m = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.y);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.y = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001\u001b\u0014\u0000\u0001\u0011\u0001ဈ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ᐉ\b\bᐉ\t\tᐉ\u0007\nᐉ\r\u000bᐉ\u000f\fည\u000e\u000fᐉ\u0010\u0011ᐉ\u0013\u0012ᐉ\u0011\u0014ᐉ\u0001\u0015ᐉ\u0005\u0017ᐉ\u0012\u0018ᐉ\u0014\u0019Л\u001bဉ\u0015", new Object[]{"b", "c", "f", "g", "h", "i", "k", "s", "j", "t", "u", "m", "v", "o", "n", "d", "r", "w", "x", "e", avhc.class, "p"});
            case 3:
                return new aqei();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = q;
                if (aorbVar == null) {
                    synchronized (aqei.class) {
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
