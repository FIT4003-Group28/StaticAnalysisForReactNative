package defpackage;
/* compiled from: PG */
/* renamed from: aoyl  reason: default package */
/* loaded from: classes.dex */
public final class aoyl extends aopi implements aoqv {
    public static final aoyl a;
    private static volatile aorb p;
    public int b;
    public Object d;
    public arag e;
    public avhn f;
    public arhs g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public apzg m;
    private aoux q;
    public int c = 0;
    private byte r = 2;
    public aopu n = emptyProtobufList();
    public aoob o = aoob.b;

    static {
        aoyl aoylVar = new aoyl();
        a = aoylVar;
        aopi.registerDefaultInstance(aoyl.class, aoylVar);
    }

    private aoyl() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0001\u0001\u0001\u000e\r\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ှ\u0000\u0004ဋ\u0005\u0005ᐉ\t\u0006ᐉ\n\u0007ည\u000b\bဋ\u0006\tဋ\b\nЛ\fᐉ\u0002\rဋ\u0004\u000eဋ\u0007", new Object[]{"d", "c", "b", "e", "f", "i", "m", "q", "o", "j", "l", "n", apzg.class, "g", "h", "k"});
            case 3:
                return new aoyl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (aoyl.class) {
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
