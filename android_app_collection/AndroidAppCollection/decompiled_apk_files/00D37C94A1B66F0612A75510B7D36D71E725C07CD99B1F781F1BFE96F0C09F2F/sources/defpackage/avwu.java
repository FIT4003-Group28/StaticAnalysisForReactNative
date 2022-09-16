package defpackage;
/* compiled from: PG */
/* renamed from: avwu  reason: default package */
/* loaded from: classes2.dex */
public final class avwu extends aopi implements aoqv {
    public static final avwu a;
    private static volatile aorb s;
    public int b;
    public Object d;
    public apaa f;
    public int g;
    public apai h;
    public apzg i;
    public apad j;
    public avws l;
    public apaj o;
    public aoyz p;
    public boolean q;
    public boolean r;
    private arag t;
    private aunb u;
    private aoux v;
    public int c = 0;
    private byte w = 2;
    public aoob e = aoob.b;
    public aopu k = emptyProtobufList();
    public String m = "";
    public aopu n = emptyProtobufList();

    static {
        avwu avwuVar = new avwu();
        a = avwuVar;
        aopi.registerDefaultInstance(avwu.class, avwuVar);
    }

    private avwu() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.w);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.w = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0013\u0001\u0001\u0001\u0019\u0013\u0000\u0002\b\u0001ည\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\bᐉ\u0006\tဉ\b\nЛ\fᐉ\u0007\rᐉ\n\u000eဈ\f\u000fЛ\u0010ᐉ\r\u0011ᐉ\u000b\u0013ဉ\u000f\u0014်\u0000\u0015ᐉ\u0012\u0017်\u0000\u0018ဇ\u0014\u0019ဇ\u0015", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", "j", "k", asmc.class, "t", "l", "m", "n", apbf.class, "o", "u", "p", "v", "q", "r"});
            case 3:
                return new avwu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = s;
                if (aorbVar == null) {
                    synchronized (avwu.class) {
                        aorbVar = s;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            s = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
