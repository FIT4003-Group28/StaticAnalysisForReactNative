package defpackage;
/* compiled from: PG */
/* renamed from: asku  reason: default package */
/* loaded from: classes2.dex */
public final class asku extends aopd implements aope {
    public static final asku a;
    private static volatile aorb q;
    public Object c;
    public Object e;
    public Object g;
    public int h;
    public arag i;
    public arag j;
    public apok k;
    public apok m;
    public boolean p;
    private int r;
    private arag s;
    private aoux t;
    private apzg u;
    private askt v;
    public int b = 0;
    public int d = 0;
    public int f = 0;
    private byte w = 2;
    public aoob n = aoob.b;
    public aopu o = emptyProtobufList();

    static {
        asku askuVar = new asku();
        a = askuVar;
        aopi.registerDefaultInstance(asku.class, askuVar);
    }

    private asku() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0012\u0003\u0001\u0001\u0018\u0012\u0000\u0001\f\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0005\u0005ᐼ\u0000\u0007ျ\u0002\bᐉ\r\tည\u000e\nᐉ\u0004\u000bᐉ\u000f\fЛ\rဇ\u0010\u000eᐼ\u0001\u000fᐉ\u0011\u0014ြ\u0002\u0015ြ\u0001\u0016ဌ\u0000\u0018ᐼ\u0000", new Object[]{"c", "b", "e", "d", "g", "f", "r", "i", "j", "k", "s", avhn.class, "t", "n", "m", "u", "o", apzg.class, "p", avhu.class, "v", asks.class, askv.class, "h", asev.p, apki.class});
            case 3:
                return new asku();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = q;
                if (aorbVar == null) {
                    synchronized (asku.class) {
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
