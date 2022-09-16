package defpackage;
/* compiled from: PG */
/* renamed from: angl  reason: default package */
/* loaded from: classes.dex */
public final class angl extends aopi implements aoqv {
    public static final angl a;
    private static volatile aorb e;
    public int b;
    public angk c;
    private byte f = 2;
    public aopu d = emptyProtobufList();

    static {
        angl anglVar = new angl();
        a = anglVar;
        aopi.registerDefaultInstance(angl.class, anglVar);
    }

    private angl() {
    }

    public final void a() {
        aopu aopuVar = this.d;
        if (!aopuVar.c()) {
            this.d = aopi.mutableCopy(aopuVar);
        }
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᔉ\u0000\u0002Л", new Object[]{"b", "c", "d", angk.class});
            case 3:
                return new angl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (angl.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
