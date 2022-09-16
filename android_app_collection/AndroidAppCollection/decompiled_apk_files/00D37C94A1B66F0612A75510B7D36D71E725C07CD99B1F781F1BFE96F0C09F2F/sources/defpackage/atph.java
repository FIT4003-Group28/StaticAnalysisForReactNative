package defpackage;
/* compiled from: PG */
/* renamed from: atph  reason: default package */
/* loaded from: classes2.dex */
public final class atph extends aopi implements aoqv {
    public static final atph a;
    private static volatile aorb p;
    public int b;
    public Object d;
    public avhn e;
    public avhn f;
    public arag g;
    public arag h;
    public apzg i;
    public apzg j;
    public int k;
    public aoob l;
    public String m;
    public aunb n;
    public apzg o;
    private arag q;
    private arag r;
    private aoux s;
    private apzg t;
    public int c = 0;
    private byte u = 2;

    static {
        atph atphVar = new atph();
        a = atphVar;
        aopi.registerDefaultInstance(atph.class, atphVar);
    }

    private atph() {
        emptyProtobufList();
        this.l = aoob.b;
        this.m = "";
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.u = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0011\u0001\u0001\u0001\u001d\u0011\u0000\u0000\u000e\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\nᐉ\u0007\u000bᐼ\u0000\fᐉ\r\rည\u000e\u000eᐉ\u000f\u000fᐉ\u0003\u0013ဈ\u0012\u0018ᐼ\u0000\u001bᐉ\u0014\u001cဌ\t\u001dᐉ\u0015", new Object[]{"d", "c", "b", "e", "f", "q", "g", "h", "i", "j", ates.class, "s", "l", "t", "r", "m", apzg.class, "n", "k", atdq.u, "o"});
            case 3:
                return new atph();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (atph.class) {
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
