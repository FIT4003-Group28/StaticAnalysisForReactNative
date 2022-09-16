package defpackage;
/* compiled from: PG */
/* renamed from: apgq  reason: default package */
/* loaded from: classes.dex */
public final class apgq extends aopi implements aoqv {
    public static final apgq a;
    private static volatile aorb v;
    public int b;
    public Object d;
    public apgm e;
    public apzg f;
    public apzg g;
    public apzg h;
    public apzg i;
    public apzg j;
    public aoxp o;
    public int p;
    public avqu q;
    public int r;
    public aunb s;
    public aton t;
    public asvv u;
    public int c = 0;
    private byte w = 2;
    public aopu k = emptyProtobufList();
    public aopu l = emptyProtobufList();
    public aopu m = emptyProtobufList();
    public aopt n = emptyLongList();

    static {
        apgq apgqVar = new apgq();
        a = apgqVar;
        aopi.registerDefaultInstance(apgq.class, apgqVar);
    }

    private apgq() {
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
                return newMessageInfo(a, "\u0001\u0012\u0001\u0001\u0001ϧ\u0012\u0000\u0004\r\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005Л\u0006Л\b\u0014\nᐉ\u0006\u0011ᐼ\u0000\u0012ဌ\t\u0016ᐉ\u0005\u0018ဉ\n\u001aင\u000b\u001bᐉ\u0002\u001cЛ\u001dᐉ\f!ဉ\u000eϧᐉ\u000f", new Object[]{"d", "c", "b", "e", "f", "h", "i", "k", apgp.class, "l", apzg.class, "n", "o", apgn.class, "p", apgo.a(), "j", "q", "r", "g", "m", apzg.class, "s", "t", "u"});
            case 3:
                return new apgq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = v;
                if (aorbVar == null) {
                    synchronized (apgq.class) {
                        aorbVar = v;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            v = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
